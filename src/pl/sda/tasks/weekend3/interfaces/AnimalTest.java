package pl.sda.tasks.weekend3.interfaces;

import pl.sda.tasks.weekend3.interfaces.animals.*;

public class AnimalTest {
    public static void main(String[] args) {
        Animal maja = new Bee();
        Animal robo = new Gecon();
        Animal storm = new Horse();
        Animal joe = new Parrot();
        Animal ed = new Salmon();

        printAnimals(maja, robo, storm, joe, ed);

        System.out.println("----------------");

        Swimmable gecon = new Gecon();
        Swimmable salmon = new Salmon();
        Swimmingpool swimmingpool = new Swimmingpool(gecon, salmon);
        swimmingpool.makeThemSwim();
    }

    private static void printAnimals(Animal... animals) {
        for (Animal animal : animals) {
            String state = "alive";
            if(!animal.isAlive()) {
                state = "dead";
            }
            System.out.printf("%s of age: %s is %s and speaks: %s\n", animal.getName(), animal.getAge(), state, animal.speak());
        }

    }
}
