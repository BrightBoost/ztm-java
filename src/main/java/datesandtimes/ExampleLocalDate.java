package datesandtimes;

import java.time.LocalDate;

public class ExampleLocalDate {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        LocalDate ld1 = LocalDate.of(2000, 4, 1);
        LocalDate ld2 = LocalDate.parse("2023-01-01");

        System.out.println(ld + " " + ld1 + " " + ld2);

        LocalDate ld3 = ld.plusDays(5);
        System.out.println(ld3);

        System.out.println(ld3.getDayOfMonth());
    }
}
