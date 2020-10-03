package io.java.algorithms;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Compare 2 triplets arrays")
public class CompareTripletsTest {

    private final CompareTriplets compareTriplets = new CompareTriplets();

    @Test
    @DisplayName("Check that comparison of two array is OK")
    void checkThatComparisonIsCorrect() {
        int[] a = {1,2,3};
        int[] b = {5,2,1};

        Map<String,Integer> expected = compareTriplets.getComparison(a,b);

        System.out.println(expected);
        assertEquals((int) expected.get("Alicia"), 1);
        assertEquals((int) expected.get("Bob"), 1);
    }

}
