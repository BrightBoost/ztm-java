package genericsandcollections;

public class Main {
    public static void main(String[] args) {
        Bag<Chihuahua> chihuahuaBag = new Bag<>();
        Chihuahua chihuahua = new Chihuahua();
        chihuahua.setName("Rocky");

        chihuahuaBag.setContent(chihuahua);

        Bag<Laptop> laptopBag = new Bag<>();
        Laptop laptop = new Laptop();
        laptop.setName("Lappie");

        laptopBag.setContent(laptop);

    }
}
