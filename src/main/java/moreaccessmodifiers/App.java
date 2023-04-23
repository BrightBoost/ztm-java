package moreaccessmodifiers;

import accessmodifiers.Person;

public class App extends Person {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Bob";
        p.sayHi();
    }

    public void greeting() {
        sayHi();
        name = "Linda";
    }
}
