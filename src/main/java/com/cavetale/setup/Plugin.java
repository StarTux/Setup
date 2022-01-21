package com.cavetale.setup;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import lombok.RequiredArgsConstructor;

/**
 * Enums generated via script.
 */
@RequiredArgsConstructor
public enum Plugin implements PluginSet {
    AFK("AFK", "com.cavetale.afk", "afk", "0.1-SNAPSHOT", Category.ALL),
    ADVICE_ANIMALS("AdviceAnimals", "com.winthier.adviceanimals", "adviceanimals", "0.1-SNAPSHOT", Category.SURVIVAL),
    AREA("Area", "com.cavetale.area", "area", "0.1-SNAPSHOT", Category.SURVIVAL),
    ARMOR_STAND_EDITOR("ArmorStandEditor", "io.github.rypofalem.armorstandeditor", "armorstandeditor", "1.17-25", Category.ALL),
    BANS("Bans", "com.winthier.bans", "bans", "0.1-SNAPSHOT", Category.ALL),
    BED_SPAWN("BedSpawn", "com.cavetale.bedspawn", "bedspawn", "0.1-SNAPSHOT", Category.DEPRECATED),
    BINGO("Bingo", "com.cavetale.bingo", "bingo", "0.1-SNAPSHOT", Category.MINIGAME),
    BLOCK_CLIP("BlockClip", "com.cavetale.blockclip", "blockclip", "0.1-SNAPSHOT", Category.ALL),
    BLOCK_TRIGGER("BlockTrigger", "com.cavetale.blocktrigger", "blocktrigger", "0.1-SNAPSHOT", Category.SURVIVAL),
    CAVES("Caves", "com.cavetale.caves", "caves", "0.1-SNAPSHOT", Category.WORLDGEN),
    CHAIR("Chair", "com.cavetale.chair", "chair", "0.1-SNAPSHOT", Category.SURVIVAL),
    CHAT("Chat", "com.winthier.chat", "chat", "0.1-SNAPSHOT", Category.CORE),
    CHRISTMAS("Christmas", "com.cavetale.christmas", "christmas", "0.1-SNAPSHOT", Category.DEPRECATED),
    COLORFALL("Colorfall", "io.github.feydk.colorfall", "colorfall", "0.1-SNAPSHOT", Category.MINIGAME),
    CONNECT("Connect", "com.winthier.connect", "connect", "0.1-SNAPSHOT", Category.CORE),
    CORE("Core", "com.cavetale.core", "core", "0.1-SNAPSHOT", Category.CORE),
    COUNTDOWN("Countdown", "com.winthier.countdown", "countdown", "0.1", Category.ALL),
    CRAFT_BAY("CraftBay", "com.winthier.craftbay", "craftbay", "2.26-SNAPSHOT", Category.SURVIVAL),
    CREATIVE("Creative", "com.winthier.creative", "creative", "0.1-SNAPSHOT", Category.CREATIVE),
    CULL_MOB("CullMob", "com.cavetale.cullmob", "cullmob", "0.1-SNAPSHOT", Category.SURVIVAL),
    DECORATOR("Decorator", "com.winthier.decorator", "decorator", "0.1-SNAPSHOT", Category.WORLDGEN),
    DIRTY("Dirty", "com.cavetale.dirty", "dirty", "0.1-SNAPSHOT", Category.CORE),
    DUNGEONS("Dungeons", "com.cavetale.dungeons", "dungeons", "0.1-SNAPSHOT", Category.WORLDGEN),
    DUSK("Dusk", "com.winthier.dusk", "dusk", "0.1", Category.SURVIVAL),
    DUTIES("Duties", "me.th3pf.plugins", "duties", "0.1-SNAPSHOT", Category.SURVIVAL),
    EASTER("Easter", "com.cavetale.easter", "easter", "0.1-SNAPSHOT", Category.SEASONAL),
    ELECTION("Election", "com.cavetale.election", "election", "0.1-SNAPSHOT", Category.SURVIVAL),
    ENDERBALL("Enderball", "com.cavetale.enderball", "enderball", "0.1-SNAPSHOT", Category.MINIGAME),
    ENEMY("Enemy", "com.cavetale.enemy", "enemy", "0.1-SNAPSHOT", Category.SURVIVAL),
    EXPLOITS("Exploits", "com.winthier.exploits", "exploits", "0.1-SNAPSHOT", Category.SURVIVAL),
    EXTREME_GRASS_GROWING("ExtremeGrassGrowing", "com.cavetale.extremegrassgrowing", "extremegrassgrowing", "0.1-SNAPSHOT", Category.EVENT),
    FAM("Fam", "com.cavetale.fam", "fam", "0.1-SNAPSHOT", Category.ALL),
    FAST_LEAF_DECAY("FastLeafDecay", "com.cavetale.fastleafdecay", "fastleafdecay", "1.0-SNAPSHOT", Category.SURVIVAL),
    FLAT_GENERATOR("FlatGenerator", "com.cavetale.flatgenerator", "flatgenerator", "0.1-SNAPSHOT", Category.CREATIVE),
    FLY("Fly", "com.cavetale.fly", "fly", "0.1-SNAPSHOT", Category.ALL),
    FREE_HAT("FreeHat", "com.cavetale.freehat", "freehat", "0.1-SNAPSHOT", Category.SURVIVAL),
    GOLDEN_TICKET("GoldenTicket", "com.cavetale.goldenticket", "goldenticket", "0.1-SNAPSHOT", Category.SURVIVAL),
    HALLOWEEN("Halloween", "com.cavetale.halloween", "halloween", "0.1-SNAPSHOT", Category.SEASONAL),
    HEAD_HUNTER("HeadHunter", "com.winthier.headhunter", "headhunter", "0.1-SNAPSHOT", Category.DEPRECATED),
    HEARTS("Hearts", "com.winthier.hearts", "hearts", "0.1-SNAPSHOT", Category.DEPRECATED),
    HIDE_AND_SEEK("HideAndSeek", "com.cavetale.hideandseek", "hideandseek", "0.1-SNAPSHOT", Category.MINIGAME),
    HOME("Home", "com.cavetale.home", "home", "0.1-SNAPSHOT", Category.SURVIVAL),
    HOPPER_FILTER("HopperFilter", "com.winthier.hopperfilter", "hopperfilter", "0.1-SNAPSHOT", Category.SURVIVAL),
    HOT_SWAP("HotSwap", "com.cavetale.hotswap", "hotswap", "0.1-SNAPSHOT", Category.ALL),
    INVENTORY("Inventory", "com.cavetale.inventory", "inventory", "0.1-SNAPSHOT", Category.SURVIVAL),
    INVISIBLE_ITEM_FRAMES("InvisibleItemFrames", "com.cavetale.invisibleitemframes", "invisibleitemframes", "0.1-SNAPSHOT", Category.SURVIVAL),
    ITEM_MERCHANT("ItemMerchant", "com.cavetale.itemmerchant", "itemmerchant", "0.1-SNAPSHOT", Category.SURVIVAL),
    ITEM_STORE("ItemStore", "com.winthier.itemstore", "itemstore", "0.1-SNAPSHOT", Category.ALL),
    KEEP_INVENTORY("KeepInventory", "com.winthier.keepinventory", "keepinventory", "0.1-SNAPSHOT", Category.SURVIVAL),
    KING_OF_THE_LADDER("KingOfTheLadder", "com.cavetale.kotl", "kotl", "0.1-SNAPSHOT", Category.EVENT),
    KIT("Kit", "com.winthier.kit", "kit", "0.1", Category.SURVIVAL),
    LIBS_DISGUISES("LibsDisguises", "LibsDisguises", "LibsDisguises", "10.0.26-SNAPSHOT", Category.EVENT),
    LINK_PORTAL("LinkPortal", "com.winthier.linkportal", "linkportal", "0.1-SNAPSHOT", Category.SURVIVAL),
    MAGIC_MAP("MagicMap", "com.cavetale.magicmap", "magicmap", "0.1-SNAPSHOT", Category.SURVIVAL),
    MAIL("Mail", "com.winthier.mail", "mail", "0.1-SNAPSHOT", Category.ALL),
    MANUAL("Manual", "com.winthier.manual", "manual", "0.1-SNAPSHOT", Category.DEPRECATED),
    MAP_LOAD("MapLoad", "com.cavetale.mapload", "mapload", "0.1-SNAPSHOT", Category.UTIL),
    MASS_STORAGE("MassStorage", "com.winthier.massstorage", "massstorage", "0.1-SNAPSHOT", Category.SURVIVAL),
    MAYPOLE("Maypole", "com.winthier.maypole", "maypole", "0.1", Category.SEASONAL),
    MEMBER_LIST("MemberList", "com.cavetale.memberlist", "memberlist", "0.1-SNAPSHOT", Category.ALL),
    MENU("Menu", "com.cavetale.menu", "menu", "0.1-SNAPSHOT", Category.ALL),
    MERCHANT("Merchant", "com.cavetale.merchant", "merchant", "0.1-SNAPSHOT", Category.SURVIVAL),
    MIDI("Midi", "com.cavetale.midi", "midi", "0.1-SNAPSHOT", Category.UTIL),
    MINIVERSE("Miniverse", "com.cavetale.miniverse", "miniverse", "0.1-SNAPSHOT", Category.UTIL),
    MONEY("Money", "com.cavetale.money", "money", "0.1-SNAPSHOT", Category.CORE),
    MYTEMS("Mytems", "com.cavetale.mytems", "mytems", "0.1-SNAPSHOT", Category.CORE),
    NO_CHEAT_PLUS("NoCheatPlus", "fr.neatmonster", "nocheatplus-parent", "1.1-SNAPSHOT", Category.DEPRECATED),
    OPEN_INV("OpenInv", "com.lishid", "openinvassembly", "4.1.6-SNAPSHOT", Category.SURVIVAL),
    OVERBOARD("Overboard", "com.cavetale.overboard", "overboard", "0.1-SNAPSHOT", Category.MINIGAME),
    PVPARENA("PVPArena", "com.cavetale.pvparena", "pvparena", "0.1-SNAPSHOT", Category.MINIGAME),
    PERM("Perm", "com.winthier.perm", "perm", "0.1-SNAPSHOT", Category.CORE),
    PHOTOS("Photos", "com.winthier.photos", "photos", "0.1-SNAPSHOT", Category.SURVIVAL),
    PICTIONARY("Pictionary", "com.cavetale.pictionary", "pictionary", "0.1-SNAPSHOT", Category.CREATIVE),
    PING_TESTER("PingTester", "com.cavetale.pingtester", "pingtester", "0.1-SNAPSHOT", Category.ALL),
    PLAYER_CACHE("PlayerCache", "com.winthier.playercache", "playercache", "0.1-SNAPSHOT", Category.CORE),
    PLAYER_INFO("PlayerInfo", "com.winthier.playerinfo", "playerinfo", "0.1-SNAPSHOT", Category.ALL),
    PLUG_INFO("PlugInfo", "com.cavetale.pluginfo", "pluginfo", "0.1-SNAPSHOT", Category.ALL),
    PLUG_MAN("PlugMan", "com.rylinaux", "PlugMan", "2.1.7", Category.ALL),
    POCKET_MOB("PocketMob", "com.cavetale.pocketmob", "pocketmob", "0.1-SNAPSHOT", Category.SURVIVAL),
    POSTER("Poster", "com.cavetale.poster", "poster", "0.1-SNAPSHOT", Category.SURVIVAL),
    PROTECT("Protect", "com.winthier.protect", "protect", "0.1-SNAPSHOT", Category.SURVIVAL),
    PROTOCOL_LIB("ProtocolLib", "com.comphenix.protocol", "ProtocolLib", "4.7.1-SNAPSHOT", Category.CORE),
    QUIZ("Quiz", "com.winthier.quiz", "quiz", "0.1-SNAPSHOT", Category.DEPRECATED),
    RACE("Race", "com.cavetale.race", "race", "0.1-SNAPSHOT", Category.MINIGAME),
    RAID("Raid", "com.cavetale.raid", "raid", "0.1-SNAPSHOT", Category.MINIGAME),
    RANDOM_PLAYER_HEAD("RandomPlayerHead", "com.winthier.rph", "random-player-head", "0.1-SNAPSHOT", Category.SURVIVAL),
    RED_GREEN_LIGHT("RedGreenLight", "com.cavetale.redgreenlight", "redgreenlight", "0.1-SNAPSHOT", Category.EVENT),
    REDSTONE_CLOCK_DETECTOR("RedstoneClockDetector", "me.hwei", "redstoneclockdetector", "0.2.8", Category.SURVIVAL),
    RESIDENT("Resident", "com.cavetale.resident", "resident", "0.1-SNAPSHOT", Category.SURVIVAL),
    RESOURCE("Resource", "com.winthier.resource", "resource", "0.1", Category.SURVIVAL),
    RESOURCE_PACK("ResourcePack", "com.cavetale.resourcepack", "resourcepack", "0.1-SNAPSHOT", Category.ALL),
    RULES("Rules", "com.winthier.rules", "rules", "0.1-SNAPSHOT", Category.ALL),
    SQL("SQL", "com.winthier.sql", "sql", "0.1-SNAPSHOT", Category.CORE),
    SERVER("Server", "com.cavetale.server", "server", "0.1-SNAPSHOT", Category.ALL),
    SERVER_STATUS("ServerStatus", "com.cavetale.serverstatus", "serverstatus", "0.1-SNAPSHOT", Category.HUB),
    SHOP("Shop", "com.winthier.shop", "shop", "0.1-SNAPSHOT", Category.SURVIVAL),
    SHUTDOWN("Shutdown", "com.winthier.shutdown", "shutdown", "0.1-SNAPSHOT", Category.ALL),
    SIDEBAR("Sidebar", "com.cavetale.sidebar", "sidebar", "0.1-SNAPSHOT", Category.CORE),
    SIGN_SPY("SignSpy", "com.cavetale.signspy", "signspy", "0.1-SNAPSHOT", Category.SURVIVAL),
    SKILLS("Skills", "com.cavetale.skills", "skills", "0.1-SNAPSHOT", Category.SURVIVAL),
    SPAWN("Spawn", "com.winthier.spawn", "spawn", "0.1-SNAPSHOT", Category.SURVIVAL),
    SPIKE("Spike", "com.cavetale.spike", "spike", "0.1-SNAPSHOT", Category.ALL),
    SPLEEF("Spleef", "com.winthier.spleef", "spleef", "0.1-SNAPSHOT", Category.MINIGAME),
    STAR_BOOK("StarBook", "com.winthier.starbook", "starbook", "0.1-SNAPSHOT", Category.ALL),
    STOP_RAIN("StopRain", "com.winthier.stoprain", "stoprain", "0.1-SNAPSHOT", Category.ALL),
    STREAMER("Streamer", "com.cavetale.streamer", "streamer", "0.1-SNAPSHOT", Category.ALL),
    SURVIVAL_GAMES("SurvivalGames", "com.cavetale.survivalgames", "survivalgames", "0.1-SNAPSHOT", Category.MINIGAME),
    TPA("TPA", "com.cavetale.tpa", "tpa", "0.1-SNAPSHOT", Category.SURVIVAL),
    TELEVATOR("Televator", "com.cavetale.televator", "televator", "0.1-SNAPSHOT", Category.ALL),
    TICKET("Ticket", "com.winthier.ticket", "ticket", "0.1-SNAPSHOT", Category.ALL),
    TINFOIL("Tinfoil", "com.winthier.tinfoil", "tinfoil", "0.1", Category.ALL),
    TITLE("Title", "com.winthier.title", "title", "0.1-SNAPSHOT", Category.CORE),
    TOO_MANY_ENTITIES("TooManyEntities", "com.winthier.toomanyentities", "toomanyentities", "0.1", Category.SURVIVAL),
    TUTOR("Tutor", "com.cavetale.tutor", "tutor", "0.1-SNAPSHOT", Category.ALL),
    VAULT("Vault", "net.milkbowl.vault", "Vault", "1.7", Category.CORE),
    VERTIGO("Vertigo", "io.github.feydk.vertigo", "vertigo", "0.1-SNAPSHOT", Category.MINIGAME),
    VOID_GENERATOR("VoidGenerator", "com.cavetale.voidgenerator", "voidgenerator", "0.1-SNAPSHOT", Category.CORE),
    VOTE("Vote", "com.cavetale.vote", "vote", "0.1-SNAPSHOT", Category.SURVIVAL),
    WALL("Wall", "com.winthier.wall", "wall", "0.1-SNAPSHOT", Category.ALL),
    WARDROBE("Wardrobe", "com.cavetale.wardrobe", "wardrobe", "0.1-SNAPSHOT", Category.ALL),
    WARP("Warp", "com.cavetale.warp", "warp", "0.1-SNAPSHOT", Category.SURVIVAL),
    WATCHDOG("Watchdog", "com.winthier.watchdog", "watchdog", "0.1-SNAPSHOT", Category.ALL),
    WATCHMAN("Watchman", "com.cavetale.watchman", "watchman", "0.1-SNAPSHOT", Category.SURVIVAL),
    WIN_TAG("WinTag", "com.cavetale.wintag", "wintag", "0.1-SNAPSHOT", Category.SURVIVAL),
    WORLD_EDIT("WorldEdit", "", "", "worldedit-bukkit/build/libs/worldedit-bukkit-7.3.0-SNAPSHOT-dist", Category.ALL),
    WORLD_GUARD("WorldGuard", "", "", "worldguard-bukkit/build/libs/worldguard-bukkit-7.0.6-SNAPSHOT-dist", Category.ALL),
    WORLD_MARKER("WorldMarker", "com.cavetale.worldmarker", "worldmarker", "0.1-SNAPSHOT", Category.CORE),
    WORLDS("Worlds", "com.winthier.worlds", "worlds", "0.1-SNAPSHOT", Category.SURVIVAL),
    XMAS("Xmas", "com.cavetale.xmas", "xmas", "0.1-SNAPSHOT", Category.SEASONAL),
    DYNMAP("dynmap", "", "", "target/Dynmap-3.3-SNAPSHOT-spigot", Category.SURVIVAL);

    public final String name;
    public final String groupId;
    public final String artifactId;
    public final String version;
    public final Category category;

    public String getDownloadUrl() {
        return groupId.isEmpty()
            ? ("https://cavetale.com/jenkins/job/" + name
               + "/lastSuccessfulBuild/artifact/" + version + ".jar")
            : ("https://cavetale.com/jenkins/job/" + name
               + "/lastSuccessfulBuild/" + groupId + "$" + artifactId
               + "/artifact/" + groupId + "/" + artifactId + "/" + version
               + "/" + artifactId + "-" + version + ".jar");
    }

    @Override
    public Set<Plugin> getPlugins() {
        return Set.of(this);
    }

    public static Plugin of(String name) {
        for (Plugin plugin : Plugin.values()) {
            if (name.equalsIgnoreCase(plugin.name)) return plugin;
        }
        return null;
    }

    public static String toString(Collection<Plugin> input) {
        ArrayList<String> list = new ArrayList<>(input.size());
        for (Plugin plugin : input) {
            list.add(plugin.name);
        }
        Collections.sort(list);
        return String.join(" ", list);
    }
}
