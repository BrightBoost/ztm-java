package primitivevsobject.exercise5passobjecttomethod;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "John";
        person.age = 25;
        System.out.println("Before: " + person.name + ", " + person.age);
        modifyPerson(person);
        System.out.println("After: " + person.name + ", " + person.age);
    }

    public static void modifyPerson(Person p) {
        p.name = "Jane";
        p.age = 30;
    }

}
