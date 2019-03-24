package pl.sda.tasks.weekend3.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 2. Napisz metodę, która porówna ze sobą dwie kolekcje i wyświetli rezultat na konsoli.
 */
public class CompareCollections {
    public static void main(String[] args) {
        List<String> fruitsFirstCollection = new ArrayList<>();
        fruitsFirstCollection.add("apple");
        fruitsFirstCollection.add("pear");
        fruitsFirstCollection.add("orange");
        fruitsFirstCollection.add("banana");

        List<String> fruitsSecondCollection = new ArrayList<>();
        fruitsSecondCollection.add("apple");
        fruitsSecondCollection.add("strawberry");
        fruitsSecondCollection.add("orange");
        fruitsSecondCollection.add("watermelon");
        fruitsSecondCollection.add("grapes");
        fruitsSecondCollection.add("coconut");

        CompareCollections compareCollections = new CompareCollections();
        List<String> commons = compareCollections.compareCollections(fruitsFirstCollection, fruitsSecondCollection);

        System.out.println("Common elements in both collections: " + commons);
    }

    public List<String> compareCollections(Collection<String> col1, Collection<String> col2) {
        List<String> commons = new ArrayList<>();
        for (String element : col1) {
            if (col2.contains(element)) {
                commons.add(element);
            }
        }
        return commons;
    }
}
