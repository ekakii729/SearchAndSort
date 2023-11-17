package com.ekakii729.searchAndSort;

public class Test {

    public static void main(String[] args) {
        SortSearchLibrary s = new SortSearchLibrary();
        int[] nums = {123,1,4,342,42,4,12,31,23,23,4,3};
        String[] strings = {"a", "dasd", "asdad", "asdasd", "asdada", "asdasa"};
        s.mergeSort(strings, 0, 5);
        s.mergeSort(nums, 0, 11);
        s.printArray(strings);
        System.out.println();
        s.printArray(nums);
    }
}
