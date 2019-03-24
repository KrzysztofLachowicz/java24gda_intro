package pl.sda.tasks.weekend3.exceptions;

public class AccountBalanceException extends RuntimeException {
    public AccountBalanceException() {
        super("You don't have enough money on your account!");
    }
}
