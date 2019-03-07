package pl.sda.tasks.weekend1.oop;

// Sposób użycia klasy Triangle
public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();

        // #1
        boolean isRectangular = triangle.isRectangular(3, 4, 5);
        System.out.println("Is rectangular? -> " + isRectangular);

        // #2
        int a = 5;
        int b = 6;
        int c = 11;
        System.out.println("Is rectangular? -> " + triangle.isRectangular(a, b, c));
    }
}
