package pl.sda.tasks.weekend3.exceptions;

/**
 * Napisz klasę Account, która będzie zawierać metodę: withdraw() w celu podjęcia środków.
 * Metoda powinna obsługiwać przypadek niedostatecznej ilości środków na koncie za pomocą wyjątku.
 */
public class Account {

    private double accountBalance = 10000.00;

    public double withdraw(double value) {
        if (value > accountBalance) {
            throw new AccountBalanceException();
        }
        accountBalance -= value;
        return value;
    }

}
