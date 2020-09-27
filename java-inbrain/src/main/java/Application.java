import io.java.algorithms.PrintPattern;
import io.java.codes.Animal;
import io.java.codes.Dog;

import java.util.regex.Pattern;

public class Application implements Cloneable {

    public static void main(String... args) {
       PrintPattern.getPrint();
        Dog d = new Dog();
        Animal e = new Dog();

        System.out.println(Pattern.matches(".(w)+s","esijdfis"));
        System.out.println(d instanceof Animal);
        System.out.println(e instanceof Animal);
    }
}

