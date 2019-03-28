package pl.sda.tasks.weekend4.functional;

import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tasks {
    public static void main(String[] args) {
        sumCollectionOfNumbers();

        //doubledNumbers();

        //mergeNames();
    }

    /**
     * 2. Utwórz kolekcję i wypełnij ją losowymi liczbami całkowitymi.
     *    Zsumuj wszystkie wartości znajdujące się w kolekcji za pomocą użycia interfejsu stream().
     *    Znajdź co najmniej dwa sposoby na realizację tego zadania.
     */
    private static Set<Integer> sumCollectionOfNumbers() {
        Set<Integer> integers = new HashSet<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            integers.add(random.nextInt(100));
        }

        IntSummaryStatistics summaryStatistics = integers.stream()
                .collect(Collectors.summarizingInt(i -> i));
        System.out.println("integers = " + integers);
        System.out.println("sum of integers = " + summaryStatistics.getSum());

        int sum = integers.stream()
                .mapToInt(i -> i)
                .sum();
        System.out.println("sum of integers2 = " + sum);

        return integers;
    }

    /**
     * 3. Na podstawie kolekcji z liczbami całkowitymi napisz kod z wykorzystaniem interfejsu .stream(),
     *    który po wykonaniu zwróci nam kolekcję z liczbami pomnożonymi przez 2.
     */
    private static void doubledNumbers() {
        Set<Integer> integers = sumCollectionOfNumbers();
        Set<Integer> doubledIntegers = integers.stream()
                .map(i -> i * 2)
                .collect(Collectors.toSet());

        System.out.println("doubledIntegers = " + doubledIntegers);
    }

    /**
     * 5. Wykorzystaj kolekcję z obiektami typu Person i używając interfejsu stream(), wyciągnij wszystkie nazwy, posortuj,
     *    zmień wszystkie litery na wielkie, ogranicz do 5 elementów i
     *    na koniec stwórz jeden String zawierający przetworzone nazwy scalone ze sobą (za pomocą przecinka).
     */
    private static void mergeNames() {
        Stream<Person> personStream = Stream.of(new Person(22, "Marta"), new Person(23, "Ula"), new Person(21, "Rafał"), new Person(25, "Olek"),
                                                new Person(20, "Zenon"), new Person(19, "Adam"), new Person(19, "Iza"), new Person(16, "Ela"));
        String compoundNames = personStream.map(Person::getName)
                .sorted()
                .map(String::toUpperCase)
                .limit(5)
                .collect(Collectors.joining(", "));


        System.out.println(compoundNames);
    }

}
