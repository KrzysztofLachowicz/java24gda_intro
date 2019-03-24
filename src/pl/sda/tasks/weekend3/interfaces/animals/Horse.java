package pl.sda.tasks.weekend3.interfaces.animals;

public class Horse implements Animal {
    @Override
    public String getName() {
        return "Storm";
    }

    @Override
    public String speak() {
        return "Ihahahaaa";
    }

    @Override
    public int getAge() {
        return 25;
    }

    @Override
    public boolean isAlive() {
        return true;
    }
}
