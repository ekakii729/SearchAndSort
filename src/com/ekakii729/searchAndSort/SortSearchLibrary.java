package com.ekakii729.searchAndSort;

import java.util.Random;

public class SortSearchLibrary {

    public static void selectionSort(int[] nums) {
        final int ARRAY_INDEX_COUNT = nums.length; // the index count of the array
        for (int i = 0; i < ARRAY_INDEX_COUNT - 1; i++) {
            int minimumIndex = i; // the minimum index
            for (int j = i + 1; j < ARRAY_INDEX_COUNT; j++) if (nums[j] < nums[minimumIndex]) minimumIndex = j;
            swap(nums, minimumIndex, i);
        }
    }

    public static void quickSort(int[] nums, int lowestIndex, int highestIndex) {
        if (lowestIndex >= highestIndex) return;
        int partition = partition(nums, lowestIndex, highestIndex); // the middle point of the array
        quickSort(nums, lowestIndex, partition - 1);
        quickSort(nums, partition + 1, highestIndex);
    }

    private static int partition(int[] nums, int lowestIndex, int highestIndex) {
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

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void printArray(int[] nums) {
        for (int num : nums) System.out.println(num);
    }

    public static void main(String[] args) {

    }
}