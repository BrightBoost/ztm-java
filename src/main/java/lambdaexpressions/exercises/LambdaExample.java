package lambdaexpressions.exercises;

public class LambdaExample {
    public static void main(String[] args) {
        NumericOperator addition = (x, y) -> x + y;
        int sum = addition.operate(5, 3);
        System.out.println("Sum: " + sum);

        // exercise Lambda Expression for Comparison
        NumericOperator maximum = (a, b) -> (a > b) ? a : b;
        int max = maximum.operate(5, 3);
        System.out.println("Max: " + max);

        // exercise Implementing the StringFormatter Interface
        StringFormatter toUpperCase = input -> input.toUpperCase();
        String uppercaseString = toUpperCase.format("hello world");
        System.out.println("Uppercase: " + uppercaseString);



    }
}
