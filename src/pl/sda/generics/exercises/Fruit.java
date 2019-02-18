package pl.sda.generics.exercises;

public class Fruit implements Plants {
    private String name;

    public Fruit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
