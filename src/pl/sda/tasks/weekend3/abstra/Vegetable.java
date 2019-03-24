package pl.sda.tasks.weekend3.abstra;

public abstract class Vegetable extends Food {
    public Vegetable(String name) {
        super(name);
    }

    @Override
    public Type getType() {
        return Type.VEGE;
    }
}