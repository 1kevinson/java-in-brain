import io.java.algorithms.PrintPattern;
import io.java.codes.Animal;
import io.java.codes.Dog;

import java.awt.print.Printable;

public class Application {
    public static void main(String... args) {
       PrintPattern.getPrint();
        Dog d = new Dog();
        Animal e = new Dog();
        System.out.println(d instanceof Animal);
        System.out.println(e instanceof Animal);
    }
}

