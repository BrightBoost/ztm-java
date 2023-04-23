package controlflow;

public class ExamplesWhile {
    public static void main(String[] args) {
        int i = 0;
        while(i < 100) {
            System.out.println(Math.pow(i, 2));
            i++;
        }

//        boolean notFound = true;
//        while(notFound) {
//            int randomNr = (int) (Math.random() * 11);
//            System.out.println("Value: " + randomNr);
//            if(randomNr == 10) {
//                notFound = false;
//            }
//        }
    }
}
