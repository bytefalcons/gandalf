package com.bytefalcons.gandalf.algorithms.sort;

/**
 *
 * Runtime Complexity - n * (log n)
 */
public class MergeSort {

    public static void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    /**
     *
     * @param arr
     * @param startIndex
     * @param endIndex
     */
    private static void sort(int[] arr, int startIndex, int endIndex) {

        if(startIndex < endIndex) {

            int center  = ( startIndex + endIndex ) / 2;
            sort(arr, startIndex, center);
            sort(arr, center + 1, endIndex);

            merge(arr, startIndex, center ,endIndex);
        }

    }

    /**
     *
     * @param arr
     * @param startIndex
     * @param center
     * @param endIndex
     */
    private static void merge(int[] arr, int startIndex, int center, int endIndex) {

        // Find size of the sub-arrays
        int lArraySize = center - startIndex + 1; // left Array Size
        int rArraySize = endIndex - center; // right Array Size

        // Create temp Arrays
        int left[]  = new int[lArraySize];
        int right[] = new int[rArraySize];

        // Copy data to temp Array
        for (int i = 0; i < lArraySize; i++) {
            left[i] = arr[startIndex + i];
        }

        for (int j = 0; j < rArraySize; j++) {
            right[j] = arr[center + 1 + j];
        }

        int i = 0;
        int j = 0;
        int indexOfMergedArr = startIndex;

        // Compare and copy elements
        while (i < lArraySize && j < rArraySize) {
            if(left[i] <= right[j]) {
                arr[indexOfMergedArr] = left[i];
                i++;
            } else {
                arr[indexOfMergedArr] = right[j];
                j++;
            }
            indexOfMergedArr++;
        }

        // Copy remaining elements in left Array
        while (i < lArraySize) {
            arr[indexOfMergedArr] = left[i];
            i++;
            indexOfMergedArr++;
        }

        // Copy remaining elements in right Array
        while (j < rArraySize) {
            arr[indexOfMergedArr] = right[j];
            j++;
            indexOfMergedArr++;
        }
    }

}
