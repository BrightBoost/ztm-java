package workingwithstrings.exercises;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Hello");

        // Compare using equals
        System.out.println("Using equals: " + sb1.toString().equals(sb2.toString()));

        // Concatenate using append
        sb1.append(sb2);
        System.out.println("Concatenated: " + sb1);

        // Reverse using reverse
        sb1.reverse();
        System.out.println("Reversed: " + sb1);
    }

}
