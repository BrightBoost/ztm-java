package primitivevsobject;

public class Pass {
    public static void main(String[] args) {
        int i = 3;
        Person p = new Person();
        p.name = "Scott";
        changeStuff(i, p);
        System.out.println(i + " " + p.name);
    }

    public static void changeStuff(int x, Person person) {
        x = 5;
        person.name = "Miley";
    }
}
