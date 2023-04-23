package datesandtimes;

import java.time.LocalDateTime;

public class ExampleLocalDateTime {
    public static void main(String[] args) {
        LocalDateTime ldt1 = LocalDateTime.now();
        LocalDateTime ldt2 = LocalDateTime.of(2015, 6, 12, 15, 10, 32);
        LocalDateTime ldt3 = LocalDateTime.parse("2004-11-30T22:10:23");

        System.out.println(ldt1 + "\n" + ldt2 + "\n" + ldt3);

        LocalDateTime ldt4 = ldt1.minusWeeks(2);
        System.out.println(ldt4);

    }
}
