package pl.sda.tasks.weekend1.oop;

public class TemperatureTest {
    public static void main(String[] args) {
        Temperature temperature = new Temperature(13, "2018-10-01", "10:45");
        temperature.show();
        temperature.showInFahrenheit();
    }
}
