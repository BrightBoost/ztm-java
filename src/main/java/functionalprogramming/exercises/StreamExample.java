package functionalprogramming.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> squaredOddNrs = numbers.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> n * n).collect(Collectors.toList());
        System.out.println("Squared odd numbers: " + squaredOddNrs);
    }

}
