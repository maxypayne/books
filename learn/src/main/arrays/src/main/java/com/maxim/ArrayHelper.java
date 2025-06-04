package com.maxim;

import java.util.Arrays;

public class ArrayHelper {
    // Print array using Arrays.toString()
    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    // Sort array using Arrays.sort()
    public static void sortArray(int[] arr) {
        Arrays.sort(arr); // sorts in-place
    }

    // Copy array using Arrays.copyOf()
    public static int[] copyArray(int[] arr) {
        return Arrays.copyOf(arr, arr.length);
    }

    // Compare two arrays using Arrays.equals()
    public static boolean areEqual(int[] a, int[] b) {
        return Arrays.equals(a, b);
    }

    // Fill array with a value using Arrays.fill()
    public static void fillArray(int[] arr, int value) {
        Arrays.fill(arr, value);
    }

    // Search for a value using Arrays.binarySearch()
    public static int binarySearch(int[] arr, int key) {
        Arrays.sort(arr); // binary search requires sorted array
        return Arrays.binarySearch(arr, key);
    }

    // Convert part of an array using Arrays.copyOfRange()
    public static int[] sliceArray(int[] arr, int start, int end) {
        return Arrays.copyOfRange(arr, start, end);
    }

    // Print 2D array using Arrays.deepToString()
    public static void print2DArray(int[][] arr) {
        System.out.println(Arrays.deepToString(arr));
    }
}
