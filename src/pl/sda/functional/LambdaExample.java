package pl.sda.functional;

import pl.sda.generics.Person;
import pl.sda.generics.Student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExample {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Maciek", "Rzepiński"),
                new Student("Jan", "Kowalski"),
                new Student("Jan", "Nowak")
        );

        students.forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Integer result = numbers.stream().reduce(0, (a, b) -> a + b);
//        Integer result = numbers.stream().reduce(0, Integer::sum); // dokładnie to samo co wyżej
        System.out.println(result);
        // 1 -> 0, (0, 1) -> 0 + 1
        // 2 -> 1, (1, 2) -> 1 + 2
        // 3 -> 3, (3, 3) -> 3 + 3
        // 4 -> 6, (6, 4) -> 6 + 4
        // 5 -> 10, (10, 5) -> 10 + 5
        // =15

        String reduce = students.stream()
            .map(Person::getFirstName)
//            .map(Student::getFirstName)
//            .map(student -> student.getFirstName()) // List<String> imiona
            .reduce("First names: ", (string1, string2) -> {
                // ...
                return string1 + ", " + string2;
            });
        System.out.println(reduce);

        List<Student> processedList = students.stream()
            .filter(student -> "Jan".equals(student.getFirstName())) // List<Student> (2)
            .map(student -> {
                System.out.println(student);
                return new Student(
                    student.getFirstName().toUpperCase(),
                    student.getLastName().toUpperCase()
                );
            }) // List<Student> (2) ale imiona i nazwiska pisane są wielką literą
            .sorted(Comparator.comparing(Person::getLastName)) // sortujemy wynik działania funkcji map po nazwisku
            .collect(Collectors.toList()); // zbieramy wyniki do nowej kolekcji List

        System.out.println(processedList.isEmpty());

        if (!processedList.isEmpty()) {
            processedList.forEach(System.out::println);
        }
    }
}
