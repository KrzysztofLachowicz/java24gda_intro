package pl.sda.abstra;

import pl.sda.abstra.zoo.Animal;
import pl.sda.abstra.zoo.Dog;

public class ZooKeeper {

    public static void main(String[] args) {
        Animal myDog = new Dog("Reksio");
        String speech = myDog.speak();
        System.out.println(speech);
    }
}
