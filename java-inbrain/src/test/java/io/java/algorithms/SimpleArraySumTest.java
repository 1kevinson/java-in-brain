package io.java.algorithms;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Simple Array Test Cases")
public class SimpleArraySumTest {

    private final io.java.algorithms.SimpleArraySum simpleArraySum = new io.java.algorithms.SimpleArraySum();

    @Test
    @DisplayName("Check the array Length of the method argument")
    void checkTheArrayLengthOfArgument() {
        Exception exception = assertThrows(Exception.class, () -> simpleArraySum.getSum(new Integer[4]));

        String expectedMessage = "The array in arguments must be length = 3";
        String actualMessage = exception.getMessage();

        assertEquals(expectedMessage, actualMessage,"The Exception message is wrong");
    }

    @Test
    @DisplayName("Get the sum of array elements")
    public void returnTheSumOfElementsInArgumentArray() throws Exception {
        assertEquals(16, simpleArraySum.getSum(new Integer[]{3, 6, 7}));
        assertEquals(90, simpleArraySum.getSum(new Integer[]{-3, 56, 37}));
    }
}
