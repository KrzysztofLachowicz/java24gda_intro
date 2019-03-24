package pl.sda.tasks.weekend3.interfaces;

import pl.sda.tasks.weekend3.interfaces.animals.Swimmable;

public class Swimmingpool {
    private Swimmable[] animals;

    public Swimmingpool(Swimmable... animals) {
        this.animals = animals;
    }

    public void makeThemSwim() {
        for (Swimmable animal : animals) {
            animal.swim();
        }
    }
}
