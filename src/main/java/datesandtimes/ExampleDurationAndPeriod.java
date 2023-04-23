package datesandtimes;

import java.time.Duration;
import java.time.Period;

public class ExampleDurationAndPeriod {
    public static void main(String[] args) {
        Duration d1 = Duration.ofNanos(10000000);
        Duration d2 = Duration.ofSeconds(100, 1000);
        Duration d3 = Duration.ofDays(7);

        Duration d4 = d3.plus(d1);

        Period p1 = Period.of(10, 2, 3);
        Period p2 = Period.ofWeeks(12);

        System.out.println(p2.getDays());

    }
}
