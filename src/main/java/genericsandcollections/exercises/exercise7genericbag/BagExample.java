package genericsandcollections.exercises.exercise7genericbag;

public class BagExample {
    public static void main(String[] args) {
        Bag<String> stringBag = new Bag<>();
        stringBag.addItem("Apple");
        stringBag.addItem("Banana");
        stringBag.removeItem("Apple");

        Bag<Integer> integerBag = new Bag<>();
        integerBag.addItem(1);
        integerBag.addItem(2);
        integerBag.removeItem(1);
    }

}
