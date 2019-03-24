package pl.sda.tasks.weekend3.interfaces.animals;

public class Salmon implements Animal, Swimmable {
    @Override
    public String getName() {
        return "Ed";
    }

    @Override
    public String speak() {
        return "BulBul";
    }

    @Override
    public int getAge() {
        return 101;
    }

    @Override
    public void swim() {
        System.out.printf("Salmon %s is swimming\n", getName());
    }
}
