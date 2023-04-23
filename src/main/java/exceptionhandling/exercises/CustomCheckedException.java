package exceptionhandling.exercises;

public class CustomCheckedException {
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 120) {
            throw new InvalidAgeException("The provided age is invalid.");
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(130);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }

}
