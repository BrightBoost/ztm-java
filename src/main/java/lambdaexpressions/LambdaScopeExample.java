package lambdaexpressions;

public class LambdaScopeExample {
    public static void main(String[] args) {
        int localVar = 6;
        Calculator calculator = (a, b) -> a * b + localVar;
        int result = calculator.calculate(3, 5);
        System.out.println(result);
    }
}
