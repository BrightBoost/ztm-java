package workingwithstrings;

public class ExampleStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Maaike");
        sb.append(" loves Java");
        String s = sb.toString();

        StringBuilder sb1 = new StringBuilder("Hello");
        sb1.append(", ");
        sb1.append("World");
        sb1.append("!");
        String greeting = sb1.toString();

    }
}
