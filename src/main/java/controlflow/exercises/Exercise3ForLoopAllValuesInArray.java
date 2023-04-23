package controlflow.exercises;

public class Exercise3ForLoopAllValuesInArray {
    public static void main(String[] args) {
        int[] numbers = {4, 7, 12, 5, 8};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Value at index " + i + ": " + numbers[i]);
        }
    }

}
