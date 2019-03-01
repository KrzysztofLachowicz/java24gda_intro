package pl.sda.encapsulation;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Product {
    private final double NO_DISCOUNT = 1.0;
    private final double SATURDAY_DISCOUNT = 0.8;
    private String name;
    private double price;

    public Product(String name, double price) {
        if (name == null) {
            // obsługa błędnego parametru
            throw new IllegalArgumentException("name can't be null");
        }
        if (price <= 0) {
            // obsługa błędnego parametru
            throw new IllegalArgumentException("price must be > 0");
        }
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        double discount = getDiscount();
        return price * discount;
    }

    private double getDiscount() {
        if (todayIsSaturday()) {
            return SATURDAY_DISCOUNT;
        }
        return NO_DISCOUNT;
    }

    private boolean todayIsSaturday() {
        // kod sprawdzający datę
        return LocalDate.now().getDayOfWeek() == DayOfWeek.SATURDAY;
    }

    public static void main(String[] args) {
        Product tv = new Product("Smart TV", 1999.99);
        System.out.println("tv = " + tv.getName());
        System.out.println("tv price = " + tv.getPrice());
    }
}