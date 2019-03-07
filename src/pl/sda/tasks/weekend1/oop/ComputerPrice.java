package pl.sda.tasks.weekend1.oop;

/*
    Przenieś kod zapisany w metodach main() klas FahrenheitConverter i ComputerPrice do osobnych metod,
    np.: convertToCelsius(double temperatureInFahrenheit), getComputerPrice()

    W klasie ComputerPrice wydziel metody getComputerPrice(), getMonitorPrice() i getComputerAndMonitorPrice(),
    ostatnia z metod ma korzystać z dwóch pierwszych. Zmienną VAT ustaw jako pole klasy ComputerPrice.
 */
public class ComputerPrice {
    private final double VAT = 1.23;

    private double mainBoardPrice;
    private double processorPrice;
    private double ramPrice;
    private double hardDrivePrice;
    private double monitorPrice;

    public ComputerPrice(double mainBoardPrice, double processorPrice,
                         double ramPrice, double hardDrivePrice, double monitorPrice) {
        this.mainBoardPrice = mainBoardPrice;
        this.processorPrice = processorPrice;
        this.ramPrice = ramPrice;
        this.hardDrivePrice = hardDrivePrice;
        this.monitorPrice = monitorPrice;
    }

    public static void main(String[] args) {
        ComputerPrice computerPrice = new ComputerPrice(530.5, 405,
                122, 145, 811);

        System.out.println("Computer price (VAT) = " + computerPrice.getComputerPrice());
        System.out.println("Monitor price (VAT) = " + computerPrice.getMonitorPrice());
        System.out.println("Computer with monitor price (VAT) = " + computerPrice.getComputerAndMonitorPrice());
    }

    public double getComputerAndMonitorPrice() {
        return getComputerPrice() + getMonitorPrice();
    }

    public double getComputerPrice() {
        return (mainBoardPrice + processorPrice + ramPrice + hardDrivePrice) * VAT;
    }

    public double getMonitorPrice() {
        return monitorPrice * VAT;
    }
}