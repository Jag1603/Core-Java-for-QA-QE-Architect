import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date.format(DateTimeFormatter.ISO_DATE));
        System.out.println(ZonedDateTime.now(ZoneId.of("Asia/Kolkata")));
    }
}