package pl.sda.generics.exercises;

import java.util.*;

public class Tasks {

    public static void main(String[] args) {
        //#1
        Set<Double> doubles = setOfDoubles();

        //#2
        //Map<Integer, String> genericMap = genericMap();

        //#3
        //List<Number> numbers = doublesToNumbers(doubles);
        //System.out.println("numbers = " + numbers);

        //#4
        //NumbersBox numbersBox = numbersToNumbersBox(numbers);

        //#5
        //NumbersBox<Double> doubleNumbersBox = boxOfDoubles(doubles);
    }

    /**
     * 1. Stwórz kolekcję typu Set, zawierającą obiekty klasy Double. Dodaj do niej kilka liczb.
     * Następnie pobierz i wyświetl w konsoli wszystkie elementy kolekcji.
     * Metoda powinna zwrócić stworzoną kolekcję.
     */
    private static Set<Double> setOfDoubles() {
        Set<Double> doubles = new HashSet<>();
        doubles.add(1.1);
        doubles.add(.07);
        doubles.add(null);
        doubles.add(1.5);
        doubles.add(3.7);
        doubles.add(null);

        for (Double aDouble : doubles) {
            System.out.println(aDouble);
        }

        return doubles;
    }

    /**
     * 2. Stwórz mapę zawierającą obiekty typu Integer jako klucze i String jako wartości. Dodaj kilka obiektów do mapy.
     * Pobierz i wyświetl w konsoli pojedyncze elementy.
     * Następnie pobierz i wyświetl w konsoli wszystkie elementy mapy.
     * Metoda powinna zwrócić stworzoną mapę.
     */
    private static Map<Integer, String> genericMap() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Jeden");
        map.put(5, "Pięć");
        map.put(10, "Dziesięć");

        String fiveStr = map.get(5);
        System.out.println("map.get(5) = " + fiveStr);

        for (Integer key : map.keySet()) {
            System.out.println(key + " = " + map.get(key));
        }

        return map;
    }

    /**
     * 3. Skopiuj podany zbiór liczby Double do listy obiektów klasy Number.
     * Nie kopiuj obiektu jeżeli jest równy null.
     * Zwróć nową listę jako wynik metody.
     */
    private static List<Number> doublesToNumbers(Set<Double> doubles) {
        List<Number> numbers = new ArrayList<>();
        for (Double aDouble : doubles) {
            if(aDouble != null) {
                numbers.add(aDouble);
            }
        }

        return numbers;
    }

    /**
     * 4. Stwórz klasę (zwykłą lub wewnętrzną) która będzie przechowywać listę obiektów klasy Number.
     * Dodaje metody które:
     * - sprawdzą czy lista jest pusta
     * - pobierze pierwszy element listy
     * - pobierze pierwszy element listy jako int
     * - pobierze ostatni element listy
     * - pobierze ostatni element listy jako int
     * Zwróć obiekt klasy NumbersBox jako wynik tej metody.
     */
    private static NumbersBox numbersToNumbersBox(List<Number> numbers) {
        NumbersBox numbersBox = new NumbersBox(numbers);
        System.out.println("numbersBox.isEmpty() = " + numbersBox.isEmpty());
        System.out.println("numbersBox.getFirstNumber() = " + numbersBox.getFirstNumber());
        System.out.println("numbersBox.getFirstNumberAsInt() = " + numbersBox.getFirstNumberAsInt());
        System.out.println("numbersBox.getLastNumber() = " + numbersBox.getLastNumber());
        System.out.println("numbersBox.getLastNumberAsInt() = " + numbersBox.getLastNumberAsInt());
        return numbersBox;
    }

    /**
     * 5. Zmień klasę NumbersBox - tak żeby przyjmowała różne typy liczbowe - np. Double
     * Zwróć obiekt klasy NumbersBox jako wynik tej metody.
     */
    private static NumbersBox<Double> boxOfDoubles(Set<Double> doubles) {
        List<Double> listOfDoubles = new ArrayList<>(doubles);
        NumbersBox<Double> boxOfDoubles = new NumbersBox<>(listOfDoubles);
        System.out.println("numbersBox.isEmpty() = " + boxOfDoubles.isEmpty());
        Double firstNumber = boxOfDoubles.getFirstNumber();
        System.out.println("numbersBox.getFirstNumber() = " + firstNumber);
        System.out.println("numbersBox.getFirstNumberAsInt() = " + boxOfDoubles.getFirstNumberAsInt());
        Double lastNumber = boxOfDoubles.getLastNumber();
        System.out.println("numbersBox.getLastNumber() = " + lastNumber);
        System.out.println("numbersBox.getLastNumberAsInt() = " + boxOfDoubles.getLastNumberAsInt());

        return boxOfDoubles;
    }
}
