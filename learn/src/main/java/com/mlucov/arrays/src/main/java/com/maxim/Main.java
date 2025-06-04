package com.maxim;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] data = {5, 2, 8, 1, 3};


        ArrayHelper.printArray(data);           // ➜ [5, 2, 8, 1, 3]
        ArrayHelper.sortArray(data);
        ArrayHelper.printArray(data);           // ➜ [1, 2, 3, 5, 8]

        int[] copy = ArrayHelper.copyArray(data);
        System.out.println(ArrayHelper.areEqual(data, copy)); // ➜ true

        ArrayHelper.fillArray(copy, 9);
        ArrayHelper.printArray(copy);           // ➜ [9, 9, 9, 9, 9]

        int index = ArrayHelper.binarySearch(data, 5);
        System.out.println("Found at: " + index); // ➜ Found at: 3 (after sorting)

        int[] part = ArrayHelper.sliceArray(data, 1, 4);
        ArrayHelper.printArray(part);

        sumArray(data);
        findMaxAndMin(data);
        fillArray(6, 78);
        removeDuplicates();
        reverseAnArray();
        secondLargest();
        sumMatrix();
        longestWord();
    }

    private static void sumArray(int[] data) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        System.out.println("sum = " + sum);
    }

    private static void findMaxAndMin(int[] arr) {
        int[] copy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copy);
        int max = copy[copy.length - 1];
        int min = copy[0];
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        compareArrays(arr, copy);
    }

    private static void compareArrays(int[] arr, int[] compare) {
        int res = Arrays.compare(arr, compare);
        System.out.println(res);
    }

    private static void fillArray(int size, int value) {
        int[] arrToFill = new int[size];
        Arrays.fill(arrToFill, value);
        System.out.println(Arrays.toString(arrToFill));
    }
    private static void binarySearch(int[] arr, int target) {
        // Write a method that:
        // - Sorts the array
        // -Searches for a specific number using Arrays.binarySearch().
    }
    private static void sliceAnArray(int[] arr, int target) {
        // Write a method that:
        // - Sorts the array
        // -Searches for a specific number using Arrays.binarySearch().
    }
    private static void removeDuplicates() {
        int[] arr = {1,2,34,9,2,55,8,12,34};
        System.out.println("remove duplicates");
        System.out.println(Arrays.toString(arr));
        int futureIndexForArray = 0;
        int[] tmp = new int[arr.length];
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1 || arr[i] != arr[i + 1]) {
                tmp[futureIndexForArray] = arr[i];
                futureIndexForArray++;
            }
        }
        System.out.println("Arrays.toString(tmp)");
        System.out.println(Arrays.toString(tmp));
        int[] arrWithoutDuplicates = new int[futureIndexForArray];
        for (int i = 0; i < futureIndexForArray; i++) {
            arrWithoutDuplicates[i] = tmp[i];
        }
        System.out.println("Arrays.toString(arrWithoutDuplicates)");
        System.out.println(Arrays.toString(arrWithoutDuplicates));

    }
    private static void reverseAnArray() {
        System.out.println();
        System.out.println("*************Reversed array***********");
        int[] arr = {1,2,34,9,2,55,8,12,34};
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        System.out.println(Arrays.toString(reversed));
    }
    public static void secondLargest() {
        // Your code here
        int[] arr = {1,2,34,9,2,55,8,12,34};
        Arrays.sort(arr);
        System.out.println("****************Second largest**************");
        System.out.println(arr[arr.length - 2]);
    }

    /**
     * 3. Rotate the array to the right by k steps.
     * For example, [1,2,3,4,5] rotated by 2 becomes [4,5,1,2,3].
     */
    public static void rotateRight(int[] arr, int k) {
        // Your code here
    }

    public static String longestWord() {
        System.out.println("**************Longest Word**************");
        String[] words = {"first", "second", "third", "fourth", "fifth", "sixth"};
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println(longestWord);
        return null;
    }

    public static void sumMatrix() {
        // TODO: Use nested loops to sum
        System.out.println("******************Sum Matrix**************");
        int[][] matrix = {{1,2}, {3,4},{5,6},{7,8}};
        var sum = 0;
        for (int[] row : matrix) {
            for (int col : row) {
                sum += col;
            }
        }
        System.out.println("sum = " + sum);
    }

    // 7. Check if matrix is symmetric
    // Hint: matrix[i][j] == matrix[j][i]
    public static boolean isSymmetric(int[][] matrix) {
        // TODO: Your code here
        return false;
    }

    // 8. Print diagonals of a square matrix
    public static void printDiagonals(int[][] matrix) {
        // TODO: Print primary and secondary diagonals
    }

    // 9. Find the max element in 2D array
    public static int findMax(int[][] matrix) {
        // TODO: Track max while iterating
        return 0;
    }

    // 10. Transpose the matrix
    // Hint: result[j][i] = matrix[i][j]
    public static int[][] transpose(int[][] matrix) {
        // TODO: Create new matrix and transpose
        return null;
    }
}