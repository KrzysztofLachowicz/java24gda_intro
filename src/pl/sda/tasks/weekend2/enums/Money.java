package pl.sda.tasks.weekend2.enums;

/**
 * 7. Stwórz klasę Money zawierającą dwa pola: currency i value.
 * Nadpisz metodę do tworzenia wartości tekstowej (toString()) tak żeby wyświetlała wartość z symbolem waluty, np. 40 EURO.
 * Dodaj metodę exchange(Currency currency), która zwróci nowy obiekt Money w nowej walucie dla aktualnej wartości.
 */
public class Money {
    private Currency currency;
    private double value;

    public Money(Currency currency, double value) {
        this.currency = currency;
        this.value = value;
    }

    public Currency getCurrency() {
        return currency;
    }

    public double getValue() {
        return value;
    }

    public Money exchange(Currency currency) {
        double valueInPln = this.currency.exchangeToPln(value);
        double exchangedValue = currency.exchangeFromPln(valueInPln);

        return new Money(currency, exchangedValue);
    }

    @Override
    public String toString() {
        return String.format("%.2f %s", value, currency);
    }
}
