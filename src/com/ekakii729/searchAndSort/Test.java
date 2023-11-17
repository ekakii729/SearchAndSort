package com.ekakii729.searchAndSort;

public class Test {

    public static void main(String[] args) {

        SortSearchLibrary intSort = new SortSearchLibrary(new int[] {12,312, 325,34,5,234,12,3});
        SortSearchLibrary stringSort = new SortSearchLibrary(new String[] {"dsaa","asdasdasdas","dasda", "asda", "wverbre"});

        intSort.selectionSort();
        stringSort.selectionSort();

        intSort.printArray();
        System.out.println();
        stringSort.printArray();
        System.out.println();

        System.out.println(intSort.binarySearch(0, intSort.getArrayLength() - 1, 12));
        System.out.println(stringSort.binarySearch(0, stringSort.getArrayLength() - 1, "asda"));
    }
}
