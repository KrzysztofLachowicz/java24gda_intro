package pl.sda.generics.exercises;

import java.util.List;

public class NumbersBox<T extends Number> {
    private List<T> items;

    public NumbersBox(List<T> items) {
        this.items = items;
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public T getFirstElement() {
        if(isEmpty()) {
           return null;
        }
        return items.get(0);
    }

    public T getLastElement() {
        if(isEmpty()) {
           return null;
        }
        return items.get(items.size() - 1);
    }

    public int getFirstElementAsInt() {
        T firstElement = getFirstElement();
        if(firstElement == null) {
            return 0;
        }
        return firstElement.intValue();
    }

    public int getLastElementAsInt() {
        T lastElement = getLastElement();
        if(lastElement == null) {
            return 0;
        }
        return lastElement.intValue();
    }
}