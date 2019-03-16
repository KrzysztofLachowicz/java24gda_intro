package pl.sda.collections;

import java.util.*;

public class LiveCoding {
    public static void main(String[] args) {
        Map<String, String> vocabulary = new TreeMap<>();
        //dodaj
        vocabulary.put("pies", "dog");
        vocabulary.put("kot", "cat");
        vocabulary.put("kot", "cat2");
        vocabulary.put("lew", "lion");
        vocabulary.put("wąż", "snake");
        vocabulary.put("anakonda", "anaconda");

        //sprawdź
        System.out.println("contains dog: " + vocabulary.containsValue("dog"));
        System.out.println("contains snake: " + vocabulary.containsValue("snake"));
        System.out.println("contains lew: " + vocabulary.containsKey("lew"));
        System.out.println("contains snake: " + vocabulary.containsKey("snake"));

        //pobierz pojedynczy element
        String dogInEnglish = vocabulary.get("pies");
        System.out.println("dogInEnglish = " + dogInEnglish);
        String snakeInEnglish = vocabulary.get("wąż");
        System.out.println("snakeInEnglish = " + snakeInEnglish);
        snakeInEnglish = vocabulary.getOrDefault("wąż", "snake");
        System.out.println("snakeInEnglish = " + snakeInEnglish);

        //usuń
        String removed = vocabulary.remove("wąż");
        System.out.println("removed = " + removed);
        System.out.println("after removed = " + vocabulary.get("wąż"));

        //rozmiar
        System.out.println("vocabulary size= " + vocabulary.size());

        //iteracja po elementach
        Set<String> keys = vocabulary.keySet();
        for (String key : keys) {
            String value = vocabulary.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
