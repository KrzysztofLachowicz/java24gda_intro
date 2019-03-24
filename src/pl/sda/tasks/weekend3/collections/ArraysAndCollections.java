package pl.sda.tasks.weekend3.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 5. Poćwicz wykorzystanie klas Arrays oraz Collections.
 * Zapoznaj się z ich API i postaraj się wykorzystać dostępne metody do operacji na tablicach i kolekcjach.
 */
public class ArraysAndCollections {
    public static void main(String[] args) {
        List<String> months = Arrays.asList(
                "January",
                "February",
                "March",
                "April",
                "June",
                "July",
                "August",
                "September",
                "November",
                "October",
                "December"
        );

        List<String> monday = Collections.singletonList("Monday");
        List<String> weekdays = Collections.emptyList();

        Collections.reverse(months);
        for (String month : months) {
            System.out.println(month);
        }

        monday.add("Thuesday");

        weekdays.add(monday.get(0));
    }
}
