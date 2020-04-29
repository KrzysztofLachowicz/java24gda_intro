package pl.sda.livecoding.encapsulation.factory;

public class Car {
    int serialId;
    int factoryId;

    public Car(int serialId, int factoryId) {
        this.serialId = serialId;
        this.factoryId = factoryId;
    }

    @Override
    public String toString() {
        return "Car{" +
                "serialId=" + serialId +
                ", factoryId=" + factoryId +
                '}';
    }
}
