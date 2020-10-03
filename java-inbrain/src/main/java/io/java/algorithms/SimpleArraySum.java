package io.java.algorithms;

public class SimpleArraySum {

    public int getSum(Integer[] numbers) throws Exception {
        if (numbers.length != 3) {
            throw new Exception("The array in arguments must be length = 3");
        }
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }
}
