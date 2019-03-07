package pl.sda.tasks.weekend1.statements;

import java.util.Scanner;

public class StatementsTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //#1 Napisz program, który wypisze na ekran konsoli, czy dana liczba całkowita znajduje się w przedziale:
        // 1-10, 11-100, 101-1000, 1001-10000, czy też może jest mniejsza od 0 lub większa od 10000.
        // Parametrem wejściowym niech będzie zmienna zainicjowana na początku programu.

        //System.out.print("Enter number: ");
        //int number = scanner.nextInt();

        int number = 101;
        if (number <= 0) {
            System.out.println("number <= 0");
        } else if (number > 0 && number <= 10) {
            System.out.println("1 <= number <= 10");
        } else if (number > 10 && number <= 100) {
            System.out.println("11 <= number <= 100");
        } else if (number > 100 && number <= 1000) {
            System.out.println("101 <= number <= 1000");
        } else if (number > 1000 && number <= 10000) {
            System.out.println("1001 <= number <= 10000");
        } else {
            System.out.println("number > 10000");
        }

        //#2 Napisz program, który wypisze na ekran konsoli, słowo oznaczające ocenę dla podanej cyfry.
        // Np. dla 1 - "niedostateczny", 2 - "mierny" itp. Obsłuż przypadek gdy cyfra jest poza skalą ocen.

        //System.out.print("Enter number: ");
        //int grade = scanner.nextInt();

        int grade = 4;
        switch (grade) {
            case 1:
                System.out.println("niedostateczny");
                break;
            case 2:
                System.out.println("mierny");
                break;
            case 3:
                System.out.println("dostateczny");
                break;
            case 4:
                System.out.println("dobry");
                break;
            case 5:
                System.out.println("bardzo dobry");
                break;
            case 6:
                System.out.println("celujący");
                break;
            default:
                System.out.println("liczba poza skalą ocen");
        }

        //#3 Napisz program, który wypisze na ekran konsoli, cyfrę arabską dla podanej liczby rzymskiej (od 1 do 9).
        // Czyli np. dla 'I' wypisze 1, dla 'V' 5 itp. Obsłuż przypadek gdy podana liczba rzymska jest nieprawidłowa.

        //System.out.print("Enter roman number: ");
        //String roman = scanner.next();

        String roman = "V";
        switch (roman) {
            case "I":
                System.out.println("1");
                break;
            case "II":
                System.out.println("2");
                break;
            case "III":
                System.out.println("3");
                break;
            case "IV":
                System.out.println("4");
                break;
            case "V":
                System.out.println("5");
                break;
            case "VI":
                System.out.println("6");
                break;
            case "VII":
                System.out.println("7");
                break;
            case "VIII":
                System.out.println("8");
                break;
            case "IX":
                System.out.println("9");
                break;
            default:
                System.out.println("unknown number");
        }

        //#4 Napisz program, który wypisze na ekran konsoli czy podany kod Unicode jest liczbą (0-9), małą literą (a-z) czy też dużą literą (A-Z).
        // Kody każdej z grup znaków następują po sobie więc wystarczy znaleźć kod np. dla litery 'a' i 'z' i sprawdzić czy podany kod zawiera się w tym przedziale.

        //System.out.print("Enter code: ");
        //int code = scanner.nextInt();

        int code = 67;
        if(code >= '0' && code <= '9') {
            System.out.println("It's the digit!");
        } else if(code >= 'a' && code <= 'z') {
            System.out.println("It's the small letter!");
        } else if(code >= 'A' && code <= 'Z') {
            System.out.println("It's the large letter!");
        } else {
            System.out.println("Unknonw code!");
        }

        //#5 Napisz program, który dla podanej liczby wypisze na ekran konsoli dzień tygodnia
        // (dla 1 - "poniedziałek", 2 - "wtorek" itp). Dodatkowo wyświetl ile dni zostało do weekendu, dla poniedziałku - 5 dni, wtorku - 4 itp.

        //System.out.print("Enter day number: ");
        //int dayNumber = scanner.nextInt();

        int dayNumber = 3;
        String dayName = "unknown";
        switch (dayNumber) {
            case 1:
                dayName = "poniedziałek";
                break;
            case 2:
                dayName = "wtorek";
                break;
            case 3:
                dayName = "środa";
                break;
            case 4:
                dayName = "czwartek";
                break;
            case 5:
                dayName = "piątek";
                break;
            case 6:
                dayName = "sobota";
                break;
            case 7:
                dayName = "niedziela";
                break;
        }
        int numberOfDaysToWeekend = 6 - dayNumber;
        String message = "";
        if(numberOfDaysToWeekend > 0 && numberOfDaysToWeekend <= 5) {
            message = "Number of days to weekend: " + numberOfDaysToWeekend;
        } else if(numberOfDaysToWeekend == 1 || numberOfDaysToWeekend == 2) {
            message = "It's the weekend :) !";
        }
        System.out.println("Your day is " + dayName + ". " + message);
    }
}
