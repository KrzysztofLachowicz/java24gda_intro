package pl.sda.tasks.weekend3.interfaces.animals;

public interface Being {
    int MAX_AGE = 100;

    int getAge();

    default boolean isAlive() {
        return getAge() < MAX_AGE;
    }
}
