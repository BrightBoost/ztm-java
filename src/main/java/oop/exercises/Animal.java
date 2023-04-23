package oop.exercises;

public class Animal {
    private String sound;

    public Animal(String sound) {
        setSound(sound);
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void makeSound() {
        System.out.println("Animal sound: " + getSound());
    }

}
