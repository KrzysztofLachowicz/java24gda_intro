package pl.sda.tasks.weekend4.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * 4. Napisz klasę Counter, która zwiększać będzie swój licznik przy każdym wykonaniu metody increase().
 * Do klasy dodaj również metodę get(), która zwróci aktualny stan licznika.
 * Napisz klasę CounterRunnable implementującą interfejs Runnable, dla której konstruktor jako argument przyjmować będzie instancję klasy Counter,
 * a metoda run() wywoła metody increase() oraz get() i wyświetli na konsoli rezultat. Uruchom pulę wątków i obserwuj jakie otrzymujesz wartości.
 * Przetestuj działanie dla różnej puli wątków. Czy rezultaty są takie jak oczekiwane przez Ciebie?
 */
public class CounterRunnable implements Runnable {
    private Counter counter;

    public CounterRunnable(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        counter.increase();
        System.out.println("Counter value >>> " + counter.get());
    }

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 1; i <= 100; i++) {
            executorService.execute(new CounterRunnable(counter));
        }
        executorService.shutdown();
        executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
    }
}
