package pl.sda.generics.boxes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LiveCoding {
    public static void main(String[] args) {
        Orange orange = new Orange(false);
        Apple apple = new Apple(true);
        Strawberry strawberry = new Strawberry(false);

        Box<Apple> appleBox = new Box<>(apple);
        Apple apple1 = appleBox.getItem();

        Box<Orange> orangeBox = new Box<>(orange);
        Box box = new Box(strawberry);
        Object item = box.getItem();

        List<Fruit> fruits = Arrays.asList(orange, apple, strawberry);
        List<Fruit> healthyFruits = removeRotten(fruits);
        System.out.println("healthyFruits = " + healthyFruits);
    }

    public static <T extends Fruit> List<T> removeRotten(List<T> fruits) {
        List<T> fruitsNotRotten = new ArrayList<>();
        for (T fruit : fruits) {
            if(!fruit.isRotten()) {
                fruitsNotRotten.add(fruit);
            }
        }

        return fruitsNotRotten;
    }
}
