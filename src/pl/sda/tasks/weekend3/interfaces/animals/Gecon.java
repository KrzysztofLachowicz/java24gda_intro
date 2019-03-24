package pl.sda.tasks.weekend3.interfaces.animals;

public class Gecon implements Animal, Swimmable {
    @Override
    public String getName() {
        return "Robo";
    }

    @Override
    public String speak() {
        return "Tsssss";
    }

    @Override
    public int getAge() {
        return 99;
    }

    @Override
    public void swim() {
        System.out.printf("Gecon %s is swimming\n", getName());
    }
}
