package pl.sda.tasks.weekend4.concurrent;

public class Counter {
    private long count = 0;

    public void increase() {
        count++;
    }

    public long get() {
        return count;
    }
}
