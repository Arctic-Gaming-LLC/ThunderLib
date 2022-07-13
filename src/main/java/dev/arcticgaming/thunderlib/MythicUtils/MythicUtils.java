package dev.arcticgaming.thunderlib.MythicUtils;

import io.lumine.mythic.api.config.MythicConfig;
import io.lumine.mythic.bukkit.MythicBukkit;
import io.lumine.mythic.core.mobs.ActiveMob;
import io.lumine.mythic.core.utils.jnbt.CompoundTag;
import io.lumine.mythic.core.utils.jnbt.Tag;
import org.bukkit.entity.Mob;
import org.bukkit.inventory.ItemStack;

public class MythicUtils {

    //TODO verify the errors that these methods cause and catch them!

    public static ActiveMob getActiveMob(Mob mob) {
        return MythicBukkit.inst().getAPIHelper().getMythicMobInstance(mob);
    }

    public static MythicConfig getMMobConfig(Mob mob){
        return MythicBukkit.inst().getAPIHelper().getMythicMobInstance(mob).getType().getConfig();
    }

    public static CompoundTag getMItemNBT(ItemStack item) {

        CompoundTag compoundTag = MythicBukkit.inst().getVolatileCodeHandler().getItemHandler().getNBTData(item);
        return compoundTag;
    }

    public static MythicConfig getMItemConfig(ItemStack item) {

        CompoundTag itemNBT = getMItemNBT(item);

        if (itemNBT.containsKey("MYTHIC_TYPE")) {
            return MythicBukkit.inst().getItemManager().getItem(itemNBT.getString("MYTHIC_TYPE")).get().getConfig();
        }
        return null;
    }

    public static MythicConfig getMItemConfig(String itemName) {
        return MythicBukkit.inst().getItemManager().getItem(itemName).get().getConfig();
    }

    public static void setMItemNBT (ItemStack item, String tagKeyValue, Tag tag) {
        MythicBukkit.inst().getVolatileCodeHandler().getItemHandler().addNBTData(item, tagKeyValue, tag);

    }

    public static boolean isMythicItem (ItemStack item) {
        if(MythicBukkit.inst().getVolatileCodeHandler().getItemHandler().getNBTData(item).containsKey("MYTHIC_TYPE")) {
            return true;
        }
        return false;
    }
}
