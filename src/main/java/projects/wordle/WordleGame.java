package projects.wordle;

public class WordleGame {
    public static void main(String[] args) {
        Wordle wordle = new Wordle("example", 6);
        wordle.play();
    }

}
