package pl.sda.tasks.weekend4.functional;

import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * 4. Utwórz kolekcję zawierającą obiekty typu Person. Napisz metodę do przeszukiwania kolekcji (po nazwie) z wykorzystaniem interfejsu stream().
 *  Napisz kod umożliwiający wprowadzanie danych do przeszukiwania kolekcji z poziomu konsoli.
 *  Obsłuż możliwe do wystąpienia wyjątki oraz zadbaj by Twój program zawsze wyświetlał odpowiednie komunikaty dla użytkownika
 */
public class PearsonSearcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameToSearch;
        do {
            Stream<Person> personStream = Stream.of(new Person(22, "Marta"), new Person(23, "Ula"), new Person(21, "Rafał"), new Person(25, "Olek"),
                    new Person(20, "Zenon"), new Person(19, "Adam"), new Person(19, "Iza"), new Person(16, "Ela"));

            System.out.print("Enter name to search: ");
            nameToSearch = scanner.nextLine();
            if (nameToSearch == null || nameToSearch.isEmpty()) {
                System.out.println("Name is incorrect, try again!");
                nameToSearch = null;
            }

            Optional<Person> person = searchByName(personStream, nameToSearch);

            if (person.isPresent()) {
                System.out.println("Found person: " + person);
            } else {
                System.out.println("Person no found!");
                nameToSearch = null;
            }
        } while (nameToSearch == null);

    }

    private static Optional<Person> searchByName(Stream<Person> personStream, String nameToSearch) {
        return personStream
                .filter(person -> person.getName().equals(nameToSearch))
                .findFirst();
    }
}
