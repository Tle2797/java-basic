
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateAndTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);

        // กำหนดรูปแบบวันและเวลา
        String pattern = "dd/MM/yyyy HH:mm:ss";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        String formattedDateTime = dateTime.format(formatter);
        System.out.println(formattedDateTime);

    }
}
