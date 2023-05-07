package lambdaexpressions;

public class Main {
    public static void main(String[] args) {
        Calculator c1 = (x, y) -> x + y;
        Calculator c2 = (x, y) -> x - y;
        System.out.println(c1.calculate(3, 5));
        System.out.println(c2.calculate(3, 5));
        Calculator c3 = (x, y) -> {
            System.out.println("Hello from the lambda expression");
            return x * y;
        };
        System.out.println(c3.calculate(3, 5));

        Printer p1 = s -> System.out.println("Printer says: " + s);
        p1.print("Hello!");

        NumberProvider np1 = () -> 42;
        System.out.println(np1.provide());

        int result1 = execute(3, 5, c1);
        int result2 = execute(3, 5, c2);
        int result3 = execute(3, 5, c3);
        int result4 = execute(3, 5, new CalculatorImpl());
        int result5 = execute(3, 5, (x, y) -> x / y);
        System.out.println(result1 + " " + result2 + " " + result3 + " " + result4 + " " + result5);
    }

    public static int execute(int nr1, int nr2, Calculator calculator) {
        return calculator.calculate(nr1, nr2);
    }
}
