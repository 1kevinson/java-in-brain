package io.java.codes;

interface Printable {
    default void isNotPrintable() {
    }

    void isPrintable();
}

interface Bank {
    void rateOfInterest();
}

class SG implements Bank {
    @Override
    public void rateOfInterest() {
        System.out.println("4%");
    }
}

public class Dog extends Animal implements Printable {

    Bank b = new SG();

    public void isPrintable() {
        b.rateOfInterest();
    }
}
