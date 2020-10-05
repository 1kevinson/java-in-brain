import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Application implements Cloneable {

    public static void main(String... args) {
        //Map & Optional transform value of the optional with using class method on it
        List<Integer> year = Arrays.asList(2016, 2020, 2080, 2000);
        int yearOptional = Optional.of(year).map(List::size).orElse(0);
        System.out.println(yearOptional);       // 4

        String password = " password ";
        boolean passOpt = Optional.of(password).map(String::trim).filter(pass -> pass.equals("password")).isPresent();
        System.out.println(passOpt);

        List<String> alpha = Arrays.asList("a", "b", "c", "d");
        List<String> collect = alpha.stream().map(String::toUpperCase)
                .map(c -> c + "Hello from K ")
                .collect(Collectors.toList());
        System.out.println(collect);        // [Hello from K a, Hello from K b, Hello from K c, Hello from K]

        // Optional
        List<Optional<String>> listOfOptionals = Arrays.asList(
                Optional.empty(), Optional.of("foo"), Optional.empty(), Optional.of("bar"));

        List<String> filteredStream = listOfOptionals
                .stream()
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());

        System.out.println(filteredStream); // [foo,bar]

        //Flatmap
        String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};
        Arrays.stream(data)
                .flatMap(Arrays::stream) //abcdef
                .forEach(String::toUpperCase); //ABCDEF


    }
}
