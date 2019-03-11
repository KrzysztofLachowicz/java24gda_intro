package pl.sda.tasks.weekend2.enums;

/**
 * 1. Utwórz enum Currency, który ma reprezentować walutę. Ograniczmy się do 5 walut: polski złoty, dolar, euro, jen, funt brytyjski.
 *
 *  3. Do enum Currency dodaj pole oznaczające symbol waluty: "PLN", "USD" itp.
 */
public enum Currency {
    PLN("PLN", 1), USD("USD", 3.79), EUR("EUR", 4.33), JPY("JPY", 0.034), GBP("GBP", 4.86);

    private String symbol;
    private double exchangeRate;

    Currency(String symbol, double exchangeRate) {
        this.symbol = symbol;
        this.exchangeRate = exchangeRate;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    //PLN -> EUR/GBP itp
    public double exchangeFromPln(double value) {
        return (1 / getExchangeRate()) * value;
    }

    //EUR/GBP itp -> PLN
    public double exchangeToPln(double value) {
        return getExchangeRate() * value;
    }
}