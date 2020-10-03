import io.java.algorithms.CompareTriplets;

public class Application implements Cloneable {

    public static void main(String... args) {
        CompareTriplets compareTriplets = new CompareTriplets();
        int[] a = {1, 2, 3};
        int[] b = {5, 2, 1};
        System.out.println(compareTriplets.getComparison(a, b));
        System.out.println("dede");
    }
}

