package constructors.exercises.exercise4constructorsandinheritance;

public class ElectricCar extends Car {
    private int batteryCapacity;

    public ElectricCar(String brand, String model, int batteryCapacity) {
        super(brand, model);
        this.batteryCapacity = batteryCapacity;
    }

}
