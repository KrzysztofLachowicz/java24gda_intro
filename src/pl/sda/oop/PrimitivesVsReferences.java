package pl.sda.oop;

public class PrimitivesVsReferences {
    public static void main(String[] args) {
        /*
           Operacje na zmiennych typów pierwotnych
         */
        int x, y, z;

        x = 3;
        y = 4;
        x = y;
        y = 5;
        z = 5;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        if (x == y) {
            System.out.println("x == y");
        } else {
            System.out.println("x != y");
        }

        if (y == z) {
            System.out.println("y == z");
        } else {
            System.out.println("y != z");
        }

        /*
           Podobne operacje na zmiennych typu referencyjnego
         */
        Point p1 = new Point();
        Point p2 = new Point();
        Point p3 = new Point();

        p1.set(3, 3);
        p2.set(4, 4);
        p3.set(5, 5);
        p1 = p2;
        p2.set(5, 5);

        System.out.print("Point p1: ");
        p1.show();
        System.out.print("Point p2: ");
        p2.show();
        System.out.print("Point p3: ");
        p3.show();

        if (p1 == p2) {
            System.out.println("p1 == p2");
        } else {
            System.out.println("p1 != p2");
        }

        if (p2 == p3) {
            System.out.println("p2 == p3");
        } else {
            System.out.println("p2 != p3");
        }
    }
}
