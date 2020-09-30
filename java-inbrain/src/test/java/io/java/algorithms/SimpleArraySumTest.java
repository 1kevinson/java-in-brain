package io.java.algorithms;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.Simple.class)
public class SimpleArraySumTest {

    private final SimpleArraySum simpleArraySum = new SimpleArraySum();

    @Test
    @DisplayName("Check sum of array parameters")
    public void getSumTest() {
        assertEquals(24, simpleArraySum.getSum(new Integer[]{3, 6, 7, 8}));
        assertEquals(162, simpleArraySum.getSum(new Integer[]{-3, 56, 37, 81,-9}));
    }
}
