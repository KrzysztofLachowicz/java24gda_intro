package pl.sda.tasks.weekend3.collections;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/**
 * 3. Napisz klasę o nazwie Person, która będzie zawierać pola: firstName i lastName.
 * Klasa powinna implementować interfejs Comparable.
 * Następnie utwórz kolekcję i dodaj do niej kilka obiektów klasy Person.
 * Kolekcja powinna sortować alfabetycznie wszystkie dodawane elementy.
 */
public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static void main(String[] args) {
        Set<Person> persons = new TreeSet<>();
        persons.add(new Person("Jan", "Nowak"));
        persons.add(new Person("Jan", "Kowalski"));
        persons.add(new Person("Karolina", "Kowalska"));
        persons.add(new Person("Kacper", "Wiśniewski"));
        persons.add(new Person("Jakub", "Wójcik"));
        persons.add(new Person("Zofia", "Kowalczyk"));

        System.out.println("Collections of persons >");
        for (Person p : persons) {
            System.out.println(p);
        }
    }

    @Override
    public int compareTo(Person o) {
        // sort by first names first
//        int compareFirstNames = this.firstName.compareTo(o.firstName);
//        if (compareFirstNames == 0) {
//            // if first names are the same then sort by last names
//            return this.lastName.compareTo(o.lastName);
//        }
//        return compareFirstNames;

        // sort by last names first
        int compareLastNames = this.lastName.compareTo(o.lastName);
        if (compareLastNames == 0) {
            // if last names are the same then sort by first names
            return this.firstName.compareTo(o.firstName);
        }
        return compareLastNames;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
