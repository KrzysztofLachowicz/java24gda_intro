package pl.sda.abstra.zoo;

public abstract class Mammal extends Animal {

    public Mammal(String name) {
        super(name);
    }

    public AnimalType getType() {
        return AnimalType.MAMMAL;
    }
}