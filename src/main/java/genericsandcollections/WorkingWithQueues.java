package genericsandcollections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class WorkingWithQueues {
    public static void main(String[] args) {
        Deque<String> strings = new ArrayDeque<>();
        strings.add("Java");
        strings.add("Python");
        strings.add("C#");

        System.out.println(strings);
        strings.pop();
        System.out.println(strings);
        strings.addFirst("Java");
        strings.addLast("Rust");
        System.out.println(strings);
        System.out.println(strings.peek());
        System.out.println(strings);
        System.out.println(strings.pollLast());
        System.out.println(strings);

    }
}
