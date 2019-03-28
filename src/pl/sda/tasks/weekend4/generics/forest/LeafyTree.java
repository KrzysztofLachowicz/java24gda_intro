package pl.sda.tasks.weekend4.generics.forest;

public class LeafyTree extends Tree {
    public LeafyTree(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return String.format("LeafyTree: %s - age: %d", getName(), getAge());
    }
}
