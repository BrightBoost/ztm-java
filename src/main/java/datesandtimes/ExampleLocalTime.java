package datesandtimes;

import java.time.LocalTime;

public class ExampleLocalTime {
    public static void main(String[] args) {
        LocalTime lt1 = LocalTime.now();
        LocalTime lt2 = LocalTime.of(6, 30, 12);
        LocalTime lt3 = LocalTime.parse("23:59:59");

        System.out.println(lt1 + " " + lt2 + " " + lt3);

        LocalTime lt4 = lt1.plusHours(1);
        System.out.println(lt4);
    }
}
