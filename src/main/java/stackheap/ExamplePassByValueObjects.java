package stackheap;

public class ExamplePassByValueObjects {

    public static void main(String[] args) {
        Example e = new Example();
        e.nr = 2;
        addOne(e);
        System.out.println(e.nr);
    }

    public static void addOne(Example example) {
        example.nr = example.nr + 1;
    }
}
