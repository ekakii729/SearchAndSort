/*
 * Author: Abhay Manoj
 * Purpose: A class that analyzes the searches and sorts in the other file
 * Date of Creation: November 16, 2023
 */

package com.ekakii729.searchAndSort;
import java.util.*;

public class SortTimer {

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
        for (int i = 0; i < array.length; i++) array[i] = generateRandomString(random, bound);
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
     * @Parameters array - array to be searched, target - the number being searched for
     * @Returns the time that linear search takes, Data Type: Long
     * Dependencies: N/A
     * Throws/Exceptions: N/A
     */

    private static long getLinearSearchTime(SortSearchLibrary array, int target) {
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
     * @Parameters array - array to be searched, target - the number being searched for
     * @Returns the time that binary search takes, Data Type: Long
     * Dependencies: N/A
     * Throws/Exceptions: N/A
     */

    private static long getBinarySearchTime(SortSearchLibrary array, int target) {
        SortSearchLibrary newArray = new SortSearchLibrary(array); // the array passed in, but will be sorted
        newArray.quickSort(0, newArray.getArrayLength() - 1);
        long currentTime = getCurrentTime(); // the current time
        newArray.binarySearch(0, array.getArrayLength() - 1, target);
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

    private static long getSelectionSortTime(SortSearchLibrary array) {
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

    private static long getQuickSortTime(SortSearchLibrary array) {
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

    private static long getMergeSortTime(SortSearchLibrary array) {
        SortSearchLibrary newArray =  new SortSearchLibrary(array); // a copy of the array
        long currentTime = getCurrentTime(); // the current time
        newArray.mergeSort(0, newArray.getArrayLength() - 1);
        long nextTime = getCurrentTime(); // the time after the search has run
        return nextTime - currentTime;
    }

    /** Method Name: printTimes
     * @Author Abhay Manoj
     * @Date December 01, 2023
     * @Modified December 01, 2023
     * @Description prints the time of each method
     * @Parameters array - array to be sorted
     * @Returns N/A, Data Type: Void
     * Dependencies: N/A
     * Throws/Exceptions: N/A
     */

    private static void printTimes(SortSearchLibrary array) {
        final int NUMBER_OF_TIMES = 3; // the number of times to average
        final int TARGET = 5; // a number that I chose
        long linearSearchTimes = 0, binarySearchTimes = 0, selectionSortTimes = 0, quickSortTimes = 0, mergeSortTimes = 0;
        for (int i = 0; i < NUMBER_OF_TIMES; i++) {
            linearSearchTimes += getLinearSearchTime(array, TARGET) / NUMBER_OF_TIMES;
            binarySearchTimes += getBinarySearchTime(array, TARGET) / NUMBER_OF_TIMES;
            selectionSortTimes += getSelectionSortTime(array) / NUMBER_OF_TIMES;
            quickSortTimes += getQuickSortTime(array) / NUMBER_OF_TIMES;
            mergeSortTimes += getMergeSortTime(array) / NUMBER_OF_TIMES;
        } double searchTimeDifference = (double) binarySearchTimes / linearSearchTimes;
        double quickSortSelectionSortDifference = (double) quickSortTimes / selectionSortTimes;
        double mergeSortSelectionSortDifference = (double) mergeSortTimes / selectionSortTimes;
        double quickSortMergeSortDifference = (double) quickSortTimes / mergeSortTimes;
        System.out.printf("\nLinear Search Time: %dns\nBinary Search Time: %dns\nSelection Sort Time: %dns\nQuickSort Time: %dns\nMergeSort Time: %dns\n" , linearSearchTimes, binarySearchTimes, selectionSortTimes, quickSortTimes, mergeSortTimes);
        System.out.printf("\nBinary Search took %.2fx the time compared to Linear Search.\nQuick Sort took %.2fx the time compared to Selection Sort.\nMerge Sort took %.2fx the time compared to Selection Sort.\nQuick Sort took %.2fx the time compared to Merge Sort.\n", searchTimeDifference, quickSortSelectionSortDifference, mergeSortSelectionSortDifference, quickSortMergeSortDifference);
    }

    /** Method Name: printReport
     * @Author Abhay Manoj
     * @Date December 01, 2023
     * @Modified December 01, 2023
     * @Description prints the report
     * @Parameters N/A
     * @Returns N/A, Data Type: Void
     * Dependencies: N/A
     * Throws/Exceptions: N/A
     */

    private static void printReport() {
        String toPrint = """
                
                As you can see from the data above, Binary Search is much faster than Linear Search. After running this
                file many times, I have found the average speed for Binary Search to be anywhere from 3-25x faster than linear search.
                Quick Sort is also much faster than Selection Sort, as it tends to be about 6.5x faster than Selection Sort.
                This is the same with Merge Sort, where I have found it to be 50x faster than Selection Sort and 6 times faster
                than Quick Sort.
                
                Binary Search being faster than Linear Search makes complete sense as Binary Search's time complexity is logn, where
                the other's is just n. The same thing applies to Selection Sort versus Quick Sort and Merge Sort, as SS is n^2 and the other two
                are nlogn. However what I was not expecting to see was the massive time difference between Merge Sort and Quick Sort. I
                assume that throughout my testing I have just constantly had bad pivots, but it is so consistent that it is almost like
                Merge Sort is just faster.""";
        System.out.println(toPrint);
    }

    public static void main(String[] args) {
        int[] arr = createIntArray(new Random(), 20000);
        SortSearchLibrary s = new SortSearchLibrary(arr);
        printTimes(s);
        printReport();
    }
}
