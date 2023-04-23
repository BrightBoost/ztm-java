package variables;

public class ExampleCasting {
    public static void main(String[] args) {
        long l = 123;
        int x = (int) l;

        double d = 3.2;
        float f = (float) d;

        // this will be a problem
        byte b = -23;
        char c = (char) b;
        System.out.println(c);
        int i = c;
        System.out.println(i);

        char maxChar = 65535;
        char newChar = (char) (maxChar + 1);
        System.out.println((int)newChar);

    }
}
