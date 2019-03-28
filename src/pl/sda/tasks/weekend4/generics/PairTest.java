package pl.sda.tasks.weekend4.generics;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class PairTest {
    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>(10, "ten");
        Pair<Double, LocalDate> pair2 = new Pair<>(5.5, LocalDate.now());

        System.out.println("pair1 = " + pair1);
        System.out.println("pair2 = " + pair2);

        PairWithBounds<Short, Instant> pair3 = new PairWithBounds<>((short) 4, Instant.EPOCH);
        PairWithBounds<Long, LocalDateTime> pair4 = new PairWithBounds<>(4L, LocalDateTime.MAX);

        System.out.println("pair3 = " + pair3);
        System.out.println("pair4 = " + pair4);
    }
}
