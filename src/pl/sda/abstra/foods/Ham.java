package pl.sda.abstra.foods;

public class Ham extends Meat {
    public Ham(String name) {
        super(name);
    }

    @Override
    public String getTaste() {
        return "juicy";
    }
}
