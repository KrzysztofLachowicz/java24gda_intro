package pl.sda.concurrent;

public class Counter {

    private static long value = 1;

    public static long getAndIncrement() {
        return value++;
    }

}
