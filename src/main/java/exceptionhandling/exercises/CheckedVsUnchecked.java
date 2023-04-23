package exceptionhandling.exercises;

public class CheckedVsUnchecked {
    public static void validateString(String input) throws EmptyStringException {
        if (input.isEmpty()) {
            throw new EmptyStringException("The provided string is empty.");
        }
    }

}
