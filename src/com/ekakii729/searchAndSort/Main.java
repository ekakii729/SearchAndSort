package com.ekakii729.searchAndSort;
import java.util.Random;

public class Main {

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

    /** Method Name: createArray
     * @Author Abhay Manoj
     * @Date November 24, 2023
     * @Modified November 24, 2023
     * @Description creates randomized array with size 100 000
     * @Parameters random - random number generator
     * @Returns randomized array, Data Type: Integer[]
     * Dependencies: Random
     * Throws/Exceptions: N/A
     */

    private static int[] createArray(Random random) {
        int[] array = new int[100000];
        randomizeArray(random, array, array.length);
        return array;
    }

    public static void main(String[] args) {
        SortSearchLibrary s = new SortSearchLibrary(createArray(new Random()));
        s.quickSort(0, s.getArrayLength() - 1);
        s.printArrayInColumns();
    }
}
