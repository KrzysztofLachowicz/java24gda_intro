package pl.sda.abstra;

import pl.sda.abstra.shapes.Circle;
import pl.sda.abstra.shapes.Rectangle;
import pl.sda.abstra.shapes.Shape;

public class Shapes {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        rectangle.draw();

        Circle circle = new Circle();
        circle.draw();
    }
}