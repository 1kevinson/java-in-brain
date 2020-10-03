package io.java.algorithms;

import java.util.HashMap;
import java.util.Map;

public class CompareTriplets {

    public Map<String, Integer> getComparison(int[] a, int[] b) {
        int aPoints = 0;
        int bPoints = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 1 || b[i] < 1 || a[i] > 100 || b[i] > 100) {
                throw new ArrayIndexOutOfBoundsException();
            }

            if (a[i] < b[i]) {
                bPoints =+ 1;
            } else if (a[i] > b[i]) {
                aPoints =+ 1;
            }
        }

        Map<String, Integer> result = new HashMap<>();
        result.put("Alicia", aPoints);
        result.put("Bob", bPoints);
        System.out.println(result);
        return result;
    }
}
