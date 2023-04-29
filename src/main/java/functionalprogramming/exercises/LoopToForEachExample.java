package functionalprogramming.exercises;

import java.util.Arrays;
import java.util.List;

public class LoopToForEachExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("hello", "world", "functional", "programming");

        // Using a for loop
        for (String s : strings) {
            System.out.println(s);
        }

        // Using forEach and a lambda expression
        strings.forEach(s -> System.out.println(s));
    }
}

