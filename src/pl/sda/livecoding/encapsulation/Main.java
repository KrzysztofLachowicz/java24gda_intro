package pl.sda.livecoding.encapsulation;

import pl.sda.livecoding.encapsulation.carstore.Car;

public class Main {

    public static void main(String[] args) {
	    Car ford = new Car("Ford Mondeo", "black");
        System.out.println(ford);
        System.out.println(ford.getBrand());
        //ford.getBrand("VW Polo");
        //System.out.println(ford.brand);
        ford.setColor("white");
        System.out.println(ford);

        pl.sda.livecoding.encapsulation.factory.Car fordFromFactory = new pl.sda.livecoding.encapsulation.factory.Car(122, 5);
        System.out.println(fordFromFactory);
    }
}
