package io.java.algorithms;

public class SimpleArraySum {

    public int getSum(Integer[] numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }
}
