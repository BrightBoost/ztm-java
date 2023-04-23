package oop.exercises;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Roar");
        Bird bird = new Bird();
        Parrot parrot = new Parrot();

        animal.makeSound();
        bird.makeSound();
        parrot.makeSound();
    }

}
