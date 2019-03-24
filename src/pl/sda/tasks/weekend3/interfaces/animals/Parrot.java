package pl.sda.tasks.weekend3.interfaces.animals;

public class Parrot implements Animal, Flyable {
    @Override
    public String getName() {
        return "Joe";
    }

    @Override
    public String speak() {
        return "Arrrr";
    }

    @Override
    public int getAge() {
        return 4;
    }

    @Override
    public void fly() {
        System.out.printf("Parrot %s is flying\n", getName());
    }
}