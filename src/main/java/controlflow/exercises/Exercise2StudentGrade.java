package controlflow.exercises;

public class Exercise2StudentGrade {
    public static void main(String[] args) {
        char grade = 'B';
        String comment;

        switch (grade) {
            case 'A':
                comment = "Excellent!";
                break;
            case 'B':
                comment = "Good job!";
                break;
            case 'C':
                comment = "Average.";
                break;
            case 'D':
                comment = "Needs improvement.";
                break;
            case 'F':
                comment = "Failed.";
                break;
            default:
                comment = "Invalid grade.";
        }

        System.out.println("Comment: " + comment);
    }

}
