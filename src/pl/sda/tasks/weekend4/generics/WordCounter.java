package pl.sda.tasks.weekend4.generics;

import java.util.HashMap;
import java.util.Map;

/**
 * 5. Stwórz klasę, która będzie zawierała mapę gdzie klucz = String, a wartość = Integer. Klasa powinna mieć metody: addWord() i getWordCount() -
 * które dodadzą słowo i zwrócą ilość wcześniej dodanych słów lub zero jeżeli słowo nie występuje.
 */
public class WordCounter {
    private Map<String, Integer> wordsCount = new HashMap<>();

    public void addWord(String word) {
        if(wordsCount.containsKey(word)) {
            Integer count = wordsCount.get(word);
            wordsCount.put(word, ++count);
        } else {
            wordsCount.put(word, 1);
        }
    }

    public int getWordCount(String word) {
        return wordsCount.getOrDefault(word, 0);
    }
}
