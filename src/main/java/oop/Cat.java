package oop;

public class Cat extends Animal {
    public static String type = "Cat";
    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }
}
