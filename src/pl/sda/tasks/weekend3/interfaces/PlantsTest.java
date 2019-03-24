package pl.sda.tasks.weekend3.interfaces;

import pl.sda.tasks.weekend3.interfaces.plants.Flower;
import pl.sda.tasks.weekend3.interfaces.plants.Plant;
import pl.sda.tasks.weekend3.interfaces.plants.Tree;

public class PlantsTest {
    public static void main(String[] args) {
        Plant rose = new Flower();
        Plant bartek = new Tree();

        printAnimals(rose, bartek);
    }

    private static void printAnimals(Plant... plants) {
        for (Plant plant : plants) {
            String state = "alive";
            if(!plant.isAlive()) {
                state = "dead";
            }
            System.out.printf("%s of age: %s is %s\n", plant.getName(), plant.getAge(), state);
        }

    }
}
