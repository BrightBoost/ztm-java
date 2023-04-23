package controlflow.exercises;

public class Exercise5PrintSeqNrsDoWhile {
    public static void main(String[] args) {
        int n = 10;
        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while (i <= n);
    }

}
