package pl.sda.tasks.weekend1.datatypes;

/*
    W osobnej klasie FahrenheitConverter, w metodzie main() napisz program przekształcający dane o temperaturze podanej w skali Fahrenheit do skali Celsjusza.
    Dane wejściowe (temperatura w skali Fahrenheit) podać w inicjacji odpowiedniej zmiennej w programie.
    Sprawdź czy program poprawnie oblicza temperatury dla danych: 32 °F = 0 °C; 212 °F = 100 °C
 */
public class FahrenheitConverter {
    public static void main(String[] args) {
        double fahrenheitTemperature = 32;
        double celsiusTemperature = 5/9.0  * (fahrenheitTemperature - 32);
        System.out.println(fahrenheitTemperature + " °F = " + celsiusTemperature + " °C");

        fahrenheitTemperature = 212;
        celsiusTemperature = 5/9.0  * (fahrenheitTemperature - 32);
        System.out.println(fahrenheitTemperature + " °F = " + celsiusTemperature + " °C");
    }
}
