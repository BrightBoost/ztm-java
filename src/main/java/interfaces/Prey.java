package interfaces;

public interface Prey {
    void runAndHide();

    default void run() {
        System.out.println("Prey is running");
    }
}
