package pl.sda.tasks.weekend3.stat;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Product {
    private static final double DISCOUNT;
    private static int counter = 100;

    private int id;
    private String name;
    private double price;

    static {
        if (LocalDate.now().getDayOfWeek() == DayOfWeek.FRIDAY) {
            DISCOUNT = 0.3;
        } else {
            DISCOUNT = 0;
        }
    }

    {
        id = counter++;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price - price * DISCOUNT;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", price=" + getPrice() +
                '}';
    }
}
