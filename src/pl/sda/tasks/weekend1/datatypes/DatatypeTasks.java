package pl.sda.tasks.weekend1.datatypes;

public class DatatypeTasks {
    public static void main(String[] args) {
        //#1 Napisz program, który utworzy dwie zmienne, a następnie wypisze na ekran ich sumę, różnicę i iloczyn.
        int x = 10;
        int y = 13;
        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));

        //#2 Napisz program, który tworzy jedną zmienną, a następnie wypisze na ekran jej wartość podniesioną do 3 potęgi.
        int z = 6;
        System.out.println("Number: " +  z + " raised to the third power " + (z * z * z));

        //#3 Napisz program, który utworzy jedną zmienną, a następnie wypisze na ekran czy wartość tej zmiennej jest liczbą parzystą czy nieparzystą.
        int z1 = 2;
        System.out.println("Number: " +  z1 + " is even? : " + (z1 % 2 == 0));
        z1 = 13;
        System.out.println("Number: " +  z1 + " is even? : " + (z1 % 2 == 0));

        //#4 Napisz program, który utworzy jedną zmienną, a następnie wypisze na ekran czy wartość tej zmiennej jest podzielna przez 3 i jednocześnie przez 5.
        int a = 7;
        System.out.println("Number: " +  a + " is divisible by 3&5? : " + (a % 3 == 0 && a % 5 == 0));
        a = 15;
        boolean isDivisibleBy3 = a % 3 == 0;
        boolean isDivisibleBy5 = a % 5 == 0;
        System.out.println("Number: " +  a + " is divisible by 3&5? : " + (isDivisibleBy3 && isDivisibleBy5));

        //#5 Wyświetl na ekranie pięć pierwszych liter alfabetu: łacińskiego (zaczyna się od kodu: 65), hebrajskiego (zaczyna się od: 1488) i tybetańskiego (zaczyna się od: 3840)
        char c = 65;
        System.out.print("First 5 letters of the Latin alphabet: " + c++);
        System.out.print(" " + c++);
        System.out.print(" " + c++);
        System.out.print(" " + c++);
        System.out.print(" " + c);
        System.out.println();
        c = 1488;
        System.out.print("First 5 letters of the Hebrew alphabet: " + c);
        System.out.print(" " + ++c);
        System.out.print(" " + ++c);
        System.out.print(" " + ++c);
        System.out.print(" " + ++c);
        System.out.println();
        c = 3840;
        System.out.println("First 5 letters of the Tibetan alphabet: " + c + " " + ++c + " " + ++c + " " + ++c + " " + ++c);

        //#6 Wyświetl na ekranie w jednej linijce znaki (char) dla kodów: 74, 65, 86, 65, 32, 8658, 32, 9786
        System.out.print("Message from outhere: " + (char) 74 + (char) 65 + (char) 86 + (char) 65 + (char) 32 + (char) 8658 + (char) 32 + (char) 9786);
    }
}
