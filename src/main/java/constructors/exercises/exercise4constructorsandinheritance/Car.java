package constructors.exercises.exercise4constructorsandinheritance;

public class Car extends Vehicle {
    private String model;

    public Car(String brand, String model) {
        super(brand);
        this.model = model;
    }

}
