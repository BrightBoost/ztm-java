package projects.hangman;

public class HangmanGame {
    public static void main(String[] args) {
        Hangman hangman = new Hangman("example", 8);
        hangman.play();
    }
}

