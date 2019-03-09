package pl.sda.abstra.foods;

public class Salad extends Vegetable {
    public Salad(String name) {
        super(name);
    }

    @Override
    public String getTaste() {
        return "freshy";
    }
}
