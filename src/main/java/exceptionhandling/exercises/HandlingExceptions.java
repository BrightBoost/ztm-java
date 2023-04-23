package exceptionhandling.exercises;

public class HandlingExceptions {
    public static void main(String[] args) {
        try {
            ThrowingExceptions.validateNumber(-1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

}
