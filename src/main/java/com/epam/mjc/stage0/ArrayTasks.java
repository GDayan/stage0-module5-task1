package com.epam.mjc.stage0;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that lists all the seasons of the year, starting with winter.
     * @return String[] array of seasons
     */
    public String[] seasonsArray() {
        String[] seasons = new String[4];
        seasons[0] = "Winter";
        seasons[1] = "Spring";
        seasons[2] = "Summer";
        seasons[3] = "Fall";
        return seasons;
    }

    /**
     * Generate an int[] array of consecutive positive integers starting at 1 of the given length.
     * @param length Length of the array (must be > 0)
     * @return int[] array of consecutive integers starting at 1
     */
    public int[] generateNumbers(int length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length must be greater than 0");
        }
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = i + 1;
        }
        return numbers;
    }

    /**
     * Find the sum of all elements in an int[] array.
     * @param arr The array of integers
     * @return The sum of all elements in the array
     */
    public int totalSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    /**
     * Return the index of the first occurrence of number in the arr array.
     * If there is no such element, return -1.
     * @param arr The array of integers
     * @param number The number to find
     * @return The index of the first occurrence or -1 if not found
     */
    public int findIndexOfNumber(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Return a new String[] array obtained from the arr array by reversing the order of the elements.
     * @param arr The input array of strings
     * @return A new array with elements in reversed order
     */
    public String[] reverseArray(String[] arr) {
        String[] reversed = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    /**
     * Return a new int[] array containing only positive numbers from the input array.
     * @param arr The input array of integers
     * @return A new array containing only positive numbers
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                count++;
            }
        }
        int[] positiveNumbers = new int[count];
        int index = 0;
        for (int num : arr) {
            if (num > 0) {
                positiveNumbers[index++] = num;
            }
        }
        return positiveNumbers;
    }

    /**
     * [OPTIONAL] Return a sorted, ragged, two-dimensional int[][] array.
     * Incoming one-dimensional arrays are sorted in ascending order of their length.
     * Numbers in all one-dimensional arrays are sorted in ascending order.
     * @param arr The ragged array of integers
     * @return A sorted, ragged two-dimensional array
     */
    public int[][] sortRaggedArray(int[][] arr) {
        // Helper function to sort individual arrays
        for (int[] subArray : arr) {
            for (int i = 0; i < subArray.length - 1; i++) {
                for (int j = i + 1; j < subArray.length; j++) {
                    if (subArray[i] > subArray[j]) {
                        int temp = subArray[i];
                        subArray[i] = subArray[j];
                        subArray[j] = temp;
                    }
                }
            }
        }

        // Sort the arrays by their length
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].length > arr[j].length) {
                    int[] temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        ArrayTasks tasks = new ArrayTasks();

        // Test cases to validate the methods
        printArray("Seasons:", tasks.seasonsArray());
        printArray("Generated numbers:", tasks.generateNumbers(5));
        System.out.println("Total sum: " + tasks.totalSum(new int[]{1, 3, 5}));
        System.out.println("Index of number 5: " + tasks.findIndexOfNumber(new int[]{99, -7, 102}, -7));
        printArray("Reversed array:", tasks.reverseArray(new String[]{"Bob", "Nick"}));
        printArray("Positive numbers:", tasks.getOnlyPositiveNumbers(new int[]{1, -2, 3}));

        int[][] raggedArray = {{3, 1, 2}, {3, 2}};
        print2DArray("Sorted ragged array:", tasks.sortRaggedArray(raggedArray));
    }

    // Helper method to print 1D arrays
    private static void printArray(String message, int[] array) {
        System.out.print(message + " [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // Helper method to print 1D string arrays
    private static void printArray(String message, String[] array) {
        System.out.print(message + " [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // Helper method to print 2D arrays
    private static void print2DArray(String message, int[][] array) {
        System.out.print(message + " [");
        for (int i = 0; i < array.length; i++) {
            System.out.print("[");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
                if (j < array[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print("]");
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

