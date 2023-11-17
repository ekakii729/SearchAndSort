package com.ekakii729.searchAndSort;

public class SortSearchLibrary {

    /** Method Name: selectionSort
     * @Author Abhay Manoj
     * @Date November 16, 2023
     * @Modified November 16, 2023
     * @Description runs selection sort
     * @Parameters nums - array to be sorted
     * @Returns N/A, Data Type: Void
     * Dependencies: N/A
     * Throws/Exceptions: N/A
     */

    public void selectionSort(int[] nums) {
        final int ARRAY_INDEX_COUNT = nums.length; // the index count of the array
        for (int i = 0; i < ARRAY_INDEX_COUNT - 1; i++) {
            int minimumIndex = i; // the minimum index
            for (int j = i + 1; j < ARRAY_INDEX_COUNT; j++) if (nums[j] < nums[minimumIndex]) minimumIndex = j;
            swap(nums, minimumIndex, i);
        }
    }

    /** Method Name: selectionSort
     * @Author Abhay Manoj
     * @Date November 16, 2023
     * @Modified November 16, 2023
     * @Description runs selection sort
     * @Parameters strings - array to be sorted
     * @Returns N/A, Data Type: Void
     * Dependencies: N/A
     * Throws/Exceptions: N/A
     */

    public void selectionSort(String[] strings) {
        final int ARRAY_INDEX_COUNT = strings.length; // the index count of the array
        for (int i = 0; i < ARRAY_INDEX_COUNT - 1; i++) {
            int minimumIndex = i; // the minimum index
            for (int j = i + 1; j < ARRAY_INDEX_COUNT; j++) if (strings[j].compareTo(strings[minimumIndex]) < 0) minimumIndex = j;
            swap(strings, minimumIndex, i);
        }
    }

    /** Method Name: quickSort
     * @Author Abhay Manoj
     * @Date November 16, 2023
     * @Modified November 16, 2023
     * @Description runs quick sort
     * @Parameters nums - array to be sorted, lowestIndex - lowest index of array, highestIndex - highest index of array
     * @Returns N/A, Data Type: Void
     * Dependencies: N/A
     * Throws/Exceptions: N/A
     */

    public void quickSort(int[] nums, int lowestIndex, int highestIndex) {
        if (lowestIndex >= highestIndex) return;
        int partition = partition(nums, lowestIndex, highestIndex); // the middle point of the array
        quickSort(nums, lowestIndex, partition - 1);
        quickSort(nums, partition + 1, highestIndex);
    }

    /** Method Name: quickSort
     * @Author Abhay Manoj
     * @Date November 16, 2023
     * @Modified November 16, 2023
     * @Description runs quick sort
     * @Parameters strings - array to be sorted, lowestIndex - lowest index of array, highestIndex - highest index of array
     * @Returns N/A, Data Type: Void
     * Dependencies: N/A
     * Throws/Exceptions: N/A
     */

    public void quickSort(String[] strings, int lowestIndex, int highestIndex) {
        if (lowestIndex >= highestIndex) return;
        int partition = partition(strings, lowestIndex, highestIndex); // the middle point of the array
        quickSort(strings, lowestIndex, partition - 1);
        quickSort(strings, partition + 1, highestIndex);
    }

    /** Method Name: partition
     * @Author Abhay Manoj
     * @Date November 16, 2023
     * @Modified November 16, 2023
     * @Description partitions array for quick sort
     * @Parameters nums - array to be sorted, lowestIndex - lowest index of array, highestIndex - highest index of array
     * @Returns index of the pivot point, Data Type: Integer
     * Dependencies: N/A
     * Throws/Exceptions: N/A
     */

    private int partition(int[] nums, int lowestIndex, int highestIndex) {
        int pivot = nums[highestIndex]; // the pivot point
        int smallestElement = lowestIndex - 1; // the smallest element in the array
        for (int j = lowestIndex; j <= highestIndex; j++) {
            if (nums[j] < pivot) {
                smallestElement++;
                swap(nums, smallestElement, j);
            }
        } swap(nums, smallestElement + 1, highestIndex);
        return (smallestElement + 1);
    }

