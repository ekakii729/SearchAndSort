/*
 * Author: Abhay Manoj
 * Purpose: A library that contains several searches and sorts
 * Date of Creation: October 20, 2023
 */

package com.ekakii729.searchAndSort;

public class SortSearchLibrary {

    private int[] nums;
    private String[] strings;

    public SortSearchLibrary(int[] nums) {
        this.nums = nums;
    }

    public SortSearchLibrary(String[] strings) {
        this.strings = strings;
    }

    /** Method Name: sequentialSearch
     * @Author Abhay Manoj
     * @Date November 16, 2023
     * @Modified November 16, 2023
     * @Description runs sequential search
     * @Parameters target - element that is being looked for
     * @Returns index of the element being looked for, Data Type: Integer
     * Dependencies: N/A
     * Throws/Exceptions: N/A
     */

    public int sequentialSearch(int target) {
        for (int i = 0; i < nums.length; i++) if (nums[i] == target) return i;
        return -1;
    }

    /** Method Name: sequentialSearch
     * @Author Abhay Manoj
     * @Date November 16, 2023
     * @Modified November 16, 2023
     * @Description runs sequential search
     * @Parameters target - element that is being looked for
     * @Returns index of the element being looked for, Data Type: Integer
     * Dependencies: N/A
     * Throws/Exceptions: N/A
     */

    public int sequentialSearch(String target) {
        for (int i = 0; i < strings.length; i++) if (strings[i].equals(target)) return i;
        return -1;
    }

    /** Method Name: binarySearch
     * @Author Abhay Manoj
     * @Date November 16, 2023
     * @Modified November 16, 2023
     * @Description runs binary search
     * @Parameters lowestIndex - lowest index of array, highestIndex - highest index of array, target - element that is being looked for
     * @Returns index of the element being looked for, Data Type: Integer
     * Dependencies: N/A
     * Throws/Exceptions: N/A
     */

    public int binarySearch(int lowestIndex, int highestIndex, int target) {
        if (highestIndex >= lowestIndex && lowestIndex <= nums.length - 1) {
            int middleIndex = (lowestIndex + highestIndex) / 2; // the middle index of the array
            if (nums[middleIndex] == target) return middleIndex;
            if (nums[middleIndex] > target) return binarySearch(lowestIndex, middleIndex - 1, target);
            return binarySearch(middleIndex + 1, highestIndex, target);
        } return -1;
    }

    /** Method Name: binarySearch
     * @Author Abhay Manoj
     * @Date November 16, 2023
     * @Modified November 16, 2023
     * @Description runs binary search
     * @Parameters lowestIndex - lowest index of array, highestIndex - highest index of array, target - element that is being looked for
     * @Returns index of the element being looked for, Data Type: Integer
     * Dependencies: N/A
     * Throws/Exceptions: N/A
     */

    public int binarySearch(int lowestIndex, int highestIndex, String target) {
        if (highestIndex >= lowestIndex && lowestIndex <= strings.length - 1) {
            int middleIndex = (lowestIndex + highestIndex) / 2; // the middle index of the array
            if (strings[middleIndex].equals(target)) return middleIndex;
            if (strings[middleIndex].compareTo(target) > 0) return binarySearch(lowestIndex, middleIndex - 1, target);
            return binarySearch(middleIndex + 1, highestIndex, target);
        } return -1;
    }

    /** Method Name: selectionSort
     * @Author Abhay Manoj
     * @Date November 16, 2023
     * @Modified November 16, 2023
     * @Description runs selection sort
     * @Parameters N/A
     * @Returns N/A, Data Type: Void
     * Dependencies: N/A
     * Throws/Exceptions: N/A
     */

    public void selectionSort() {
        int minimumIndex; // the minimum index of the array
        if (strings == null) {
            for (int i = 0; i < nums.length - 1; i++) {
                minimumIndex = i;
                for (int j = i + 1; j < nums.length; j++) if (nums[j] < nums[minimumIndex]) minimumIndex = j;
                swap(minimumIndex, i);
            }
        } else {
            for (int i = 0; i < strings.length - 1; i++) {
                minimumIndex = i;
                for (int j = i + 1; j < strings.length; j++) if (strings[j].compareTo(strings[minimumIndex]) < 0) minimumIndex = j;
                swap(minimumIndex, i);
            }
        }
    }

