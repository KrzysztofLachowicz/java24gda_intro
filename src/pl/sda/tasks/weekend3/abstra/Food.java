package pl.sda.tasks.weekend3.abstra;

public abstract class Food {
    enum Type {MEAT, VEGE;}

    private String name;

    protected Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void describe() {
        System.out.printf("Food of name: %s [%s] is: %s\n", getName(), getType(), getTaste());
    }

    public abstract String getTaste();

    public abstract Type getType();
}