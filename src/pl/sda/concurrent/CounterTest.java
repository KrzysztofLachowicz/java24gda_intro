package pl.sda.concurrent;

public class CounterTest {
    public static void main(String[] args) {
        CounterRunnable counterRunnable = new CounterRunnable();

        new Thread(counterRunnable).start();
        new Thread(counterRunnable).start();
        new Thread(counterRunnable).start();
        new Thread(counterRunnable).start();
        new Thread(counterRunnable).start();
        new Thread(counterRunnable).start();
        new Thread(counterRunnable).start();
        new Thread(counterRunnable).start();
    }
}
