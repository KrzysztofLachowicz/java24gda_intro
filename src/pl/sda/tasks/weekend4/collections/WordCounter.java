package pl.sda.tasks.weekend4.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordCounter {
    private Map<Character, Set<String>> wordsMap = new HashMap<>();

    public void addWord(String word) {
        if (word == null || word.length() == 0) {
            return;
        }

        word = word.toLowerCase();
        char firstChar = word.charAt(0);
        if (wordsMap.containsKey(firstChar)) {
            Set<String> words = wordsMap.get(firstChar);
            words.add(word);
        } else {
            Set<String> words = new HashSet<>();
            words.add(word);
            wordsMap.put(firstChar, words);
        }
    }

    public Set<String> getWordsByFirstCharacter(Character firstChar) {
        return wordsMap.getOrDefault(firstChar, new HashSet<>());
    }

    public int getWordsByFirstCharacterSize(Character firstChar) {
        Set<String> wordsByFirstCharacter = getWordsByFirstCharacter(firstChar);
        return wordsByFirstCharacter.size();
    }
}
