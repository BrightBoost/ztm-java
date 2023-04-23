package genericsandcollections.exercises.exercise2usingclasseswithgenerics;

public class Main {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.setContent(42);

        Box<String> stringBox = new Box<>();
        stringBox.setContent("Hello, world!");
    }

}
