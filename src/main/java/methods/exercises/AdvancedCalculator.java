package methods.exercises;

public class AdvancedCalculator {
    public static void performCalculations(int a, int b) {
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        double quotient = (double) a / b;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }

}
