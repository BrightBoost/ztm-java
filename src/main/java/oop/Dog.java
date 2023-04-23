package oop;

public class Dog extends Animal {
    public static String type = "Dog";

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    public void eat(String food) {
        System.out.println("Dog is eating " + food);
    }

    public void bark() {
        System.out.println("woof woof");
    }
}
