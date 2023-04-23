package datesandtimes;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ExampleZonedDateTime {
    public static void main(String[] args) {
        ZonedDateTime zdt1 = ZonedDateTime.now();
        ZonedDateTime zdt2 = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Europe/Paris"));

        for(String zoneid : ZoneId.getAvailableZoneIds()) {
            System.out.println(zoneid);
        }

        ZonedDateTime zdt3 = zdt1.withZoneSameInstant(ZoneId.of("Egypt"));
        System.out.println(zdt3);
    }
}
