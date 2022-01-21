package com.cavetale.setup;

public enum Flag {
    SERVER("Specify servers"),
    CATEGORY("Specify categories"),
    PLUGIN("Specify plugins"),
    HELP("Print help"),
    VERBOSE("Verbose output");

    public final char shortForm;
    public final String longForm;
    public final String description;

    Flag(final String description) {
        this.shortForm = name().toLowerCase().charAt(0);
        this.longForm = name().toLowerCase();
        this.description = description;
    }

    public static Flag of(String longArg) {
        for (Flag flag : Flag.values()) {
            if (longArg.equals(flag.longForm)) return flag;
        }
        return null;
    }

    public static Flag of(char shortArg) {
        for (Flag flag : Flag.values()) {
            if (shortArg == flag.shortForm) return flag;
        }
        return null;
    }
}
