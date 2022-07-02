package dev.arcticgaming.thunderlib.DataUtils;

import java.util.UUID;

public class ArrayUtil {

    /**
     * <h3>Array Util</h3>
     * A handy tool to update arrays!
     * String Edition!
     *
     * @param oldArray The current array that is being updated
     * @param value The values that an array is adding to
     * @return Array of object type
     */

    public static String[] addToArray(String[] oldArray, String value) {

        String[] newArray = new String[oldArray.length + 1];

        newArray[0] = value;
        for (int i = 0; i < oldArray.length;) {
            newArray[i + 1] = oldArray[i];
            i++;
        }

        return newArray;
    }

    /**
     * <h3>Array Util</h3>
     * A handy tool to update arrays!
     * Extra-Long Edition!
     *
     * @param oldArray The current array that is being updated
     * @param value The values that an array is adding to
     * @return Array of object type
     */
    public static long[] addToArray(long[] oldArray, long value) {

        long[] newArray = new long[oldArray.length + 1];

        newArray[0] = value;
        for (int i = 0; i < oldArray.length;) {
            newArray[i + 1] = oldArray[i];
            i++;
        }

        return newArray;
    }

    /**
     * <h3>Array Util</h3>
     * A handy tool to update arrays!
     * UUID Edition
     *
     * @param oldArray The current array that is being updated
     * @param value The values that an array is adding to
     * @return Array of object type
     */
    public static double[] addToArray(double[] oldArray, double value) {

        double[] newArray = new double[oldArray.length + 1];

        newArray[0] = value;
        for (int i = 0; i < oldArray.length;) {
            newArray[i + 1] = oldArray[i];
            i++;
        }

        return newArray;
    }

    /**
     * <h3>Array Util</h3>
     * A handy tool to update arrays!
     * UUID Edition
     *
     * @param oldArray The current array that is being updated
     * @param value The values that an array is adding to
     * @return Array of object type
     */
    public static UUID[] addToArray(UUID[] oldArray, UUID value) {

        UUID[] newArray = new UUID[oldArray.length + 1];

        newArray[0] = value;
        for (int i = 0; i < oldArray.length;) {
            newArray[i + 1] = oldArray[i];
            i++;
        }

        return newArray;
    }

    /**
     * <h3>Array Util</h3>
     * A handy tool to update arrays!
     * Less-Long Edition!
     *
     * @param oldArray The current array that is being updated
     * @param value The values that an array is removing from
     * @return Array of object type
     */
    public static long[] removeFromArray(long[] oldArray, long value) {

        long[] newArray = new long[oldArray.length - 1];
        int y = 0;
        for (int i = 0; i < oldArray.length;) {

            if (oldArray[i] != value) {
                newArray[y] = oldArray[i];
                y++;
            }
            i++;
        }

        return newArray;
    }

    /**
     * <h3>Array Util</h3>
     * A handy tool to shorten arrays!
     * Double Edition!
     *
     * @param oldArray The current array that is being updated
     * @param value The values that an array is removing from
     * @return Array of object type
     */
    public static double[] removeFromArray(double[] oldArray, double value) {

        double[] newArray = new double[oldArray.length - 1];
        int y = 0;
        for (int i = 0; i < oldArray.length;) {

            if (oldArray[i] != value) {
                newArray[y] = oldArray[i];
                y++;
            }
            i++;
        }

        return newArray;
    }

    /**
     * <h3>Array Util</h3>
     * A handy tool to shorten arrays!
     * String Edition!
     *
     * @param oldArray The current array that is being updated
     * @param value The values that an array is removing from
     * @return Array of object type
     */
    public static String[] removeFromArray(String[] oldArray, String value) {

        String[] newArray = new String[oldArray.length - 1];
        int y = 0;
        for (int i = 0; i < oldArray.length;) {

            if (!oldArray[i].equalsIgnoreCase(value)) {
                newArray[y] = oldArray[i];
                y++;
            }
            i++;
        }

        return newArray;
    }

    /**
     * <h3>Array Util</h3>
     * A handy tool to shorten arrays!
     * UUID Edition!
     *
     * @param oldArray The current array that is being updated
     * @param value The values that an array is removing from
     * @return Array of object type
     */
    public static UUID[] removeFromArray(UUID[] oldArray, UUID value) {

        UUID[] newArray = new UUID[oldArray.length - 1];
        int y = 0;
        for (int i = 0; i < oldArray.length;) {

            if (!oldArray[i].toString().equalsIgnoreCase(value.toString())) {
                newArray[y] = oldArray[i];
                y++;
            }
            i++;
        }

        return newArray;
    }
}
