package pl.sda.coinpo.composition;

public class Car {
    private String brand;
    private Engine engine; // wkomponowana klasa `Engine`
    private Entertainment entertainment;

    public Car(String brand, Engine engine, Entertainment entertainment) { // konstruktor wymaga od nas podania obiektu typu Engine
        this.brand = brand;
        this.engine = engine;
        this.entertainment = entertainment;
    }

    public String getBrand() {
        return brand;
    }

    public void start() {
        engine.start(); // wywołanie metody na obiekcie `Engine`
        entertainment.radioOn();
    }

    public void radioMute() {
        entertainment.radioMute();
    }

    public void radioOn() {
        entertainment.radioOn();
    }

    public void radioOff() {
        entertainment.radioOff();
    }

    public void volumeUp() {
        entertainment.volumeUp();
    }

    public EngineType getType() {
        return engine.getEngineType(); // wywołanie metody na obiekcie `Engine`
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", engine=" + engine +
                '}';
    }
}
