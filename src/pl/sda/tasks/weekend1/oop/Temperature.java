package pl.sda.tasks.weekend1.oop;

/*
    Utwórz nową klasę Temperature, która będzie posiadała pola: double temperature, String date, String hour.
    Klasa określa temperaturę w skali Celsjusza w konkretnym dniu i o konkretnej godzinie.
    Dodaj konstruktor inicjalizujący wszystkie trzy pola,
    metody-gettery dla każdego pola + dodaj metodę show() która będzie zwracała napis w postaci:
        {date} {hour} - {temperature} °C, np: 2018-10-01 10:45 - 13 °C

    Dodaj do klasy Temperature metodę showInFahrenheit() która zwróci taki sam napis jak wyżej tylko w skali Fahrenheit.
    Do konwersji temperatur użyj klasy FahrenheitConverter.
 */
public class Temperature {
    private double temperature;
    private String date;
    private String hour;
    private FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();

    public Temperature(double temperature, String date, String hour) {
        this.temperature = temperature;
        this.date = date;
        this.hour = hour;
    }

    public double getTemperature() {
        return temperature;
    }

    public String getDate() {
        return date;
    }

    public String getHour() {
        return hour;
    }

    public void show() {
        System.out.println(date + " " + hour + " - " + temperature + " \u00b0C");
    }

    public void showInFahrenheit() {
        double celciusToFarenheit = fahrenheitConverter.convertToFahrenheit(temperature);
        System.out.println(date + " " + hour + " - " + celciusToFarenheit + " \u00b0F");
    }
}
