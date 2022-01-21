package com.cavetale.setup;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Command {
    CHECK("Check if installed plugins match"),
    DOWNLOAD("Download plugins"),
    PRINT("Print all plugins");

    public final String description;

    public static Command of(String name) {
        try {
            return valueOf(name.toUpperCase());
        } catch (IllegalArgumentException iae) {
            return null;
        }
    }
}
