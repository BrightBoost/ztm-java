package constructors.exercises.exercise3superandthis;

public class Dog extends Animal {
    private String breed;

    public Dog(String breed, String species, int age) {
        super(species, age);
        this.breed = breed;
    }

    public Dog() {
        this("unknown", "Dog", 5);
    }
}

