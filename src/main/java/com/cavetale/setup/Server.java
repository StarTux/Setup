package com.cavetale.setup;

import java.util.EnumSet;
import java.util.Set;
import lombok.Getter;

@Getter
public enum Server implements PluginSet {
    BASE("Base", Category.CORE, Category.ALL),

    HUB("Hub", Category.CORE, Category.ALL, Category.SURVIVAL, Category.BUILD, Category.HUB),
    EINS("Eins", Category.CORE, Category.ALL, Category.SURVIVAL, Category.BUILD, Category.HOME),
    ZWEI("Zwei", Category.CORE, Category.ALL, Category.SURVIVAL, Category.BUILD, Category.HOME),
    MINE("Cavetale", Category.CORE, Category.ALL, Category.SURVIVAL, Category.BUILD, Category.MINE),
    CREATIVE("Creative", Category.CORE, Category.ALL, Category.CREATIVE, Category.BUILD, Plugin.RAID, Plugin.ENEMY, Plugin.LINK_PORTAL),
    // Classic
    CAVETALE("Cavetale", Category.CORE, Category.ALL, Category.SURVIVAL, Category.BUILD),
    ;

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
