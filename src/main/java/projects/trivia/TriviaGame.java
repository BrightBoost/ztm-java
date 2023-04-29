package projects.trivia;
import java.util.Scanner;

public class TriviaGame {
    public static void main(String[] args) {
        Question[] questions = {
                new Question("What is the capital of France?", new String[] {"Paris", "London", "Berlin", "Rome"}, 0),
                new Question("Which planet is closest to the sun?", new String[] {"Earth", "Venus", "Mercury", "Mars"}, 2),
                // Add more questions here
        };

        play(questions);
    }

    public static void play(Question[] questions) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            Question question = questions[i];
            System.out.println("Question " + (i + 1) + ": " + question.getQuestion());
            String[] options = question.getOptions();
            for (int j = 0; j < options.length; j++) {
                System.out.println((j + 1) + ". " + options[j]);
            }

            System.out.print("Enter your answer (1-" + options.length + "): ");
            int answer = scanner.nextInt() - 1;

            if (question.isCorrectAnswer(answer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect.");
            }
        }

        System.out.println("Your final score: " + score + " out of " + questions.length);
    }
}

