package oop;

public class Animal {
    public static String type = "animal";
    private String name;
    private int age;
    private int nrOfEyes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public int getNrOfEyes() {
        return nrOfEyes;
    }

    public void setNrOfEyes(int nrOfEyes) {
        this.nrOfEyes = nrOfEyes;
    }

    public void eat() {
        System.out.println("Animal eating");
    }
}
