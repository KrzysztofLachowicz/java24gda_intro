package pl.sda.tasks.weekend4.generics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Tasks {
    public static void main(String[] args) {
        printGreaterThan10(Arrays.asList(14, 4, 5, 19, 66, 1));

        System.out.println("--------------------");
        Set<String> phrases = new HashSet<>();
        phrases.add("alpha");
        phrases.add("omega");
        phrases.add("teta");
        phrases.add("sigma");
        phrases.add("alpha i omega");
        phrases.add("alpha2");
        System.out.println("count for 'alpha') = " + countOccurence(phrases, "alpha"));
        System.out.println("count for 'teta') = " + countOccurence(phrases, "teta"));
        System.out.println("count for 'fi') = " + countOccurence(phrases, "fi"));

        System.out.println("--------------------");
        List<Integer> integers = Arrays.asList(14, 4, 5, 19, 66, 1);
        printNumbersGreaterThan10(integers);
        List<Double> doubles = Arrays.asList(14.0, 10.1, 10., 9.9, 6., 1.);
        printNumbersGreaterThan10(doubles);
    }

    /**
     * 1. Stwórz metodę, która przyjmie listę obiektów typu Integer i wyświeli na ekran tylko liczby większe od 10.
     */
    private static void printGreaterThan10(List<Integer> numbers) {
        for (Integer number : numbers) {
            if(number > 10) {
                System.out.println("number = " + number);
            }
        }
    }

    /**
     * 2. Stwórz metodę, która jako parametry przyjmie: kolekcję (Set) zawierającą zestaw wyrazów oraz pojedynczy wyraz
     * którego szukamy w kolekcji. Metoda zwróci ilość wystąpień szukanego wyrazu w podanej kolekcji.
     */
    private static int countOccurence(Set<String> phrases, String searchWord) {
        int count = 0;
        if(phrases == null || searchWord == null) {
            throw new IllegalArgumentException("Params: phrases and searchWord can't be null!");
        }

        for (String word : phrases) {
            if(word.contains(searchWord)) {
                count++;
            }
        }
        return count;
    }

    /**
     * 3. Zmień metodę z pkt.1 tak żeby przyjmowała listę dowolnych obiektów dziedziczących po klasie Number.
     * Sprawdź czy metoda będzie działała z: List<Double> i List<Integer>
     */
    private static void printNumbersGreaterThan10(List<? extends Number> numbers) {
        for (Number number : numbers) {
            if(number.doubleValue() > 10) {
                System.out.println("number = " + number);
            }
        }
    }
}
