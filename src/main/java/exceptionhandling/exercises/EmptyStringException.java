package exceptionhandling.exercises;

public class EmptyStringException extends Exception {
    public EmptyStringException(String message) {
        super(message);
    }

    public EmptyStringException() {
        super();
    }

    public EmptyStringException(Exception e) {
        super(e);
    }
}

