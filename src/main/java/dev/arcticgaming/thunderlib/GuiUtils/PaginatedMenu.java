package dev.arcticgaming.thunderlib.GuiUtils;

import net.kyori.adventure.text.Component;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public abstract class PaginatedMenu extends Menu {

    //Keep track of what page the menu is on
    protected int page = 0;
    //28 is max items because with the border set below,
    //28 empty slots are remaining.
    protected int maxItemsPerPage = 45;
    //the index represents the index of the slot
    //that the loop is on
    protected int index = 0;

    public PaginatedMenu(PlayerMenuUtility playerMenuUtility) {
        super(playerMenuUtility);
    }

    //Set the border and menu buttons for the menu
    public void addMenuFooter(){

        ItemStack cancelButton = new ItemStack(Material.STICK);
        ItemMeta cancelButtonMeta = cancelButton.getItemMeta();
        cancelButtonMeta.setCustomModelData(21);
        cancelButtonMeta.displayName(Component.text(ChatColor.DARK_RED + "Cancel"));
        cancelButton.setItemMeta(cancelButtonMeta);

        ItemStack leftButton = new ItemStack(Material.STICK);
        ItemMeta leftButtonMeta = leftButton.getItemMeta();
        leftButtonMeta.setCustomModelData(22);
        leftButtonMeta.displayName(Component.text(ChatColor.YELLOW + "Previous Page"));
        leftButton.setItemMeta(leftButtonMeta);

        ItemStack rightButton = new ItemStack(Material.STICK);
        ItemMeta rightButtonMeta = rightButton.getItemMeta();
        rightButtonMeta.setCustomModelData(21);
        rightButtonMeta.displayName(Component.text(ChatColor.YELLOW + "Next Page"));
        rightButton.setItemMeta(rightButtonMeta);



        inventory.setItem(48, leftButton);

        inventory.setItem(49, cancelButton);

        inventory.setItem(50, rightButton);

        for (int i = 0; i < 54; i++) {
            if (inventory.getItem(i) == null) {
                inventory.setItem(i, super.FILLER_GLASS);
            }
        }
    }

    public int getMaxItemsPerPage() {
        return maxItemsPerPage;
    }


}
