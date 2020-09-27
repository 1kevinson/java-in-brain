package io.java.codes;

public class Variables {

    public static void getLocals() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("+");
            }
            System.out.println();
        }
    }
}
