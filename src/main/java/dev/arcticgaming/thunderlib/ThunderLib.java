package dev.arcticgaming.thunderlib;

import dev.arcticgaming.thunderlib.GuiUtils.PlayerMenuUtility;
import dev.arcticgaming.thunderlib.Logging.Logger;
import lombok.Getter;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import java.util.HashMap;


public final class ThunderLib extends JavaPlugin {

    private static final HashMap<Player, PlayerMenuUtility> playerMenuUtilityMap = new HashMap<>();

    @Getter public static ThunderLib plugin;
    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;

        Logger.log("ThunderLib is Loaded!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Logger.log("ThunderLib rolled out...");
    }

    public static PlayerMenuUtility getPlayerMenuUtility(Player p) {
        PlayerMenuUtility playerMenuUtility;
        if (!(playerMenuUtilityMap.containsKey(p))) { //See if the player has a playermenuutility "saved" for them

            //This player doesn't. Make one for them add add it to the hashmap
            playerMenuUtility = new PlayerMenuUtility(p);
            playerMenuUtilityMap.put(p, playerMenuUtility);

            return playerMenuUtility;
        } else {
            return playerMenuUtilityMap.get(p); //Return the object by using the provided player
        }
    }
}
