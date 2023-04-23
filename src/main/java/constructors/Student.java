package constructors;

public class Student extends Person {
    private int age;
    private String studentNr;

    public Student(String name, int age) {
        this(name, age, "0");
    }

    public Student(String name, int age, String studentNr) {
        super(name);
        this.age = age;
        this.studentNr = studentNr;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

