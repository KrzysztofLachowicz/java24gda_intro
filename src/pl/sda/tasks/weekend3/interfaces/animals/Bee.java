package pl.sda.tasks.weekend3.interfaces.animals;

public class Bee implements Animal, Flyable {
    @Override
    public String getName() {
        return "Maja";
    }

    @Override
    public String speak() {
       return "Bzzzz";
    }

    @Override
    public int getAge() {
        return 15;
    }

    @Override
    public void fly() {
        System.out.printf("Bee %s is flying\n", getName());
    }
}