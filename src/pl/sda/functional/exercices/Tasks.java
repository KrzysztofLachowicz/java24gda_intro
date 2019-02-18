package pl.sda.functional.exercices;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Tasks {

    public static void main(String[] args) {
        //#1
        //useLambdas();

        //#2
        useStreams();
    }

    /**
     * 1. Stwórz i użyj lambdę która:
     * - stworzy obiekt klasy Double (Supplier)
     * - pobierze obiekt klasy String i wyświetli na konsolę (Consumer)
     * - sprawdzi czy podany string ma długość > 10 (Predicate)
     * - przekształci dwie liczby w String (zsumuje je i zwróci reprezentację tekstową) (BiFunction)
     */
    private static void useLambdas() {
        //- stworzy obiekt klasy Double (Supplier)
        double number = 10.5;
        Supplier<Double> doubleSupplier = () -> 10.6 + number;
        System.out.println("doubleSupplier = " + doubleSupplier.get());

        //- pobierze obiekt klasy String i wyświetli na konsolę (Consumer)
        Consumer<String> stringConsumer = (str) -> System.out.println("str = " + str);
        stringConsumer.accept("Hello");
        stringConsumer.accept("Hello1");
        stringConsumer.accept("Hello2");

        //- sprawdzi czy podany string ma długość > 10 (Predicate)
        Predicate<String> predicate = (str) -> str.length() > 10;
        System.out.println("is long = " + predicate.test("To jest długi napis!!"));
        System.out.println("is long = " + predicate.test("To krótki"));


        BiFunction<Integer, Integer, String> bifunction = (num1, num2) -> {
            int result = num1 + num2;
            return String.valueOf(result);
        };

        String result = bifunction.apply(1, 2);
        System.out.println("result = " + result);
    }

    /**
     * 2. Stwórz i użyj strumień danych (Stream):
     * - stwórz stream liczb typu Double z kolekcji typu Set - podaj ich sumę i średnią arytmetyczną
     * - stwórz stream liczb całkowitych od 10 do 40, usuń parzyste i podaj sumę pozostałych
     * - stwórz stream obiektów typu String, zamień wszystkie litery na małe, zostaw tylko te które zaczynają się na literę 'a' lub 'z'
     *   i stwórz listę przetworzonych elementów
     * - stwórz stream obiektów Person i stwórz statystykę lat (suma, średnia, minimalny i maksymalny wiek) dla tego zbioru
     * - stwórz strumień który wypisze na ekran ścieżki wszystkich katalogów i podkatalogów znajdujących się w aktualnym katalogu (Path.get("."))
     */
    private static void useStreams() {
        //- stwórz stream liczb typu Double z kolekcji typu Set - podaj ich sumę i średnią arytmetyczną
        Set<Double> doubles = new HashSet<>();
        doubles.add(1.4);
        doubles.add(2.3);
        doubles.add(12.5);
        doubles.add(9.7);
        doubles.add(5.);
        DoubleSummaryStatistics doubleSummaryStatistics = doubles.stream()
                .collect(Collectors.summarizingDouble(d -> d));
        System.out.println("sum = " + doubleSummaryStatistics.getSum());
        System.out.println("average = " + doubleSummaryStatistics.getAverage());

        //- stwórz stream liczb całkowitych od 10 do 40, usuń parzyste i podaj sumę pozostałych
        int sum = IntStream.range(10, 40)
                .filter(number -> number % 2 != 0)
                .sum();
        System.out.println("sum of odd integers = " + sum);

        //- stwórz stream obiektów typu String, zamień wszystkie litery na małe, zostaw tylko te które zaczynają się na literę 'a' lub 'z'
        //  i stwórz listę przetworzonych elementów
        Stream<String> stringStream = Stream.of("Kot", "pies", "gruszka", "anakonda", "Zebra", "żubr", "Ananas");
        List<String> listOfStrings = stringStream.map(String::toLowerCase)
                .filter(str -> str.startsWith("a") || str.startsWith("z"))
                .collect(Collectors.toList());
        System.out.println("listOfStrings = " + listOfStrings);

        //- stwórz stream obiektów Person i stwórz statystykę lat (suma, średnia, minimalny i maksymalny wiek) dla tego zbioru
        Stream<Person> personStream = Stream.of(new Person(15, "Ola"), new Person(35, "Mateusz"), new Person(23, "Jarek"), new Person(30, "Marek"));
        IntSummaryStatistics summaryStatistics = personStream.mapToInt(Person::getAge)
                .summaryStatistics();
        System.out.println("age summary statistics = " + summaryStatistics);

        //- stwórz strumień który wypisze na ekran ścieżki wszystkich katalogów i podkatalogów znajdujących się w aktualnym katalogu (Path.get("."))
        try {
            Files.walk(Paths.get("."))
                    .filter(Files::isDirectory)
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}