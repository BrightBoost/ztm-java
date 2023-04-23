package workingwithstrings.exercises;

public class Immutability {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String upperCaseStr = str.toUpperCase();
        System.out.println("Original String: " + str);
        System.out.println("Modified String: " + upperCaseStr);
    }

}
