package pl.sda.exceptions;

public class NumberIsGreaterThan100Exception extends RuntimeException {
    public NumberIsGreaterThan100Exception(String message) {
        super(message);
    }
}
