package variables;

public class ExampleString {
    public static void main(String[] args) {
        String s = "hi";
        String s1 = "hello";
        boolean same = s.equals(s1);

        System.out.println(s.toUpperCase());
        System.out.println(s);

        s = s.toUpperCase();
        System.out.println(s);

        String subString = s1.substring(1, 4);
        System.out.println(subString);

        boolean startsWith = s1.startsWith("h");
        System.out.println(startsWith);

        System.out.println(s1.length());
        System.out.println(s1.charAt(3));
    }
}
