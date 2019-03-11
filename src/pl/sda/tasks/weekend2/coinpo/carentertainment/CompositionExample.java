package pl.sda.tasks.weekend2.coinpo.carentertainment;

/**
 * Rozwiń przykład kompozycji w oparciu o klasę Car - dodaj klasę Entertainment,
 * która zarządzać będzie systemem rozrywki w Twoim samochodzie, a następnie zadbaj o to,
 * by tworząc obiekt typu Car konieczne było podanie obiektu typu Entertainment.
 * Klasa Car powinna wykorzystywać metody dostępne w klasie Entertainment.
 */
public class CompositionExample {
    public static void main(String[] args) {
        Engine engine = new Engine(2000, EngineType.PETROL);
        Entertainment entertainment = new Entertainment(10, true);

        Car car = new Car("Toyota", engine, entertainment);
        System.out.println(car);
        System.out.println("Car is: " + car.getType());
        System.out.println("Is smth playing? " + car.isPlaying());

        car.enable(EntertainmentType.RADIO);
        System.out.println("Is smth playing? " + car.isPlaying());

        car.volumeUp();
        System.out.println("Volume = " + car.getVolume());
    }
}
