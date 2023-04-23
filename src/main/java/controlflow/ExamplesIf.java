package controlflow;

public class ExamplesIf {
    public static void main(String[] args) {
        int input = 1;

        if(input != 0) {
            System.out.println("2 divided by the input equals: " + (2 / input));
        } else {
            System.out.println("Input cannot be 0");
        }

        int hour = -43;

        if(hour >= 0 && hour < 12) {
            System.out.println("Good morning!");
        } else if(hour >= 12 && hour < 18) {
            System.out.println("Good afternoon");
        } else if(hour >= 18 && hour < 24) {
            System.out.println("Good evening!");
        } else {
            System.out.println("I don't know that hour, but good day");
        }


    }
}
