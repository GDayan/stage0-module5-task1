package com.epam.mjc.stage0;

import com.epam.mjc.stage0.utils.Complexity;
import org.apache.commons.codec.digest.DigestUtils;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlgorithmComplexityTest {

    private final AlgorithmComplexity algorithmComplexity = new AlgorithmComplexity();

    @Test
    public void testBadLinearSearch() {
        assertEquals(Complexity.O_N, algorithmComplexity.badLinearSearch());
    }

    @Test
    public void testArrayIndexItemAccess() {
        assertEquals(Complexity.O_1, algorithmComplexity.arrayIndexItemAccess());
    }

    @Test
    public void testBinarySorting() {
        assertEquals(Complexity.O_LOG_N, algorithmComplexity.binarySorting());
    }

    @Test
    public void testTwoCycleSorting() {
        assertEquals(Complexity.O_N, algorithmComplexity.twoCycleSorting());
    }
}