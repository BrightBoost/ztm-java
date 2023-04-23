package controlflow;

public class ExampleNotUseBreak {
    public static void main(String[] args) {
        boolean notFound = true;
        while(notFound) {
            int randomNr = (int) (Math.random() * 11);
            System.out.println("Value: " + randomNr);
            if(randomNr == 10) {
                notFound = false;
            }
        }
    }
}
