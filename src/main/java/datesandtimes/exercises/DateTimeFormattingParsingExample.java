package datesandtimes.exercises;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormattingParsingExample {
    public static void main(String[] args) {
        // Format a LocalDateTime object
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String formattedDateTime = now.format(formatter);
        System.out.println("Formatted date and time: " + formattedDateTime);

        // Parse a date string into a LocalDate object
        String dateString = "2023-11-21";
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate parsedDate = LocalDate.parse(dateString, dateFormatter);
        System.out.println("Parsed date: " + parsedDate);
    }

}
