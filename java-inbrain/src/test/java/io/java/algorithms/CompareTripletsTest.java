package io.java.algorithms;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;

@RunWith(Parameterized.class)
@DisplayName("Compare triplets")
public class CompareTripletsTest {

    private final int[] person1Numbers;
    private final int[] person2Numbers;
    private CompareTriplets compareTriplets;

    public CompareTripletsTest(int[] person1Numbers, int[] person2Numbers) {
        this.person1Numbers = person1Numbers;
        this.person2Numbers = person2Numbers;
    }

    @Before
    public void initialize() {
        this.compareTriplets = new CompareTriplets();
    }

    // Each parameter should be placed as an argument in constructor
    @Parameterized.Parameters
    public static Collection arrayOfScores() {
        return Arrays.asList(new int[][][]{
                {{2, 3, 4}, {4, 3, 5}}
        });
    }

    @Test
    public void compare2TripletsTest() {
        int[] expectedResult = {0,2};
        assertAll(
            () -> Arrays.stream(person1Numbers).forEach(el -> assertTrue(0 <= el || el <= 100)),
            () -> Arrays.stream(person2Numbers).forEach(el -> assertTrue(0 <= el || el <= 100)),
            () -> assertEquals(expectedResult, this.compareTriplets.getComparison(person1Numbers, person2Numbers))
        );

    }
}
