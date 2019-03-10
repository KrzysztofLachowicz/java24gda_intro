package pl.sda.stat;

public class MathTask {
    private MathTask() {}

    public static int add(int a, int b) {
        return a + b;
    }

    public static int min(int a, int b) {
//         if (a < b) { return a; } else { return b; }
        return (a < b) ? a : b; // dokładnie to samo co wyżej
    }

    public static int pow(int a, int b) {
        int wynik = 1;
        for (int i = 1; i <= b; i++) {
            wynik = wynik * a;
        }
        return wynik;
    }

    public static void main(String[] args) {
        int dodawanie = MathTask.add(3, 5);
        System.out.println(dodawanie);

        int min = MathTask.min(3, 5);
        System.out.println(min);

        int pow = MathTask.pow(2, 3);
        System.out.println(pow);
    }
}
