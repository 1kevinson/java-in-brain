package io.java.algorithms;

import java.util.HashMap;
import java.util.Map;

public class CompareTriplets {

    public Map<String, Integer> getComparison(int[] a, int[] b) {
        a = new int[3];
        b = new int[3];
        int aPoints = 0;
        int bPoints = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < b[i]) {
                aPoints += 1;
            } else if (a[i] > b[i]) {
                bPoints += 1;
            }
        }

        Map<String, Integer> result = new HashMap<>();
        result.put("Alica", aPoints);
        result.put("Bob", bPoints);

        return result;
    }
}
