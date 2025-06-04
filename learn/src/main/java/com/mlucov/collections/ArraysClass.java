package com.mlucov.collections;

import java.util.Arrays;

public class ArraysClass {
    int[] arr1 = { 2, 4, 5, 9, 5, 9 };
    int[] arr2 = { 25, 30, 45, 50, 52, 60 };
    ArraysClass() {
        int index = Arrays.binarySearch(arr1, 6);
        boolean isEqual = Arrays.equals(arr1, arr2);
        int[] newArr = Arrays.copyOf(arr1, 4);

    }
}
