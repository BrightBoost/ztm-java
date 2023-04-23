package interfaces;

public interface Predator {
    void catchAndEat();

    default void eat(Prey p) {
        System.out.println("Eating: " + p.getClass().getName());
    }

    default void run() {
        System.out.println("Predator is running");
    }
}
