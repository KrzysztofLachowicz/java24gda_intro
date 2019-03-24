package pl.sda.tasks.weekend3.abstra;

public class Carrot extends Vegetable {
    public Carrot(String name) {
        super(name);
    }

    @Override
    public String getTaste() {
        return "sweet";
    }
}
