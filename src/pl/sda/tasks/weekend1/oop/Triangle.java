package pl.sda.tasks.weekend1.oop;

// Utwórz klasę Triangle i napisz metodę isRectangular(), która jako argumenty przyjmować będzie trzy liczby całkowite.
// Metoda powinna zwrócić true jeśli z odcinków o długości przekazanych w argumentach można zbudować trójkąt prostokątny.
// Wzór który może pomóc: c2 = a2 + b2
public class Triangle {

    // ponizej 3 sposoby napisania funkcji `isRectangular`

    // #1
    public boolean isRectangular(int a, int b, int c) {
        if (c * c == a * a + b * b) {
            return true;
        }
        return false;
    }

    // #2
//    public boolean isRectangular(int a, int a2, int c) {
//        boolean isRectangular = false;
//        if (c * c == a * a + a2 * a2) {
//            isRectangular = true;
//        }
//        return isRectangular;
//    }

    // #3
//    public boolean isRectangular(int a, int a2, int c) {
//        return c * c == a * a + a2 * a2;
//    }

    public void print(int a) {
        if (a > 3) {
            System.out.println("> 3!");
        }
        System.out.println("< 3!");
    }

}
