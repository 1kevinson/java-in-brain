package io.java.algorithms;

import java.util.Arrays;

public class CompareTriplets {

    public int[] getComparison(int[] arrayAlice, int[] arrayBob) {
        int alicePoints = 0;
        int bobPoints = 0;

        for (int i = 0; i < arrayAlice.length; i++) {
            if (arrayAlice[i] > arrayBob[i]) {
                alicePoints++;
            } else if(arrayAlice[i] < arrayBob[i]) {
                bobPoints++;
            }
        }
        int[] actualResult = {alicePoints,bobPoints};
        System.out.println(Arrays.toString(actualResult));
        return actualResult;
    }
}
