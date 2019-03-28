package pl.sda.tasks.weekend4.generics.forest;

public class ConiferTree extends Tree {
    public ConiferTree(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return String.format("ConiferTree: %s - age: %d", getName(), getAge());
    }
}
