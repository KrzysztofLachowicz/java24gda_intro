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

        String reduce = students.stream()
            .map(Person::getFirstName)
            .reduce("", (s1, s2) -> s1 + s2);
        System.out.println(reduce);

        List<Student> processedList = students.stream()
            .filter(student -> "Jan".equals(student.getFirstName()))
            .map(student -> {
                System.out.println(student);
                return new Student(
                    student.getFirstName().toUpperCase(),
                    student.getLastName().toUpperCase()
                );
            })
            .sorted(Comparator.comparing(Person::getLastName))
            .collect(Collectors.toList());

        if (!processedList.isEmpty()) {
            processedList.forEach(System.out::println);
        }
    }
}
