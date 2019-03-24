package pl.sda.tasks.weekend3.abstra;

public class Ham extends Meat {
    public Ham(String name) {
        super(name);
    }

    @Override
    public String getTaste() {
        return "good";
    }
}
