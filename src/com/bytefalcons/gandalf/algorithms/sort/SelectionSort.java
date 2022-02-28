package com.bytefalcons.gandalf.algorithms.sort;

/**
 * Selection Sort
 * Runtime Complexity - n^2
 */
public class SelectionSort {

    public static void sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int minVaueIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[minVaueIndex]) {
                    minVaueIndex = j;
                }
            }

            if(minVaueIndex != i) {
                // swap value
                int minValue = arr[minVaueIndex];
                arr[minVaueIndex] = arr[i];
                arr[i] = minValue;
            }
        }

    }

}
