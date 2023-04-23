package primitivevsobject.exercise2objectwithobjects;

public class Main {
    public static void main(String[] args) {
        Person owner = new Person();
        owner.name = "John";

        Car car = new Car();
        car.model = "Toyota";
        car.owner = owner;

        System.out.println("Car model: " + car.model);
        System.out.println("Owner: " + car.owner.name);
    }
}
