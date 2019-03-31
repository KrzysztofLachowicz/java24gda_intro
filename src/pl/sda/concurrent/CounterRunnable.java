package pl.sda.concurrent;

public class CounterRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());

        System.out.println("Counter value -> " + Counter.getAndIncrement());
    }
}
