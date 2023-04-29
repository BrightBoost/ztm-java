package functionalprogramming.exercises;

import java.util.Arrays;
import java.util.List;

public class TerminalOperationsExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        long evenCount = numbers.stream()
                .filter(n -> n % 2 == 0)
                .count();
        System.out.println("Number of even numbers: " + evenCount);
    }
}
