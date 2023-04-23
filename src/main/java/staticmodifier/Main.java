package staticmodifier;

public class Main {
    public static void main(String[] args) {
        System.out.println(MathUtils.pi);
        double result = MathUtils.subtract(10, 3);
        System.out.println(result);

        MathUtils m = new MathUtils();
        System.out.println(m.pi);
        System.out.println(m.subtract(12, 3));

        MathUtils m1 = new MathUtils();
        m1.pi = 12;

        System.out.println(m.pi + " " + MathUtils.pi + " " + m1.pi);

    }
}
