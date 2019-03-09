package pl.sda.coinpo.polymorphism;

import pl.sda.coinpo.shapes.Rectangle;
import pl.sda.coinpo.shapes.Shape;
import pl.sda.coinpo.shapes.Square;

public class PolymorphismExample {
    public static void main(String[] args) {
        Square square = new Square(10);
        Shape shapeFromSquare = square;
        Object objectFromSquare = square;

        System.out.println(square.getType());
        System.out.println(shapeFromSquare.getType());

        Rectangle rectangle = new Rectangle(10, 20);
        Shape shapeFromRectangle = rectangle;

        System.out.println(rectangle.getType());
        System.out.println(shapeFromRectangle.getType());
    }
}