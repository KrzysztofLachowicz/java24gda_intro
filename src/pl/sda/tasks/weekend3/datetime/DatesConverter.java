package pl.sda.tasks.weekend3.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class DatesConverter {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println("date = " + now);

        LocalDate localDate = convertToLocalDate(now);
        System.out.println("localDate = " + localDate);

        LocalDateTime localDateTime = convertToLocalDateTime(now);
        System.out.println("localDateTime = " + localDateTime);

        Date date = convertToDate(LocalDate.now());
        System.out.println("date from LocalDate = " + date);

        date = convertToDate(LocalDateTime.now());
        System.out.println("date from LocalDateTime = " + date);
    }

    public static LocalDate convertToLocalDate(Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    public static LocalDateTime convertToLocalDateTime(Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    }

    public static Date convertToDate(LocalDateTime localDateTime) {
        return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
    }

    public static Date convertToDate(LocalDate localDate) {
        ZonedDateTime zonedDateTime = localDate.atStartOfDay(ZoneId.systemDefault());
        return Date.from(zonedDateTime.toInstant());
    }

}
