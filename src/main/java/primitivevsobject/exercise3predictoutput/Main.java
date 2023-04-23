package primitivevsobject.exercise3predictoutput;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "John";
        person.age = 25;

        System.out.println("Before: " + person.name + ", " + person.age);
        updatePerson(person);
        System.out.println("After: " + person.name + ", " + person.age);
    }

    public static void updatePerson(Person p) {
        p.name = "Jane";
        p.age = 30;
    }

}
