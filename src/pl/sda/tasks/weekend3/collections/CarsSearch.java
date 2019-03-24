package pl.sda.tasks.weekend3.collections;

import pl.sda.coinpo.composition.EngineType;

import java.util.ArrayList;
import java.util.List;

/**
 * 6. Rozszerz klasę Car z przykładu i dodaj do niej pola opisujące własności samochodu.
 * Utwórz kolekcję samochodów możliwych do kupna (przynajmniej 10 pozycji).
 * Następnie napisz program pozwalający użytkownikowi na przeszukiwanie bazy dostępnych kolekcji na podstawie podawanych parametrów.
 * Wynikiem powinna być lista dostępnych pojazdów lub komunikat o braku danych.
 */
public class CarsSearch {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Tesla", "Model S", EngineType.ELECTRIC, "black"));
        cars.add(new Car("Tesla", "Model 3", EngineType.ELECTRIC, "gray"));
        cars.add(new Car("Tesla", "Model X", EngineType.ELECTRIC, "white"));
        cars.add(new Car("Toyota", "Yaris", EngineType.PETROL, "black"));
        cars.add(new Car("Toyota", "Yaris", EngineType.HYBRID, "blue"));
        cars.add(new Car("Toyota", "Auris", EngineType.DIESEL, "white"));
        cars.add(new Car("Toyota", "Auris", EngineType.HYBRID, "red"));
        cars.add(new Car("Toyota", "Auris", EngineType.PETROL, "yellow"));
        cars.add(new Car("Ford", "Galaxy", EngineType.PETROL, "silver"));
        cars.add(new Car("BMW", "X3", EngineType.HYBRID, "black"));

        CarsSearch carsSearch = new CarsSearch();
        System.out.println("All Tesla cars > " + carsSearch.search(cars, "tesla"));
        System.out.println("All cars with the name starting from `mod` >" + carsSearch.search(cars, "mod"));
        System.out.println("All black cars >" + carsSearch.search(cars, "black"));
        System.out.println("All hybrid cars >" + carsSearch.search(cars, "hybrid"));
    }

    public List<Car> search(List<Car> cars, String value) {
        List<Car> found = new ArrayList<>();
        value = value.toLowerCase();
        for (Car car : cars) {
            if (car.getBrand().toLowerCase().contains(value)
                || car.getName().toLowerCase().contains(value)
                || car.getEngineType().name().toLowerCase().contains(value)
                || car.getColor().toLowerCase().contains(value)) {
                found.add(car);
            }
        }
        return found;
    }
}