    /** Method Name: partition
     * @Author Abhay Manoj
     * @Date November 16, 2023
     * @Modified November 16, 2023
     * @Description partitions array for quick sort
     * @Parameters strings - array to be sorted, lowestIndex - lowest index of array, highestIndex - highest index of array
     * @Returns index of the pivot point, Data Type: Integer
     * Dependencies: N/A
     * Throws/Exceptions: N/A
     */

    private int partition(String[] strings, int lowestIndex, int highestIndex) {
        String pivot = strings[highestIndex]; // the pivot point
        int smallestElement = lowestIndex - 1; // the smallest element in the array
        for (int j = lowestIndex; j <= highestIndex; j++) {
            if (strings[j].compareTo(pivot) < 0) {
                smallestElement++;
                swap(strings, smallestElement, j);
            }
        } swap(strings, smallestElement + 1, highestIndex);
        return (smallestElement + 1);
    }

    /** Method Name: mergeSort
     * @Author Abhay Manoj
     * @Date November 16, 2023
     * @Modified November 16, 2023
     * @Description runs merge sort
     * @Parameters nums - array to be sorted, leftMostIndex - left most index of array, rightMostIndex - right most index of array
     * @Returns N/A, Data Type: Void
     * Dependencies: N/A
     * Throws/Exceptions: N/A
     */

    public void mergeSort(int[] nums, int leftMostIndex, int rightMostIndex) {
        if (leftMostIndex >= rightMostIndex) return;
        int middleIndex = (leftMostIndex + rightMostIndex) / 2; // the middle index of the array
        mergeSort(nums, leftMostIndex, middleIndex);
        mergeSort(nums, middleIndex + 1, rightMostIndex);
        merge(nums, leftMostIndex, middleIndex, rightMostIndex);
    }

    /** Method Name: mergeSort
     * @Author Abhay Manoj
     * @Date November 16, 2023
     * @Modified November 16, 2023
     * @Description runs merge sort
     * @Parameters strings - array to be sorted, leftMostIndex - left most index of array, rightMostIndex - right most index of array
     * @Returns N/A, Data Type: Void
     * Dependencies: N/A
     * Throws/Exceptions: N/A
     */

    public void mergeSort(String[] strings, int leftMostIndex, int rightMostIndex) {
        if (leftMostIndex >= rightMostIndex) return;
        int middleIndex = (leftMostIndex + rightMostIndex) / 2; // the middle index of the array
        mergeSort(strings, leftMostIndex, middleIndex);
        mergeSort(strings, middleIndex + 1, rightMostIndex);
        merge(strings, leftMostIndex, middleIndex, rightMostIndex);
    }

    /** Method Name: merge
     * @Author Abhay Manoj
     * @Date November 16, 2023
     * @Modified November 16, 2023
     * @Description merges sorted sub arrays into one array
     * @Parameters nums - array to be sorted, leftMostIndex - left most index of array, middleIndex - middle index of array, rightMostIndex - right most index of array
     * @Returns N/A, Data Type: Void
     * Dependencies: N/A
     * Throws/Exceptions: N/A
     */

    private static void merge(int[] nums, int leftMostIndex, int middleIndex, int rightMostIndex) {
        int sizeOfLeftArray = middleIndex - leftMostIndex + 1; // size of the left array
        int sizeOfRightArray = rightMostIndex - middleIndex; //  size of the right array
        int[] leftArray = new int[middleIndex - leftMostIndex + 1]; // the left array
        int[] rightArray = new int[rightMostIndex - middleIndex]; //  the right array
        if (sizeOfLeftArray >= 0) System.arraycopy(nums, leftMostIndex, leftArray, 0, sizeOfLeftArray);
        if (sizeOfRightArray >= 0) System.arraycopy(nums, middleIndex + 1, rightArray, 0, sizeOfRightArray);
        int i = 0, j = 0; // initial indexes of the two arrays
        int k = leftMostIndex; // initial index of merged subarray array
        while (i < sizeOfLeftArray && j < sizeOfRightArray) {
            if (leftArray[i] <= rightArray[j]) {
                nums[k] = leftArray[i];
                i++;
            } else {
                nums[k] = rightArray[j];
                j++;
            } k++;
        } while (i < sizeOfLeftArray) {
            nums[k] = leftArray[i];
            i++;
            k++;
        } while (j < sizeOfRightArray) {
            nums[k] = rightArray[j];
            j++;
            k++;
        }
    }

