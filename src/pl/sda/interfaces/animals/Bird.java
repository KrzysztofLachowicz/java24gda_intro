package pl.sda.interfaces.animals;

public class Bird implements Animal, Flyable {
    @Override
    public String getName() {
        return "Orzeł Biały";
    }

    @Override
    public String speak() {
        return "Wiuuuu";
    }

    @Override
    public String fly() {
        return "Orzeł lata";
    }
}
