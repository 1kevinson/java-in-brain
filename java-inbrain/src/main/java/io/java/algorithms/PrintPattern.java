package io.java.algorithms;

public class PrintPattern {
    public static void getPrint() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("+");
            }
            System.out.println();
        }
    }
}
