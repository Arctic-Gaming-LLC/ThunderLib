package dev.arcticgaming.thunderlib.Logging;

import dev.arcticgaming.thunderlib.ThunderLib;
import org.bukkit.ChatColor;

public class Logger {

    public static void log (String loggedMessage) {

        ThunderLib.getPlugin(ThunderLib.class).getLogger().info(ChatColor.AQUA + loggedMessage);
    }

    public static void warn (String loggedWarning) {

        ThunderLib.getPlugin(ThunderLib.class).getLogger().warning(ChatColor.YELLOW + loggedWarning);
    }

    public static void error (String loggedError) {

        ThunderLib.getPlugin(ThunderLib.class).getLogger().warning(ChatColor.RED + loggedError);
    }

}
