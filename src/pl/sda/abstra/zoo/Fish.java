package pl.sda.abstra.zoo;

public class Fish extends Animal {

    public Fish(String name) {
        super(name);
    }

    public AnimalType getType() {
        return AnimalType.FISH;
    }

    @Override
    public String getVoice() {
        return "Bul, bul!";
    }
}