    /** Method Name: merge
     * @Author Abhay Manoj
     * @Date November 16, 2023
     * @Modified November 16, 2023
     * @Description merges sorted sub arrays into one array
     * @Parameters strings - array to be sorted, leftMostIndex - left most index of array, middleIndex - middle index of array, rightMostIndex - right most index of array
     * @Returns N/A, Data Type: Void
     * Dependencies: N/A
     * Throws/Exceptions: N/A
     */

    private static void merge(String[] strings, int leftMostIndex, int middleIndex, int rightMostIndex) {
        int sizeOfLeftArray = middleIndex - leftMostIndex + 1; // size of the left array
        int sizeOfRightArray = rightMostIndex - middleIndex; //  size of the right array
        String[] leftArray = new String[middleIndex - leftMostIndex + 1]; // the left array
        String[] rightArray = new String[rightMostIndex - middleIndex]; //  the right array
        if (sizeOfLeftArray >= 0) System.arraycopy(strings, leftMostIndex, leftArray, 0, sizeOfLeftArray);
        if (sizeOfRightArray >= 0) System.arraycopy(strings, middleIndex + 1, rightArray, 0, sizeOfRightArray);
        int i = 0, j = 0; // initial indexes of the two arrays
        int k = leftMostIndex; // initial index of merged subarray array
        while (i < sizeOfLeftArray && j < sizeOfRightArray) {
            if (leftArray[i].compareTo(rightArray[j]) <= 0) {
                strings[k] = leftArray[i];
                i++;
            } else {
                strings[k] = rightArray[j];
                j++;
            } k++;
        } while (i < sizeOfLeftArray) {
            strings[k] = leftArray[i];
            i++;
            k++;
        } while (j < sizeOfRightArray) {
            strings[k] = rightArray[j];
            j++;
            k++;
        }
    }

    /** Method Name: swap
     * @Author Abhay Manoj
     * @Date November 16, 2023
     * @Modified November 16, 2023
     * @Description swaps two elements in array
     * @Parameters nums - array containing the elements, i - first index, j - second index
     * @Returns N/A, Data Type: Void
     * Dependencies: N/A
     * Throws/Exceptions: N/A
     */

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    /** Method Name: swap
     * @Author Abhay Manoj
     * @Date November 16, 2023
     * @Modified November 16, 2023
     * @Description swaps two elements in array
     * @Parameters strings - array containing the elements, i - first index, j - second index
     * @Returns N/A, Data Type: Void
     * Dependencies: N/A
     * Throws/Exceptions: N/A
     */

    private void swap(String[] strings, int i, int j) {
        String temp = strings[i];
        strings[i] = strings[j];
        strings[j] = temp;
    }

    /** Method Name: printArray
     * @Author Abhay Manoj
     * @Date November 16, 2023
     * @Modified November 16, 2023
     * @Description prints array
     * @Parameters nums - array to be printed
     * @Returns N/A, Data Type: Void
     * Dependencies: N/A
     * Throws/Exceptions: N/A
     */

    public void printArray(int[] nums) {
        for (int num : nums) System.out.print(num + " ");
    }

    /** Method Name: printArray
     * @Author Abhay Manoj
     * @Date November 16, 2023
     * @Modified November 16, 2023
     * @Description prints array
     * @Parameters strings - array to be printed
     * @Returns N/A, Data Type: Void
     * Dependencies: N/A
     * Throws/Exceptions: N/A
     */

    public void printArray(String[] strings) {
        for (String string : strings) System.out.print(string + " ");
    }
}
