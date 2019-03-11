package pl.sda.tasks.weekend2.coinpo.carentertainment;

public class Car {
    private String brand;
    private Engine engine;
    private Entertainment entertainment;

    public Car(String brand, Engine engine, Entertainment entertainment) {
        this.brand = brand;
        this.engine = engine;
        this.entertainment = entertainment;
    }

    public String getBrand() {
        return brand;
    }

    public void start() {
        engine.start();
    }

    public EngineType getType() {
        return engine.getEngineType();
    }

    public int getVolume() {
        return entertainment.getVolume();
    }

    public void volumeUp() {
        entertainment.volumeUp();
    }

    public void volumeDown() {
        entertainment.volumeDown();
    }

    public void enable(EntertainmentType type) {
        switch (type) {
            case RADIO:
                entertainment.enableRadio();
                break;
            case STREAM:
                entertainment.enableStream();
                break;
        }
    }

    public boolean isPlaying() {
        return entertainment.isRadioOrStreamEnabled();
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", engine=" + engine +
                ", entertainment=" + entertainment +
                '}';
    }
}
