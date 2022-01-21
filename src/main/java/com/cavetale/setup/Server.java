package com.cavetale.setup;

import java.util.EnumSet;
import java.util.Set;
import lombok.Getter;
import static com.cavetale.setup.Category.*;

@Getter
public enum Server implements PluginSet {
    ANY("Base", CORE, ALL),
    CAVETALE("Cavetale", CORE, ALL, Category.SURVIVAL),
    CREATIVE("Creative", CORE, ALL, Category.CREATIVE),
    HUB("Hub", CORE, ALL, Category.HUB);

    public final String name;
    public final Set<Plugin> plugins;

    Server(final String name, final PluginSet... pluginSets) {
        this.name = name;
        this.plugins = EnumSet.noneOf(Plugin.class);
        for (PluginSet pluginSet : pluginSets) {
            plugins.addAll(pluginSet.getPlugins());
        }
    }

    public static Server of(String name) {
        try {
            return valueOf(name.toUpperCase());
        } catch (IllegalArgumentException iae) {
            return null;
        }
    }
}
