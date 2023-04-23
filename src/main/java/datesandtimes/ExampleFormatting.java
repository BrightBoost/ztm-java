package datesandtimes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;

public class ExampleFormatting {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDate today = LocalDate.now();

        // format with custom pattern
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM/d/yy");
        System.out.println(dtf.format(now));
        System.out.println(dtf.format(today));

        LocalDate ld = LocalDate.parse("February/20/21", dtf);
        System.out.println(ld.format(DateTimeFormatter.ISO_WEEK_DATE));

        DateTimeFormatterBuilder dtfb = new DateTimeFormatterBuilder();
        DateTimeFormatter dtf1 = dtfb.appendLiteral("The date is:")
                .appendValue(ChronoField.DAY_OF_MONTH)
                .appendLiteral("/")
                .appendValue(ChronoField.MONTH_OF_YEAR)
                .toFormatter();

        System.out.println(ld.format(dtf1));
    }
}
