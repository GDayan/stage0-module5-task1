package com.epam.mjc.stage0;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    public String[] seasonsArray() {
        return new String[]{"winter", "spring", "summer", "autumn"};
    }

    public int[] generateNumbers(int length) {
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = i + 1;
        }
        return result;
    }

    public int totalSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public int findIndexOfNumber(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public String[] reverseArray(String[] arr) {
        String[] reversedArray = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArray[i] = arr[arr.length - i - 1];
        }
        return reversedArray;
    }

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

    public int[][] sortRaggedArray(int[][] arr) {
        Arrays.sort(arr, Comparator.comparingInt(a -> a.length));
        for (int[] subArr : arr) {
            Arrays.sort(subArr);
        }
        return arr;
    }
}
