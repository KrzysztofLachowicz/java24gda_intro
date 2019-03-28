package pl.sda.tasks.weekend4.generics.forest;

public abstract class Tree {
    private String name;
    private int age;

    public Tree(String name, int age) {
        this.name = "Drzewo: " + name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
