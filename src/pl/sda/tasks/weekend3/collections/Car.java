package pl.sda.tasks.weekend3.collections;

import pl.sda.coinpo.composition.EngineType;

import java.util.Objects;

public class Car implements Comparable<Car> {
    private String brand;
    private String name;
    private EngineType engineType;
    private String color;

    public Car(String brand, String name, EngineType engineType, String color) {
        this.brand = brand;
        this.name = name;
        this.engineType = engineType;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(brand, car.brand) &&
                Objects.equals(name, car.name) &&
                engineType == car.engineType &&
                Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, name, engineType, color);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", engineType=" + engineType +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        return this.name.compareTo(o.name);
    }

}
