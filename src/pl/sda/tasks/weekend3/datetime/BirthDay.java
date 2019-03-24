package pl.sda.tasks.weekend3.datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class BirthDay {
    public static void main(String[] args) {
        //myBirthDayWithCalendar();
        //myBirthDayWithLocalDateTime();
        //myAge();
        //dayOfBirthDayInNextYears(10);
    }

    private static void myBirthDayWithLocalDateTime() {
        LocalDate localDate = LocalDate.of(2000, 1, 1);
        LocalTime localTime = LocalTime.of(9, 0);

        LocalDateTime birthDay = LocalDateTime.of(localDate, localTime);
        System.out.println("My birthday is: " + birthDay);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy (EEEE) 'godzina' HH:mm");
        System.out.println("My birthday is: " + formatter.format(birthDay));

        ZoneId warsawZoneId = ZoneId.of("Europe/Warsaw");
        ZonedDateTime warsawDateTime = birthDay.atZone(warsawZoneId);
        System.out.println("My birthday is (in Warsaw): " + formatter.format(warsawDateTime));

        ZoneId tokioZoneId = ZoneId.of("Asia/Tokyo");
        ZonedDateTime tokioDateTime = warsawDateTime.withZoneSameInstant(tokioZoneId);
        System.out.println("My birthday is (in Tokyo): " + formatter.format(tokioDateTime));

        ZoneId hawaiiZoneId = ZoneId.of("US/Hawaii");
        DateTimeFormatter formatterWithZone = formatter.withZone(hawaiiZoneId);
        System.out.println("My birthday is (in Hawaii): " + formatterWithZone.format(warsawDateTime));
    }

    private static void myBirthDayWithCalendar() {
        Calendar birthDayCalendar = Calendar.getInstance();
        birthDayCalendar.set(Calendar.YEAR, 2000);
        birthDayCalendar.set(Calendar.MONTH, 0);
        birthDayCalendar.set(Calendar.DAY_OF_MONTH, 1);
        birthDayCalendar.set(Calendar.HOUR_OF_DAY, 9);
        birthDayCalendar.set(Calendar.MINUTE, 0);

        DateFormat dateFormat = new SimpleDateFormat("d MMMM yyyy (EEEE) 'godzina' HH:mm");
        Date birthDay = birthDayCalendar.getTime();
        System.out.println("My birthday is: " + birthDay);
        System.out.println("My birthday is: " + dateFormat.format(birthDay));
        dateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Tokyo"));
        System.out.println("My birthday is (in Tokyo): " + dateFormat.format(birthDay));
        dateFormat.setTimeZone(TimeZone.getTimeZone("US/Hawaii"));
        System.out.println("My birthday is (in Hawaii): " + dateFormat.format(birthDay));
    }

    private static void myAge() {
        LocalDateTime birthDay = LocalDateTime.of(2000, 1, 1, 9, 0);
        LocalDateTime now = LocalDateTime.now();

        Period period = Period.between(birthDay.toLocalDate(), now.toLocalDate());
        Duration duration = Duration.between(birthDay.toLocalTime(), now.toLocalTime());

        System.out.printf("Number years: %s, months: %s, days: %s, hours: %s\n", period.getYears(), period.getMonths(), period.getDays(), duration.toHours());

        Duration totalDuration = Duration.between(birthDay, now);
        System.out.printf("Total number of minutes: %s\n", totalDuration.toMinutes());
        System.out.printf("Total number of seconds: %s\n", totalDuration.getSeconds());
    }

    private static void dayOfBirthDayInNextYears(int yearsCount) {
        int actualYear = LocalDate.now().getYear();
        LocalDateTime birthDay = LocalDateTime.of(actualYear, Month.JANUARY, 1, 9, 0);
        for (int i = 1; i <= yearsCount + 1; i++) {
            System.out.printf("In %s year day if birthday is: %s\n", birthDay.getYear(), birthDay.getDayOfWeek());
            birthDay = birthDay.plusYears(1);
        }
    }
}