package pl.sda.tasks.weekend4.generics;

import java.time.temporal.Temporal;

/**
 * 6.Ogranicz możliwość podania dowolnego typu obiektów dla klasy z pkt. 4.
 */
public class PairWithBounds<T extends Number, S extends Temporal> {
    private T first;
    private S second;

    public PairWithBounds(T first, S second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "PairWithBounds{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
