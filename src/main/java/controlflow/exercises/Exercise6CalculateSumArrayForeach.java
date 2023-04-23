package controlflow.exercises;

public class Exercise6CalculateSumArrayForeach {
    public static void main(String[] args) {
        int[] numbers = {4, 7, 12, 5, 8};
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        System.out.println("Sum: " + sum);
    }

}
