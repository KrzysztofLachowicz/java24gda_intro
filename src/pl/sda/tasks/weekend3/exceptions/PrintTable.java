package pl.sda.tasks.weekend3.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 1. Dodaj obsługę wyjątków w klasach GetNumber oraz PrintTable.
 */
public class PrintTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(">>>");
        try {
            int index = scanner.nextInt();
            String[] fruits = new String[]{"apple", "organe", "mango", "cheery"};
            System.out.println(fruits[index]);
        } catch (InputMismatchException ime) {
            System.out.println("InputMismatchException: " + ime.getMessage());
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("ArrayIndexOutOfBoundsException: " + aioobe.getMessage());
        // 2. Dodaj sekcję finally, która w klasach GetNumber oraz PrintTable wykona się i wyświetli komunikat końcowy.
        } finally {
            System.out.println("Finally finished in `PrintTable` class!");
        }
    }
}
