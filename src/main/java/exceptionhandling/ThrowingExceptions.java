package exceptionhandling;

public class ThrowingExceptions {
    public static void main(String[] args) throws Exception {
       divide(2, 0);
    }

    public static void divide(int a, int b) {
        if(b == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        System.out.println(a / b);
    }
}
