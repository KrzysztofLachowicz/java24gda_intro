package pl.sda.abstra.zoo;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract AnimalType getType();

    public abstract String getVoice();

    public String speak() {
        return getType() + " of name: " + getName() + " says: " + getVoice();
    }
}