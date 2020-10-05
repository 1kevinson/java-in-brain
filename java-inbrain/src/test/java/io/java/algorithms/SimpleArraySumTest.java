package io.java.algorithms;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Simple Array Test Cases")
public class SimpleArraySumTest {

    private final SimpleArraySum simpleArraySum = new SimpleArraySum();

    @Test
    @DisplayName("Check the array Length of the method arguments")
    void checkTheArrayLengthOfArgument() {
        Integer[] arg = new Integer[4];
        Arrays.setAll(arg, p -> p = 5);
        Exception exception = assertThrows(Exception.class, () -> simpleArraySum.getSum(arg));

        String expectedMessage = "The array in arguments must be length = 3";
        String actualMessage = exception.getMessage();

        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    @DisplayName("Get the sum of array elements")
    public void returnTheSumOfElementsInArgumentArray() throws Exception {
        assertEquals(16, simpleArraySum.getSum(new Integer[]{3, 6, 7}));
        assertEquals(90, simpleArraySum.getSum(new Integer[]{-3, 56, 37}));
    }
}
