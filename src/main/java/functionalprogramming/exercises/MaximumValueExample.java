package functionalprogramming.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaximumValueExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Optional<Integer> max = numbers.stream().max(Integer::compare);
        max.ifPresent(value -> System.out.println("Maximum value: " + value));
    }
}

