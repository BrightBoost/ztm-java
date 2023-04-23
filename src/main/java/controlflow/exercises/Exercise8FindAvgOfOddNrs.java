package controlflow.exercises;

public class Exercise8FindAvgOfOddNrs {
    public static void main(String[] args) {
        int[] numbers = {4, 7, 12, 5, 8};
        int sum = 0;
        int count = 0;

        for (int number : numbers) {
            if (number % 2 != 0) {
                sum += number;
                count++;
            }
        }

        double average = (double) sum / count;
        System.out.println("Average of odd numbers: " + average);
    }

}
