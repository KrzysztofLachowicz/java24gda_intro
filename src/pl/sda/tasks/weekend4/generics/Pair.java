package pl.sda.tasks.weekend4.generics;

/**
 * 4. Utwórz klasę, która pozwoli ustawić parę obiektów różnego typu. Sygnatura klasy powinna zawierać dwa generyki,
 * a następnie konstruktor pozwalający zainicjalizować obiekt klasy z dwoma instancjami obiektów.
 */
public class Pair<T, S> {
    private T first;
    private S second;

    public Pair(T first, S second) {
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
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
