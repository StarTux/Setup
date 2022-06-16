package com.cavetale.setup;

import java.util.EnumSet;
import java.util.Set;
import lombok.Getter;

@Getter
public enum Server implements PluginSet {
    ANY("Base", Category.CORE, Category.ALL),
    CAVETALE("Cavetale", Category.CORE, Category.ALL, Category.SURVIVAL, Category.BUILD, Category.MAIN),
    MINE("Cavetale", Category.CORE, Category.ALL, Category.SURVIVAL, Category.BUILD, Category.MAIN, Plugin.DUNGEONS),
    CREATIVE("Creative", Category.CORE, Category.ALL, Category.CREATIVE, Category.BUILD, Plugin.RAID, Plugin.ENEMY, Plugin.LINK_PORTAL),
    HUB("Hub", Category.CORE, Category.ALL, Category.HUB);

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
