package variables;

public class ExampleOperators {
    public static void main(String[] args) {
        // arithmetic operators
        double x = 2;
        double y = 3;
        double z = x + y;
        System.out.println(z);
        double d = x / y;
        System.out.println(d);

        int nr1 = 10;
        int nr2 = 4;
        int result = nr1 % nr2;
        System.out.println("Modulus: " + result);

        // assignment operators
        int nr3 = 7;
        int nr4 = 70;
        nr3 -= nr4;
        System.out.println(nr3);


        // unary operators
        int nr5 = 8;
        nr5--;
        System.out.println(nr5);

        int nr6 = 3;
        System.out.println(-nr6);
        System.out.println(nr6);

        int pre = 5;
        int post = 5;
        System.out.println(++pre);
        System.out.println(post++);
        System.out.println("post: " + post + " pre: " + pre);

        // relational operators
        int small = 2;
        int big = 10;
        System.out.println(small >= big);

    }
}
