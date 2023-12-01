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

    /** Method Name: getCurrentTime
     * @Author Abhay Manoj
     * @Date December 01, 2023
     * @Modified December 01, 2023
     * @Description returns current time in nanoseconds
     * @Parameters N/A
     * @Returns time in nanoseconds, Data Type: Long
     * Dependencies: N/A
     * Throws/Exceptions: N/A
     */

    private static long getCurrentTime() { return System.nanoTime(); }

    /** Method Name: getLinearSearchTime
     * @Author Abhay Manoj
     * @Date December 01, 2023
     * @Modified December 01, 2023
     * @Description gets time of linear search
     * @Parameters array - array to be searched
     * @Returns the time that linear search takes, Data Type: Long
     * Dependencies: N/A
     * Throws/Exceptions: N/A
     */

    private long getLinearSearchTime(SortSearchLibrary array) {
        int target = 10; // a number I selected at random
        long currentTime = getCurrentTime(); // the current time
        array.linearSearch(target);
        long nextTime = getCurrentTime(); // the time after the search has run
        return nextTime - currentTime;
    }

    /** Method Name: getBinarySearchTime
     * @Author Abhay Manoj
     * @Date December 01, 2023
     * @Modified December 01, 2023
     * @Description gets time of binary search
     * @Parameters array - array to be searched
     * @Returns the time that binary search takes, Data Type: Long
     * Dependencies: N/A
     * Throws/Exceptions: N/A
     */

    private long getBinarySearchTime(SortSearchLibrary array) {
        int target = 10; //  a number I selected at random
        long currentTime = getCurrentTime(); // the current time
        array.binarySearch(0, array.getArrayLength() - 1, target);
        long nextTime = getCurrentTime(); // the time after the search has run
        return nextTime - currentTime;
    }

    /** Method Name: getSelectionSortTime
     * @Author Abhay Manoj
     * @Date December 01, 2023
     * @Modified December 01, 2023
     * @Description gets time of selection sort
     * @Parameters array - array to be sorted
     * @Returns the time that selection sort takes, Data Type: Long
     * Dependencies: N/A
     * Throws/Exceptions: N/A
     */

    private long getSelectionSortTime(SortSearchLibrary array) {
        SortSearchLibrary newArray =  new SortSearchLibrary(array); // a copy of the array
        long currentTime = getCurrentTime(); // the current time
        newArray.selectionSort();
        long nextTime = getCurrentTime(); // the time after the search has run
        return nextTime - currentTime;
    }

    /** Method Name: getQuickSortTime
     * @Author Abhay Manoj
     * @Date December 01, 2023
     * @Modified December 01, 2023
     * @Description gets time of quick sort
     * @Parameters array - array to be sorted
     * @Returns the time that quick sort takes, Data Type: Long
     * Dependencies: N/A
     * Throws/Exceptions: N/A
     */

    private long getQuickSortTime(SortSearchLibrary array) {
        SortSearchLibrary newArray =  new SortSearchLibrary(array); // a copy of the array
        long currentTime = getCurrentTime(); // the current time
        newArray.quickSort(0, newArray.getArrayLength() - 1);
        long nextTime = getCurrentTime(); // the time after the search has run
        return nextTime - currentTime;
    }

    /** Method Name: getMergeSortTime
     * @Author Abhay Manoj
     * @Date December 01, 2023
     * @Modified December 01, 2023
     * @Description gets time of merge sort
     * @Parameters array - array to be sorted
     * @Returns the time that merge sort takes, Data Type: Long
     * Dependencies: N/A
     * Throws/Exceptions: N/A
     */

    private long getMergeSortTime(SortSearchLibrary array) {
        SortSearchLibrary newArray =  new SortSearchLibrary(array); // a copy of the array
        long currentTime = getCurrentTime(); // the current time
        newArray.mergeSort(0, newArray.getArrayLength() - 1);
        long nextTime = getCurrentTime(); // the time after the search has run
        return nextTime - currentTime;
    }



    public static void main(String[] args) {

    }
}
