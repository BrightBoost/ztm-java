package controlflow.exercises;

public class Exercise4PrintFirstNEvenNrsWhileLoop {
    public static void main(String[] args) {
        int n = 5;
        int counter = 0;
        int i = 0;

        while (counter < n) {
            if (i % 2 == 0) {
                System.out.println(i);
                counter++;
            }
            i++;
        }
    }

}
