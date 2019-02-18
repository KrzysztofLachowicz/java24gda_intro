package pl.sda.abstra;

import pl.sda.abstra.zoo.Animal;
import pl.sda.abstra.zoo.Dog;
import pl.sda.abstra.zoo.Fish;

public class Zoo {
    private Animal[] animals;

    public Zoo() {
        animals = new Animal[4];
        animals[0] = new Dog("Reksio");
        animals[1] = new Fish("Nemo");
        animals[2] = new Dog("Szarik");
        animals[3] = new Fish("Dora");
    }

    public void animalsDialog() {
        for (Animal animal : animals) {
            System.out.println(animal.speak());
        }
    }

    public static void main(String[] args) {
        Zoo zooKeeper = new Zoo();
        zooKeeper.animalsDialog();
    }
}
