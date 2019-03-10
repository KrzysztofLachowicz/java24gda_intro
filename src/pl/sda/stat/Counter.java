package pl.sda.stat;

public class Counter {
    public final static String CLASS_NAME = "Counter";
    private static long counter = 0;

    public static long get() {
        return ++counter;
    }
}
