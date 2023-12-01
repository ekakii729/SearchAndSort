package com.ekakii729.searchAndSort;
import java.util.*;

public class Main {

    /** Method Name: generateRandomString
     * @Author Abhay Manoj
     * @Date November 28, 2023
     * @Modified November 28, 2023
     * @Description generates a random string
     * @Parameters random - random number generator, length - length of the string
     * @Returns randomized string, Data Type: String
     * Dependencies: Random
     * Throws/Exceptions: N/A
     */

    private static String generateRandomString(Random random, int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"; // all possible characters
        StringBuilder randomString = new StringBuilder(); // used to create the string
        for (int i = 0; i < length; i++) randomString.append(characters.charAt(random.nextInt(characters.length())));
        return randomString.toString();
    }

    /** Method Name: randomizeArray
     * @Author Abhay Manoj
     * @Date November 24, 2023
     * @Modified November 24, 2023
     * @Description randomizes array with elements from 0 to the bound
     * @Parameters random - random number generator, array - the array to be randomized, bound - the max bound to be randomized
     * @Returns N/A, Data Type: Void
     * Dependencies: Random
     * Throws/Exceptions: N/A
     */

    private static void randomizeArray(Random random, int[] array, int bound) {
        for (int i = 0; i < array.length; i++) array[i] = random.nextInt(bound);
    }

    /** Method Name: randomizeArray
     * @Author Abhay Manoj
     * @Date November 28, 2023
     * @Modified November 28, 2023
     * @Description generates a random string
     * @Parameters random - random number generator, length - length of the string
     * @Returns randomized string, Data Type: String
     * Dependencies: Random
     * Throws/Exceptions: N/A
     */

    private static void randomizeArray(Random random, String[] array, int bound) {
        for (int i = 0; i < array.length; i++) array[i] = generateRandomString(random, 10);
    }

    /** Method Name: createIntArray
     * @Author Abhay Manoj
     * @Date November 24, 2023
     * @Modified November 24, 2023
     * @Description creates randomized array
     * @Parameters random - random number generator, size - the size of the array
     * @Returns randomized array, Data Type: Integer[]
     * Dependencies: Random
     * Throws/Exceptions: N/A
     */

    private static int[] createIntArray(Random random, int size) {
        int[] array = new int[size]; // the array to return
        randomizeArray(random, array, array.length);
        return array;
    }

    /** Method Name: createStringArray
     * @Author Abhay Manoj
     * @Date November 28, 2023
     * @Modified November 28, 2023
     * @Description creates randomized array with size
     * @Parameters random - random number generator, size - the size of the array
     * @Returns randomized array, Data Type: String[]
     * Dependencies: Random
     * Throws/Exceptions: N/A
     */

    private static String[] createStringArray(Random random, int size) {
        String[] array = new String[size]; // the array to return
        randomizeArray(random, array, array.length);
        return array;
    }

    private int getLinearSearch(SortSearchLibrary array) {
        return 1;
    }
    private int getBinarySearchTime() {
        return 1;
    }
    private int getSelectionSortTime(SortSearchLibrary array) {
        return 1;
    }

    private int getQuickSortTime(SortSearchLibrary array) {
        return 1;
    }

    private int getMergeSortTime(SortSearchLibrary array) {
        return 1;
    }

    public static void main(String[] args) {

    }
}
