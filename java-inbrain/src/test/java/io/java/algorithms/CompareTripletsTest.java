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
        //Arrange
        int[] a = {1,2,3};
        int[] b = {5,2,1};

        //Act
        Map<String,Integer> expected = compareTriplets.getComparison(a,b);
        System.out.println(expected);
        System.out.println(compareTriplets.getComparison(a,b));

        //Assert
        assertEquals(compareTriplets.getComparison(a,b).get("Alica"), 1);
        assertEquals(compareTriplets.getComparison(a,b).get("Bob"), 1);
    }

}
