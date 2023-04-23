package controlflow.exercises;

public class Exercise7DetermineHighestAndLowestGrade {
    public static void main(String[] args) {
        int[] grades = {85, 90, 78, 92, 88};
        int highest = grades[0];
        int lowest = grades[0];

        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest) {
                lowest = grade;
            }
        }

        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);
    }

}