    /** Method Name: quickSort
     * @Author Abhay Manoj
     * @Date November 16, 2023
     * @Modified November 16, 2023
     * @Description runs quick sort
     * @Parameters lowestIndex - lowest index of array, highestIndex - highest index of array
     * @Returns N/A, Data Type: Void
     * Dependencies: N/A
     * Throws/Exceptions: N/A
     */

    public void quickSort(int lowestIndex, int highestIndex) {
        if (lowestIndex >= highestIndex) return;
        int partition = partition(lowestIndex, highestIndex); // the middle point of the array
        quickSort(lowestIndex, partition - 1);
        quickSort(partition + 1, highestIndex);
    }

    /** Method Name: partition
     * @Author Abhay Manoj
     * @Date November 16, 2023
     * @Modified November 16, 2023
     * @Description partitions array for quick sort
     * @Parameters lowestIndex - lowest index of array, highestIndex - highest index of array
     * @Returns index of the pivot point, Data Type: Integer
     * Dependencies: N/A
     * Throws/Exceptions: N/A
     */

    private int partition(int lowestIndex, int highestIndex) {
        int smallestElement = lowestIndex - 1; // the smallest element in the array
        if (strings == null) {
            int pivot = nums[highestIndex]; // the pivot point
            for (int j = lowestIndex; j <= highestIndex; j++) {
                if (nums[j] < pivot) {
                    smallestElement++;
                    swap(smallestElement, j);
                }
            }
        } else {
            String pivot = strings[highestIndex]; // the pivot point
            for (int j = lowestIndex; j <= highestIndex; j++) {
                if (strings[j].compareTo(pivot) < 0) {
                    smallestElement++;
                    swap(smallestElement, j);
                }
            }
        } swap(smallestElement + 1, highestIndex);
        return smallestElement + 1;
    }

    /** Method Name: mergeSort
     * @Author Abhay Manoj
     * @Date November 16, 2023
     * @Modified November 16, 2023
     * @Description runs merge sort
     * @Parameters leftMostIndex - left most index of array, rightMostIndex - right most index of array
     * @Returns N/A, Data Type: Void
     * Dependencies: N/A
     * Throws/Exceptions: N/A
     */

    public void mergeSort(int leftMostIndex, int rightMostIndex) {
        if (leftMostIndex >= rightMostIndex) return;
        int middleIndex = (leftMostIndex + rightMostIndex) / 2; // the middle index of the array
        mergeSort(leftMostIndex, middleIndex);
        mergeSort(middleIndex + 1, rightMostIndex);
        merge(leftMostIndex, middleIndex, rightMostIndex);
    }

    /** Method Name: merge
     * @Author Abhay Manoj
     * @Date November 16, 2023
     * @Modified November 16, 2023
     * @Description merges sorted sub arrays into one array
     * @Parameters leftMostIndex - left most index of array, middleIndex - middle index of array, rightMostIndex - right most index of array
     * @Returns N/A, Data Type: Void
     * Dependencies: N/A
     * Throws/Exceptions: N/A
     */

    private void merge(int leftMostIndex, int middleIndex, int rightMostIndex) {
        int sizeOfLeftArray = middleIndex - leftMostIndex + 1; // size of the left array
        int sizeOfRightArray = rightMostIndex - middleIndex; //  size of the right array
        int i = 0, j = 0; // initial indexes of the two arrays
        int k = leftMostIndex; // initial index of merged subarray
        if (strings == null) {
            int[] leftArray = new int[middleIndex - leftMostIndex + 1]; // the left array
            int[] rightArray = new int[rightMostIndex - middleIndex]; //  the right array
            if (sizeOfLeftArray >= 0) System.arraycopy(nums, leftMostIndex, leftArray, 0, sizeOfLeftArray);
            if (sizeOfRightArray >= 0) System.arraycopy(nums, middleIndex + 1, rightArray, 0, sizeOfRightArray);
            while (i < sizeOfLeftArray && j < sizeOfRightArray) {
                if (leftArray[i] <= rightArray[j]) {
                    nums[k] = leftArray[i];
                    i++;
                } else {
                    nums[k] = rightArray[j];
                    j++;
                } k++;
            } copyRemainingElements(leftArray, rightArray, i, j, k);
        } else {
            String[] leftArray = new String[middleIndex - leftMostIndex + 1]; // the left array
            String[] rightArray = new String[rightMostIndex - middleIndex]; //  the right array
            if (sizeOfLeftArray >= 0) System.arraycopy(strings, leftMostIndex, leftArray, 0, sizeOfLeftArray);
            if (sizeOfRightArray >= 0) System.arraycopy(strings, middleIndex + 1, rightArray, 0, sizeOfRightArray);
            while (i < sizeOfLeftArray && j < sizeOfRightArray) {
                if (leftArray[i].compareTo(rightArray[j]) <= 0) {
                    strings[k] = leftArray[i];
                    i++;
                } else {
                    strings[k] = rightArray[j];
                    j++;
                } k++;
            } copyRemainingElements(leftArray, rightArray, i, j, k);
        }
    }

