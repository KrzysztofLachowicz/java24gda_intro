package pl.sda.tasks.weekend3.collections;

import java.nio.charset.Charset;
import java.util.*;

/**
 * 7. Napisz program, który porówna wydajność działania operacji na kolekcjach typu ArrayList, LinkedList, HashSet, TreeSet oraz HashMap, TreeMap.
 */
public class CollectionsPerformance {
    private static int NUM_OF_OBJECTS = 1000000;
    private static int LENGTH_OF_STRING = 10;

    public static void main(String[] args) {
        CollectionsPerformance performance = new CollectionsPerformance();

        List<String> arrayList = new ArrayList<>();
        performance.invokeAddAction(arrayList);
        performance.invokeGetAction(arrayList);

        List<String> linkedList = new LinkedList<>();
        performance.invokeAddAction(linkedList);
        performance.invokeGetAction(linkedList);

        Set<String> hashSet = new HashSet<>();
        performance.invokeAddAction(hashSet);
        performance.invokeGetAction(hashSet);

        Set<String> treeSet = new TreeSet<>();
        performance.invokeAddAction(treeSet);
        performance.invokeGetAction(treeSet);

        Map<String, String> hashMap = new HashMap<>();
        performance.invokeAddAction(hashMap);
        performance.invokeGetAction(hashMap);

        Map<String, String> treeMap = new TreeMap<>();
        performance.invokeAddAction(treeMap);
        performance.invokeGetAction(treeMap);
    }

    public void invokeAddAction(Collection<String> collection) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < NUM_OF_OBJECTS; i++) {
            collection.add(getRandomString());
        }
        System.out.println("Time for action -> ADD for collection " + collection.getClass() + ": " + (System.currentTimeMillis() - start) + "ms");
    }

    public void invokeAddAction(Map<String, String> map) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < NUM_OF_OBJECTS; i++) {
            String s = getRandomString();
            map.put(s, s);
        }
        System.out.println("Time for action -> ADD for map " + map.getClass() + ": " + (System.currentTimeMillis() - start) + "ms");
    }

    public void invokeGetAction(Collection<String> collection) {
        long start = System.currentTimeMillis();
        for (String s : collection) {
            // empty - we want to just iterate over collection
        }
        System.out.println("Time for action -> GET for collection " + collection.getClass() + ": " + (System.currentTimeMillis() - start) + "ms");
    }

    public void invokeGetAction(Map<String, String> map) {
        long start = System.currentTimeMillis();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            // empty - we want to just iterate over collection
        }
        System.out.println("Time for action -> GET for collection " + map.getClass() + ": " + (System.currentTimeMillis() - start) + "ms");
    }

    private String getRandomString() {
        byte[] array = new byte[LENGTH_OF_STRING];
        new Random().nextBytes(array);
        return new String(array, Charset.forName("UTF-8"));
    }
}
