package dev.arcticgaming.thunderlib.DataUtils;

import dev.arcticgaming.thunderlib.ThunderLib;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public class DataContainerUtil {

    private final PersistentDataContainer nbt;

    public DataContainerUtil(Player player) {
        this.nbt = player.getPersistentDataContainer();
    }

    public DataContainerUtil(Mob mob) {
        this.nbt = mob.getPersistentDataContainer();
    }

    public String getString(String key) {
        return nbt.get(new NamespacedKey(ThunderLib.getPlugin(), key), PersistentDataType.STRING);
    }

    public String getString(String key, String def) {
        return nbt.getOrDefault(new NamespacedKey(ThunderLib.getPlugin(), key), PersistentDataType.STRING, def);
    }

    public boolean hasString(String key) {
        return nbt.has(new NamespacedKey(ThunderLib.getPlugin(), key), PersistentDataType.STRING);
    }

    public int getInteger(String key) {
        return nbt.get(new NamespacedKey(ThunderLib.getPlugin(), key), PersistentDataType.INTEGER);
    }

    public int getInteger(String key, int def) {
        return nbt.getOrDefault(new NamespacedKey(ThunderLib.getPlugin(), key), PersistentDataType.INTEGER, def);
    }

    public boolean hasInteger(String key) {
        return nbt.has(new NamespacedKey(ThunderLib.getPlugin(), key), PersistentDataType.INTEGER);
    }

    public short getShort(String key) {
        return nbt.get(new NamespacedKey(ThunderLib.getPlugin(), key), PersistentDataType.SHORT);
    }

    public short getShort(String key, short def) {
        return nbt.getOrDefault(new NamespacedKey(ThunderLib.getPlugin(), key), PersistentDataType.SHORT, def);
    }

    public boolean hasShort(String key) {
        return nbt.has(new NamespacedKey(ThunderLib.getPlugin(), key), PersistentDataType.SHORT);
    }

    public long getLong(String key) {
        return nbt.get(new NamespacedKey(ThunderLib.getPlugin(), key), PersistentDataType.LONG);
    }

    public long getLong(String key, long def) {
        return nbt.getOrDefault(new NamespacedKey(ThunderLib.getPlugin(), key), PersistentDataType.LONG, def);
    }

    public boolean hasLong(String key) {
        return nbt.has(new NamespacedKey(ThunderLib.getPlugin(), key), PersistentDataType.LONG);
    }

    public double getDouble(String key) {
        return nbt.get(new NamespacedKey(ThunderLib.getPlugin(), key), PersistentDataType.DOUBLE);
    }

    public double getDouble(String key, double def) {
        return nbt.getOrDefault(new NamespacedKey(ThunderLib.getPlugin(), key), PersistentDataType.DOUBLE, def);
    }

    public boolean hasDouble(String key) {
        return nbt.has(new NamespacedKey(ThunderLib.getPlugin(), key), PersistentDataType.DOUBLE);
    }

    public float getFloat(String key) {
        return nbt.get(new NamespacedKey(ThunderLib.getPlugin(), key), PersistentDataType.FLOAT);
    }

    public float getFloat(String key, float def) {
        return nbt.getOrDefault(new NamespacedKey(ThunderLib.getPlugin(), key), PersistentDataType.FLOAT, def);
    }

    public boolean hasFloat(String key) {
        return nbt.has(new NamespacedKey(ThunderLib.getPlugin(), key), PersistentDataType.FLOAT);
    }

    public void setString(String key, String value) {
        nbt.set(new NamespacedKey(ThunderLib.getPlugin(), key), PersistentDataType.STRING, value);
    }

    public void setInteger(String key, int value) {
        nbt.set(new NamespacedKey(ThunderLib.getPlugin(), key), PersistentDataType.INTEGER, value);
    }

    public void setShort(String key, short value) {
        nbt.set(new NamespacedKey(ThunderLib.getPlugin(), key), PersistentDataType.SHORT, value);
    }

    public void setLong(String key, long value) {
        nbt.set(new NamespacedKey(ThunderLib.getPlugin(), key), PersistentDataType.LONG, value);
    }

    public void setDouble(String key, double value) {
        nbt.set(new NamespacedKey(ThunderLib.getPlugin(), key), PersistentDataType.DOUBLE, value);
    }

    public void setFloat(String key, float value) {
        nbt.set(new NamespacedKey(ThunderLib.getPlugin(), key), PersistentDataType.FLOAT, value);
    }
}
