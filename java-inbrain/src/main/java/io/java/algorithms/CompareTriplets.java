package io.java.algorithms;

public class CompareTriplets {

    public int[] getComparison(int[] array1, int[] array2) {
        int ashleyPoints = 0;
        int bobPoints = 0;

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] >= array2[i]) {
                ashleyPoints += 1;
            } else {
                bobPoints += 1;
            }
        }
        System.out.println(ashleyPoints);
        return new int[] {ashleyPoints,bobPoints};
    }
}
