package dev.arcticgaming.thunderlib.GuiUtils;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class PlayerMenuUtility {

    @Setter @Getter
    private final Player owner;
    @Setter @Getter
    private ItemStack item;
    @Setter @Getter
    private double price;
    @Setter @Getter
    private ItemStack listingItem;


    public PlayerMenuUtility(Player p) {
        this.owner = p;
    }
}
