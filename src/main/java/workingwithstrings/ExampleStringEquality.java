package workingwithstrings;

public class ExampleStringEquality {
    public static void main(String[] args) {
        String s1 = "Hi";
        String s2 = new String("Hi");

        System.out.println(s1.equals(s2));
    }
}
