package pl.sda.tasks.weekend3.interfaces.plants;

import pl.sda.tasks.weekend3.interfaces.animals.Being;

public interface Plant extends Being {

    String getName();

    @Override
    default boolean isAlive() {
        return getAge() < 1000;
    }
}
