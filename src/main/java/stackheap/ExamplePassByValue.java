package stackheap;

public class ExamplePassByValue {
    public static void main(String[] args) {
        int x = 2;
        addOne(x);
        System.out.println(x);
    }

    public static void addOne(int a) {
        a = a + 1;
    }
}
