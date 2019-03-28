package pl.sda.tasks.weekend4.generics;

public class WordCounterTest {
    public static void main(String[] args) {
        WordCounter wordCounter = new WordCounter();
        wordCounter.addWord("alpha");
        wordCounter.addWord("teta");
        wordCounter.addWord("fi");
        wordCounter.addWord("alpha");
        wordCounter.addWord("fi");

        System.out.println("wordCounter.getWordCount('fi') = " + wordCounter.getWordCount("fi"));
        System.out.println("wordCounter.getWordCount('teta') = " + wordCounter.getWordCount("teta"));
        System.out.println("wordCounter.getWordCount('zet') = " + wordCounter.getWordCount("zet"));
    }
}
