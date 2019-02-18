package pl.sda.abstra.zoo;

public class Dog extends Mammal {
    public Dog(String name) {
        super(name);
    }

    public String getVoice() {
        return "Hau, Hau!";
    }
}