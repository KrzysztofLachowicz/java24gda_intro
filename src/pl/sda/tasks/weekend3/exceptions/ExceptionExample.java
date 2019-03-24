package pl.sda.tasks.weekend3.exceptions;

import pl.sda.exceptions.MyException;

import java.util.Scanner;

/**
 * 3. Przerób klasę ExceptionExample tak, by "łapała" dwa wyjątki w jednej sekcji catch.
 */
public class ExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(">>> ");
            String input = scanner.nextLine();

            if ("q".equalsIgnoreCase(input)) {
                break;
            }

            try {
                int number = getNumber(input);
                double sqrt = getSqrt(number);
                System.out.println("Sqrt for " + number + " = " + sqrt);
            } catch (MyException | NumberFormatException e) {
                System.out.println("It's not valid number!");
            } finally {
                System.out.println("We will continue in loop ;)");
            }
        }
    }

    private static int getNumber(String input) {
        return Integer.parseInt(input);
    }

    private static double getSqrt(int num) throws MyException {
        if (0 > num) {
            throw new MyException();
        }
        return Math.sqrt(num);
    }
}
