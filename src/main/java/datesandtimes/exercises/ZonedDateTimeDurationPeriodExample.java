package datesandtimes.exercises;

import java.time.*;

public class ZonedDateTimeDurationPeriodExample {
    public static void main(String[] args) {
        // ZonedDateTime for an overseas event
        ZonedDateTime overseasEvent = ZonedDateTime.of(2023, 11, 21, 10, 0, 0, 0, ZoneId.of("Asia/Tokyo"));
        System.out.println("Overseas event: " + overseasEvent);

        // Duration between two LocalTime objects
        LocalTime start = LocalTime.of(9, 0);
        LocalTime end = LocalTime.of(17, 0);
        Duration duration = Duration.between(start, end);
        System.out.println("Duration: " + duration);

        // Period between two LocalDate objects
        LocalDate startDate = LocalDate.of(2023, 1, 1);
        LocalDate endDate = LocalDate.of(2023, 12, 31);
        Period period = Period.between(startDate, endDate);
        System.out.println("Period: " + period);
    }

}
