package pl.sda.tasks.weekend3.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class MaxMinDate {
    public static void main(String[] args) {
        LocalDate maxDate = getMaxDate(
                LocalDate.of(2014, Month.DECEMBER, 29),
                LocalDate.of(2018, Month.APRIL, 16),
                LocalDate.of(2018, Month.APRIL, 10),
                LocalDate.of(2015, Month.SEPTEMBER, 22),
                LocalDate.of(2022, Month.JANUARY, 1)
        );
        System.out.println("maxDate = " + maxDate);

        LocalDateTime minDateTime = getMinDateTime(
                LocalDateTime.of(2018, Month.APRIL, 2, 22, 4),
                LocalDateTime.of(2018, Month.APRIL, 2, 22, 8),
                LocalDateTime.of(2018, Month.APRIL, 2, 22, 1),
                LocalDateTime.of(2018, Month.APRIL, 2, 22, 22),
                LocalDateTime.of(2018, Month.APRIL, 2, 22, 13)
        );
        System.out.println("minDateTime = " + minDateTime);
    }

    private static LocalDate getMaxDate(LocalDate... dates) {
        if (dates.length == 0) {
            return null;
        }

        LocalDate maxDate = dates[0];
        for (LocalDate date : dates) {
            if (date.isAfter(maxDate)) {
                maxDate = date;
            }
        }

        return maxDate;
    }

    private static LocalDateTime getMinDateTime(LocalDateTime... dates) {
        if (dates.length == 0) {
            return null;
        }

        LocalDateTime maxDate = dates[0];
        for (LocalDateTime date : dates) {
            if (date.isBefore(maxDate)) {
                maxDate = date;
            }
        }

        return maxDate;
    }
}
