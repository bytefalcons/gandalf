package com.bytefalcons.gandalf.algorithms.sort;

/**
 * BubbleSort
 * Runtime Complexity O(n2)
 */
public class BubbleSort {

    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < (arr.length -1 -i); j++) {
                if(arr[j] > arr[j+1]) {
                    int lesser = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = lesser;
                }
            }
        }
        return arr;
    }
}
