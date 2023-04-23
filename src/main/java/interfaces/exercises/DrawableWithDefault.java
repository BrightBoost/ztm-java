package interfaces.exercises;

public interface DrawableWithDefault {
    void draw();

    default void erase() {
        System.out.println("Erasing the drawing.");
    }

    // part of the last exercise
    default void printInfo() {
        System.out.println("Drawable info.");
    }


}
