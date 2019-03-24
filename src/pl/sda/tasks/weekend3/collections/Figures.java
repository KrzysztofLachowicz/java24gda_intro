package pl.sda.tasks.weekend3.collections;

import pl.sda.interfaces.Circle;
import pl.sda.interfaces.Figure;
import pl.sda.interfaces.Rectangle;
import pl.sda.interfaces.Triangle;

import java.util.ArrayList;
import java.util.List;

/**
 * 1. Bazując na kodzie utworzonym na potrzeby omawiania interfejsów, utwórz kolekcję figur każdego typu.
 * Na podstawie utworzonej kolekcji, oblicz pola i obwody wszystkich figur znajdujących się w kolekcji.
 */
public class Figures {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 10);
        Circle circle = new Circle(10);
        Triangle triangle = new Triangle(3, 5);

        List<Figure> figures = new ArrayList<>();
        figures.add(rect);
        figures.add(circle);
        figures.add(triangle);

        double sumOfFiguresArea = 0.0;
        double sumOfFiguresPerimeter = 0.0;
        for (Figure figure : figures) {
            sumOfFiguresArea += figure.getArea();
            sumOfFiguresPerimeter += figure.getPerimeter();
        }
        System.out.println("Sum of figures area: " + sumOfFiguresArea);
        System.out.println("Sum of figures perimeter: " + sumOfFiguresPerimeter);
    }
}
