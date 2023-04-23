package oop.exercises;

public class Bird extends Animal {
    public Bird() {
        super("Chirp");
    }

    @Override
    public void makeSound() {
        System.out.println("Bird sound: " + getSound());
    }

}
