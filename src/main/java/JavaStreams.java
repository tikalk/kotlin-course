import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreams {

    List<Integer> numbers = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);

    List<Integer> filteredList = numbers
            .stream()
            .filter(number -> number > 5)
            .peek(System.out::println)
            .collect(Collectors.toList());

}
