package pl.sda.tasks.weekend3.interfaces.plants;

public class Flower implements Plant {
    @Override
    public int getAge() {
        return 1;
    }

    @Override
    public String getName() {
        return "Red Rose";
    }
}
