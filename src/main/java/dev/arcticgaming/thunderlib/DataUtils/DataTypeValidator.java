package dev.arcticgaming.thunderlib.DataUtils;

import dev.arcticgaming.thunderlib.Logging.Logger;

public class DataTypeValidator {

    /** Used to check if a string (input) is parsable as
     *
     * @param potentialInteger
     * @return Boolean - does String parse as Integer
     */
    public static boolean isInteger(String potentialInteger) {

        try {
            Integer.parseInt(potentialInteger);
            return true;
        } catch (NumberFormatException e) {
            Logger.warn("ThunderLib data validator isInteger returned false!");
            return false;
        }
    }

    /**
     *
     * @param potentialLong
     * @return Boolean - does String parse as Long
     */
    public static boolean isLong (String potentialLong) {

        try {
            Long.parseLong(potentialLong);
            return true;
        } catch (NumberFormatException e) {
            Logger.warn("ThunderLib data validator isLong returned false!");
            return false;

        }
    }
}
