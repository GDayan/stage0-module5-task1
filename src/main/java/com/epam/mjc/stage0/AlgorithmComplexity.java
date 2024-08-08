package com.epam.mjc.stage0;

import com.epam.mjc.stage0.utils.Complexity;

public class AlgorithmComplexity {

    /**
     * Return the linear search complexity if the element you are looking for is at the end of the array.
     */
    public Complexity badLinearSearch() {
        return Complexity.O_N; // Linear search complexity
    }

    /**
     * Return the complexity of accessing an array element by index.
     */
    public Complexity arrayIndexItemAccess() {
        return Complexity.O_1; // Array index access complexity
    }

    /**
     * Return the complexity of a binary search.
     */
    public Complexity binarySorting() {
        return Complexity.O_LOG_N; // Binary search complexity
    }

    /**
     * Return the complexity of the twoCycleSorting algorithm.
     */
    public Complexity twoCycleSorting() {
        return Complexity.O_N; // Assuming two-cycle sorting is linear for simplicity
    }
}
