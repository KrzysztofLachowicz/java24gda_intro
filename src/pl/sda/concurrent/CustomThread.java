package pl.sda.concurrent;

public class CustomThread extends Thread {
    public CustomThread() {}

    public CustomThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
