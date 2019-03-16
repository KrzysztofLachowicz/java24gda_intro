package pl.sda.generics.boxes;

public abstract class Fruit {
    private boolean rotten;

    protected Fruit(boolean rotten) {
        this.rotten = rotten;
    }

    public boolean isRotten() {
        return rotten;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "rotten=" + rotten +
                '}' + getClass().getSimpleName();
    }
}