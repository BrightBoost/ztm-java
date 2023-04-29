package projects.wordle;

import java.util.Scanner;

public class Wordle {
    private String secretWord;
    private int attempts;

    public Wordle(String secretWord, int attempts) {
        this.secretWord = secretWord;
        this.attempts = attempts;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        int remainingAttempts = attempts;

        while (remainingAttempts > 0) {
            System.out.println("Attempts remaining: " + remainingAttempts);
            System.out.print("Enter your guess: ");
            String guess = scanner.nextLine();

            if (guess.length() != secretWord.length()) {
                System.out.println("Invalid guess. Please enter a word with the same length as the secret word.");
                continue;
            }

            int correctChars = 0;
            int correctPositions = 0;

            for (int i = 0; i < secretWord.length(); i++) {
                char c = guess.charAt(i);
                if (c == secretWord.charAt(i)) {
                    correctPositions++;
                } else if (secretWord.indexOf(c) >= 0) {
                    correctChars++;
                }
            }

            if (correctPositions == secretWord.length()) {
                System.out.println("Congratulations! You guessed the secret word: " + secretWord);
                break;
            } else {
                System.out.println("Correct characters: " + correctChars);
                System.out.println("Correct positions: " + correctPositions);
                remainingAttempts--;
            }
        }

        if (remainingAttempts == 0) {
            System.out.println("Sorry, you're out of attempts. The secret word was: " + secretWord);
        }
    }
}

