package pl.sda.tasks.weekend3.exceptions;

import java.util.Scanner;

/**
 * 4. Napisz program, który przyjmie od użytkownika ciąg liczb oddzielonych spacją.
 * Następnie obliczy sumę podanych liczb i wyświetli ją na ekranie.
 * Dodaj obsługę wyjątków w taki sposób, by na ekranie zawsze pojawiła się odpowiedź - samodzielnie znajdź możliwe do wystąpienia wyjątki.
 */
public class SumNumsFromInput {
    public static void main(String[] args) {
        SumNumsFromInput handler = new SumNumsFromInput();
        Scanner scanner = new Scanner(System.in);
        System.out.print(">>> ");
        String input = scanner.nextLine();

        // 6. Napisz obsługę własnego wyjątku.
        try {
            int sum = handler.sumInput(input);
            System.out.println("Sum for the input is = " + sum);
        } catch (SumIsLessThanZeroException siltze) {
            System.out.println("SumIsLessThanZeroException was catched! Sum is less than zero ;)");
        }
    }

    public int sumInput(String input) throws SumIsLessThanZeroException {
        int sum = 0;
        String[] chunks = input.split("\\s");
        for (String chunk : chunks) {
            try {
                sum += parseNumber(chunk);
            } catch (NumberFormatException e) {
                System.out.println("It's not valid number! > " + chunk);
            }
        }

        if (sum < 0) {
            throw new SumIsLessThanZeroException();
        }

        return sum;
    }

    private static int parseNumber(String input) {
        return Integer.parseInt(input);
    }
}
