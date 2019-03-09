package pl.sda.interfaces.animals;

public class Horse implements Animal {
    @Override
    public String getName() {
        return "Rączy Kazik";
    }

    @Override
    public String speak() {
        return "Ihhahaha";
    }
}
