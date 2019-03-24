package pl.sda.tasks.weekend3.abstra;

public class Salad extends Vegetable {
    public Salad(String name) {
        super(name);
    }

    @Override
    public String getTaste() {
        return "freshly";
    }
}
