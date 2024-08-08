package com.epam.mjc.stage0;

import com.epam.mjc.stage0.utils.Complexity;
import org.apache.commons.codec.digest.DigestUtils;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AlgorithmComplexityTest {

    // Define an enum to represent different algorithm complexities.
    public enum Complexity {
        O_LOG_N,       // O(log N)
        O_N_2,         // O(N^2)
        O_FACTORIAL_N, // O(N!)
        O_2_N,         // O(2^N)
        O_N_LOG_N,     // O(N * log N)
        O_1,           // O(1)
        O_N            // O(N)
    }

    // Method to return the linear search complexity when the element is at the end of the array.
    public Complexity badLinearSearch() {
        return Complexity.O_N;
    }

    // Method to return the complexity of accessing an array element by index.
    public Complexity arrayIndexItemAccess() {
        return Complexity.O_1;
    }

    // Method to return the complexity of a binary search.
    public Complexity binarySorting() {
        return Complexity.O_LOG_N;
    }

    // Method to return the complexity of a sorting algorithm with two nested loops.
    public Complexity twoCycleSorting() {
        return Complexity.O_N_2;
    }
}