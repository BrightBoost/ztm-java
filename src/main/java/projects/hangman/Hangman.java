package projects.hangman;

import java.util.HashSet;
import java.util.Scanner;

public class Hangman {
    private String secretWord;
    private int attempts;
    private StringBuilder guessedWord;
    private HashSet<Character> guessedLetters;

    public Hangman(String secretWord, int attempts) {
        this.secretWord = secretWord;
        this.attempts = attempts;
        this.guessedWord = new StringBuilder(secretWord.replaceAll(".", "_"));
        this.guessedLetters = new HashSet<>();
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        int remainingAttempts = attempts;

        while (remainingAttempts > 0 && !guessedWord.toString().equals(secretWord)) {
            System.out.println("Attempts remaining: " + remainingAttempts);
            System.out.println("Guessed word: " + guessedWord);
            System.out.print("Enter a letter to guess: ");
            char guess = scanner.next().charAt(0);

            if (guessedLetters.contains(guess)) {
                System.out.println("You've already guessed this letter.");
                continue;
            }

            guessedLetters.add(guess);

            if (secretWord.indexOf(guess) >= 0) {
                for (int i = 0; i < secretWord.length(); i++) {
                    if (secretWord.charAt(i) == guess) {
                        guessedWord.setCharAt(i, guess);
                    }
                }
            } else {
                remainingAttempts--;
            }
        }

        if (guessedWord.toString().equals(secretWord)) {
            System.out.println("Congratulations! You guessed the secret word: " + secretWord);
        } else {
            System.out.println("Sorry, you're out of attempts. The secret word was: " + secretWord);
        }
    }
}

