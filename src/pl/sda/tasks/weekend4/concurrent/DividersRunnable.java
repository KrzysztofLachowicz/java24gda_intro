package pl.sda.tasks.weekend4.concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * 3. Napisz klasę implementującą interfejs Runnable.
 * Klasa powinna wykonywać w metodzie run() kod, którego wynikiem będzie lista wszystkich całkowitych dzielników podanej liczby naturalnej.
 * Uruchom klasę z wykorzystaniem ExecutorService i przetestuj jej działanie. Sprawdź czas wykonania swojego kodu.
 */
public class DividersRunnable implements Runnable {
    private static long MAX_NUMBER = 10000;

    private int num;

    public DividersRunnable(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        List<Integer> dividers = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                dividers.add(i);
            }
        }
//        System.out.println("Dividers for " + num + " >>> " + dividers);
    }

    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();

        ExecutorService executorService = Executors.newFixedThreadPool(8);
        for (int i = 1; i <= MAX_NUMBER; i++) {
            executorService.execute(new DividersRunnable(i));
        }
        executorService.shutdown();
        executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);

        long end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start) + "ms");

        // standard way - without threads - to compare results
        start = System.currentTimeMillis();
        for (int i = 1; i <= MAX_NUMBER; i++) {
            new DividersRunnable(i).run();
        }
        end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start) + "ms");
    }
}
