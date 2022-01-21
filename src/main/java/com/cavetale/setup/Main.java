package com.cavetale.setup;

import java.io.File;
import java.io.PrintStream;
import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class Main {
    private Set<Plugin> specifiedPlugins = EnumSet.noneOf(Plugin.class);
    private Set<Server> specifiedServers = EnumSet.noneOf(Server.class);
    private Set<Category> specifiedCategories = EnumSet.noneOf(Category.class);
    private List<Command> commands = new ArrayList<>();
    private boolean verbose = false;

    public static void main(String[] args) throws Exception {
        try {
            new Main().run(args);
        } catch (AppException ae) {
            System.err.println(ae.getMessage());
            System.exit(1);
            return;
        }
        System.exit(0);
    }

    private void run(String[] args) throws Exception {
        if (args.length == 0) {
            help(System.err);
            return;
        }
        Flag previousFlag = null;
        for (String arg : args) {
            if (arg.startsWith("--")) {
                previousFlag = Flag.of(arg.substring(2));
                if (previousFlag == null) {
                    throw new AppException("Unknown flag: " + arg);
                }
                handleNewFlag(previousFlag);
            } else if (arg.startsWith("-")) {
                for (int i = 1; i < arg.length(); i += 1) {
                    char shortArg = arg.charAt(i);
                    previousFlag = Flag.of(shortArg);
                    if (previousFlag == null) {
                        throw new AppException("Unknown flag: -" + shortArg);
                    }
                    handleNewFlag(previousFlag);
                }
            } else {
                if (previousFlag == null) {
                    Command command = Command.of(arg);
                    if (command == null) {
                        throw new AppException("Unknown command: " + arg);
                    }
                    if (commands.contains(command)) {
                        throw new AppException("Duplicate command: " + arg);
                    }
                    commands.add(command);
                } else {
                    switch (previousFlag) {
                    case SERVER: {
                        Server server = Server.of(arg);
                        if (server == null) {
                            throw new AppException("Unknown server: " + arg);
                        }
                        specifiedServers.add(server);
                        break;
                    }
                    case CATEGORY: {
                        Category category = Category.of(arg);
                        if (category == null) {
                            throw new AppException("Unknown category: " + arg);
                        }
                        specifiedCategories.add(category);
                        break;
                    }
                    case PLUGIN: {
                        Plugin plugin = Plugin.of(arg);
                        if (plugin == null) {
                            throw new AppException("Unknown plugin: " + arg);
                        }
                        specifiedPlugins.add(plugin);
                        break;
                    }
                    default:
                        throw new AppException("Invalid argument for "
                                               + previousFlag.longForm + ": " + arg);
                    }
                }
            }
        }
        if (commands.isEmpty()) {
            throw new AppException("Command expected! See --help");
        }
        if (verbose) {
            System.out.println("Commands: " + commands);
            System.out.println("Specified Plugins " + specifiedPlugins);
            System.out.println("Specified Categories " + specifiedCategories);
            System.out.println("Specified Servers " + specifiedServers);
        }
        int result = 0;
        for (Command command : commands) {
            result = Math.max(result, runCommand(command));
        }
    }

    private int runCommand(Command command) throws AppException {
        switch (command) {
        case PRINT: return print();
        case CHECK: return check();
        case DOWNLOAD: return download();
        default: throw new IllegalStateException("Not implemented: " + command);
        }
    }

    private void handleNewFlag(Flag flag) {
        switch (flag) {
        case HELP:
            help(System.out);
            System.exit(0);
            return;
        case VERBOSE:
            verbose = true;
            return;
        default: break;
        }
    }

    private void help(PrintStream out) {
        out.println("USAGE: java -jar Setup.jar COMMAND FLAGS");
        out.println("COMMANDS");
        for (Command command : Command.values()) {
            out.println("\t" + command.name().toLowerCase()
                        + " - " + command.description);
        }
        out.println("FLAGS");
        for (Flag flag : Flag.values()) {
            out.println("\t--" + flag.longForm + ", -" + flag.shortForm
                        + " - " + flag.description);
        }
    }

    private Set<Plugin> buildPluginSet() {
        Set<Plugin> result = EnumSet.noneOf(Plugin.class);
        result.addAll(specifiedPlugins);
        for (Category category : specifiedCategories) result.addAll(category.getPlugins());
        for (Server server : specifiedServers) result.addAll(server.getPlugins());
        return result;
    }

    private int print() throws AppException {
        Set<Plugin> requiredPlugins = buildPluginSet();
        System.out.println("Total " + requiredPlugins.size()
                           + ": " + Plugin.toString(requiredPlugins));
        return 0;
    }

    private int check() throws AppException {
        Set<Plugin> requiredPlugins = buildPluginSet();
        Set<String> unknownPlugins = new HashSet<>();
        Set<Plugin> presentPlugins = EnumSet.allOf(Plugin.class);
        Set<Plugin> superfluousPlugins = EnumSet.noneOf(Plugin.class);
        for (File file : new File("plugins").listFiles()) {
            String name = file.getName();
            if (!name.endsWith(".jar")) continue;
            name = name.substring(0, name.length() - 4);
            Plugin plugin = Plugin.of(name);
            if (plugin == null) {
                unknownPlugins.add(name);
                continue;
            }
            presentPlugins.add(plugin);
            if (!requiredPlugins.contains(plugin)) {
                superfluousPlugins.add(plugin);
            }
        }
        Set<Plugin> missingPlugins = EnumSet.copyOf(requiredPlugins);
        missingPlugins.removeAll(presentPlugins);
        if (unknownPlugins.isEmpty() && missingPlugins.isEmpty() && superfluousPlugins.isEmpty()) {
            if (verbose) {
                System.out.println("All plugins are in place: "
                                   + Plugin.toString(requiredPlugins));
            }
            return 0;
        }
        if (!missingPlugins.isEmpty()) {
            System.out.println(missingPlugins.size() + " missing: "
                               + Plugin.toString(missingPlugins));
        }
        if (!superfluousPlugins.isEmpty()) {
            System.out.println(superfluousPlugins.size() + " superfluous: "
                               + Plugin.toString(superfluousPlugins));
        }
        if (!unknownPlugins.isEmpty()) {
            System.out.println(unknownPlugins.size() + " unknown: "
                               + String.join(" ", unknownPlugins));
        }
        return 1;
    }

    private int download() throws AppException {
        Set<Plugin> requiredPlugins = buildPluginSet();
        if (verbose) {
            System.out.println("Downloading " + requiredPlugins.size()
                               + ": " + Plugin.toString(requiredPlugins));
        }
        Set<Plugin> alreadyInstalled = EnumSet.noneOf(Plugin.class);
        int failureCount = 0;
        for (Plugin plugin : requiredPlugins) {
            File dest = new File(new File("plugins"), plugin.name + ".jar");
            if (dest.exists()) {
                alreadyInstalled.add(plugin);
                continue;
            }
            if (plugin.downloadUrl == null) {
                failureCount += 1;
                System.err.println("Missing download URL: " + plugin.name);
                continue;
            }
            try {
                Download.to(plugin.downloadUrl, dest);
            } catch (UncheckedIOException ioe) {
                failureCount += 1;
                System.err.println("Failed to download: " + plugin.name);
                if (verbose) ioe.printStackTrace();
            }
        }
        if (verbose && !alreadyInstalled.isEmpty()) {
            System.out.println(alreadyInstalled.size() + " already installed: "
                               + Plugin.toString(alreadyInstalled));
        }
        if (failureCount == 0) {
            if (verbose) {
                System.out.println("No errors!");
            }
            return 0;
        } else {
            System.err.println(failureCount + " Errors!");
            return 1;
        }
    }
}
