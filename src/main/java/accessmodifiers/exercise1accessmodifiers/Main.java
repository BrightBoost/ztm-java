package accessmodifiers.exercise1accessmodifiers;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);
        System.out.println("Address: " + person.address);
        // Cannot access the private field 'ssn' from another class
        // System.out.println("SSN: " + person.ssn);
    }
}
