package pl.sda.tasks.weekend3.abstra;

public abstract class Meat extends Food {
    public Meat(String name) {
        super(name);
    }

    @Override
    public Type getType() {
        return Type.MEAT;
    }
}
