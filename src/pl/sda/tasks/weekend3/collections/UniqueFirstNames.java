package pl.sda.tasks.weekend3.collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 4. Napisz metodę, która będzie przyjmować imiona od użytkownika,
 * a wprowadzenie znaku "q" przerwie jej działanie i wyświetli wszystkie unikalne imiona dodane do kolekcji.
 */
public class UniqueFirstNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> uniqueNames = new HashSet<>();

        while (true) {
            System.out.println(">>>");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("q")) {
                System.out.println("Unique names: " + uniqueNames);
                break;
            }
            uniqueNames.add(input);
        }
    }
}
