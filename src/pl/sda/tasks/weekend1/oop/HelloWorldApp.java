package pl.sda.tasks.weekend1.oop;

// W klasie HelloWorldApp utwórz nowy obiekt na podstawie klasy Car, np.
// Car toyota = new Car("Toyota", "black");
//
// Wypisz na konsoli informację o samochodzie
//  System.out.println("My car is: " + toyota);
// Uruchom program
// {w klasie}(Alt + Shift + F10 lub PPM → Run Car.main())
public class HelloWorldApp {
    public static void main(String[] args) {
        Car toyota = new Car("Toyota", "black");
        System.out.println("My car is: " + toyota);
    }
}