    /** Method Name: copyRemainingElements
     * @Author Abhay Manoj
     * @Date November 16, 2023
     * @Modified November 16, 2023
     * @Description copies remaining elements from smaller array to main array
     * @Parameters leftArray - left sorted array, rightArray - right sorted array, i - index for left array, j - index for right array, k - index of merged array
     * @Returns N/A, Data Type: Void
     * Dependencies: N/A
     * Throws/Exceptions: N/A
     */

    private void copyRemainingElements(int[] leftArray, int[] rightArray, int i, int j, int k) {
        while (i < leftArray.length) {
            nums[k] = leftArray[i];
            i++;
            k++;
        } while (j < rightArray.length) {
            nums[k] = rightArray[j];
            j++;
            k++;
        }
    }

    /** Method Name: copyRemainingElements
     * @Author Abhay Manoj
     * @Date November 16, 2023
     * @Modified November 16, 2023
     * @Description copies remaining elements from smaller array to main array
     * @Parameters leftArray - left sorted array, rightArray - right sorted array, i - index for left array, j - index for right array, k - index of merged array
     * @Returns N/A, Data Type: Void
     * Dependencies: N/A
     * Throws/Exceptions: N/A
     */

    private void copyRemainingElements(String[] leftArray, String[] rightArray, int i, int j, int k) {
        while (i < leftArray.length) {
            strings[k] = leftArray[i];
            i++;
            k++;
        } while (j < rightArray.length) {
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
     * @Parameters i - first index, j - second index
     * @Returns N/A, Data Type: Void
     * Dependencies: N/A
     * Throws/Exceptions: N/A
     */

    private void swap(int i, int j) {
        if (strings == null) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        } else {
            String temp = strings[i];
            strings[i] = strings[j];
            strings[j] = temp;
        }

    }

    /** Method Name: printArray
     * @Author Abhay Manoj
     * @Date November 16, 2023
     * @Modified November 16, 2023
     * @Description prints array
     * @Parameters N/A
     * @Returns N/A, Data Type: Void
     * Dependencies: N/A
     * Throws/Exceptions: N/A
     */

    public void printArray() {
        if (strings == null) for (int num : nums) System.out.print(num + " ");
        else for (String string : strings) System.out.print(string + " ");
    }

    /** Method Name: printArrayInColumns
     * @Author Abhay Manoj
     * @Date November 24, 2023
     * @Modified November 24, 2023
     * @Description prints first 1000 elements in array in 10 columns
     * @Parameters N/A
     * @Returns N/A, Data Type: Void
     * Dependencies: N/A
     * Throws/Exceptions: N/A
     */

    public void printArrayInColumns() {
        int maxAmountOfElements; // max amount of elements within the array
        if (strings == null) {
            maxAmountOfElements = Math.min(nums.length, 1000);
            for (int i = 0; i < maxAmountOfElements; i++) {
                if (i % 10 == 0 && i != 0) System.out.print("\n");
                System.out.printf("%10d ", nums[i]);
            }
        } else {
            maxAmountOfElements = Math.min(strings.length, 1000);
            for (int i = 0; i < maxAmountOfElements; i++) {
                if (i % 10 == 0) System.out.print("\n");
                System.out.printf("%10s ", strings[i]);
            }
        }
    }

    /** Method Name: getArrayLength
     * @Author Abhay Manoj
     * @Date November 16, 2023
     * @Modified November 16, 2023
     * @Description returns length of array
     * @Parameters N/A
     * @Returns length of array, Data Type: Integer
     * Dependencies: N/A
     * Throws/Exceptions: N/A
     */

    public int getArrayLength() {
        if (strings == null) return nums.length;
        else return strings.length;
    }

    public static void main(String[] args) {
        SortSearchLibrary s = new SortSearchLibrary(new int[] {2314,423,5,43,53});
        SortSearchLibrary x = new SortSearchLibrary(new String[] {"asasda", "hrthrgf", "pyprthh", "wertg"});

        s.quickSort(0, s.getArrayLength() - 1);
        s.printArrayInColumns();
    }
}
