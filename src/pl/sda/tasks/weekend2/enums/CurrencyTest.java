package pl.sda.tasks.weekend2.enums;

/**
 * 5. Do enum Currency dodaj pole oznaczające kurs waluty (w stosunku do polskiego złotego)
 * oraz metodę która wyliczy wartość podanej kwoty w obcej walucie (np.: 100 zł -> 30 euro)
 *
 * 6. Zadbaj by można było na bazie reprezentacji tekstowej ("PLN" itp) znaleźć odpowiednią wartość enum Currency
 */
public class CurrencyTest {
    public static void main(String[] args) {
        exchange(100, Currency.EUR);
        exchange(15.5, Currency.EUR);
        exchange(2_000_000.99, Currency.GBP);
        exchange(1999.99, Currency.JPY);

        System.out.println("Currency.valueOf(\"JPY\") = " + Currency.valueOf("JPY"));
    }

    private static void exchange(double valueInPln, Currency currency) {
        double exchanged = currency.exchangeFromPln(valueInPln);
        System.out.printf("%,13.2f %s = %,13.2f %s%n", valueInPln, Currency.PLN.getSymbol(), exchanged, currency.getSymbol());
    }
}
