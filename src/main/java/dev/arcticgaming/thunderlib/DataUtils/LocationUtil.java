package dev.arcticgaming.thunderlib.DataUtils;

import org.bukkit.Bukkit;
import org.bukkit.Location;

import java.util.Objects;

public class LocationUtil {

    /**
     *
     * @param args The array holding a location
     * @return The location
     */
    // this is used to change a String[] into a usable location
    public static Location getLocation(String[] args) {
        return new Location(Bukkit.getWorld(args[0]), Double.parseDouble(args[1]), Double.parseDouble(args[2]), Double.parseDouble(args[3]),
                Float.parseFloat(args[4]), Float.parseFloat(args[5]));
    }

    /**
     *
     * @param location The location to be stringed
     * @return a string array holding a location
     */
    // this is used to change a location into a store-able String[]
    public static String[] setLocation(Location location) {
        String[] strings = new String[6];
        strings[0] = Objects.requireNonNull(location.getWorld()).getName();
        strings[1] = String.valueOf(location.getX());
        strings[2] = String.valueOf(location.getY());
        strings[3] = String.valueOf(location.getZ());
        strings[4] = String.valueOf(location.getYaw());
        strings[5] = String.valueOf(location.getPitch());

        return strings;
    }

    /**
     *
     * @param location Location to turn into String[]
     * @param world World to set the location to
     * @return returns string array holding a location
     */
    public static String[] setLocation(Location location, String world) {
        String[] strings = new String[6];
        strings[0] = world;
        strings[1] = String.valueOf(location.getX());
        strings[2] = String.valueOf(location.getY());
        strings[3] = String.valueOf(location.getZ());
        strings[4] = String.valueOf(location.getYaw());
        strings[5] = String.valueOf(location.getPitch());

        return strings;
    }
}
