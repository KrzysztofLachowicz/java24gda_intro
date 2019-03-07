package pl.sda.tasks.weekend1.oop;

/*
    Przenieś kod zapisany w metodach main() klas FahrenheitConverter i ComputerPrice do osobnych metod,
    np.: convertToCelsius(double temperatureInFahrenheit), getComputerPrice()

    W klasie FahrenheitConverter dodaj metodę, która konwertuje temperatury w drugą stronę (Celsjusz → Fahrenheit)
 */
public class FahrenheitConverter {
    public static void main(String[] args) {
        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();

        // Celcius -> Fahrenheit
        double fahrenheitTemperature = 32;
        double celsiusTemperature = fahrenheitConverter.convertToCelsius(fahrenheitTemperature);
        System.out.println(fahrenheitTemperature + " \u00b0F = " + celsiusTemperature + " \u00b0C");

        fahrenheitTemperature = 212;
        celsiusTemperature = fahrenheitConverter.convertToCelsius(fahrenheitTemperature);
        System.out.println(fahrenheitTemperature + " \u00b0F = " + celsiusTemperature + " \u00b0C");

        // Fahrenheit -> Celcius
        celsiusTemperature = 0;
        fahrenheitTemperature = fahrenheitConverter.convertToFahrenheit(celsiusTemperature);
        System.out.println(celsiusTemperature + " \u00b0C = " + fahrenheitTemperature + " \u00b0F");

        celsiusTemperature = 100;
        fahrenheitTemperature = fahrenheitConverter.convertToFahrenheit(celsiusTemperature);
        System.out.println(celsiusTemperature + " \u00b0C = " + fahrenheitTemperature + " \u00b0F");
    }

    public double convertToCelsius(double temperatureInFahrenheit) {
        return 5 / 9.0 * (temperatureInFahrenheit - 32);
    }

    public double convertToFahrenheit(double temperatureInCelsius) {
        return 9.0 / 5 * temperatureInCelsius + 32;
    }

}
