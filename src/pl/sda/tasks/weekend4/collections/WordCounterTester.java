package pl.sda.tasks.weekend4.collections;

public class WordCounterTester {
    public static void main(String[] args) {
        WordCounter wordCounter = new WordCounter();
        wordCounter.addWord("green");
        wordCounter.addWord("blue");
        wordCounter.addWord("red");
        wordCounter.addWord("Blue");
        wordCounter.addWord("gray");
        wordCounter.addWord("black");
        wordCounter.addWord("bronze");

        System.out.println("words on 'r' = " + wordCounter.getWordsByFirstCharacter('r'));
        System.out.println("words on 'b' = " + wordCounter.getWordsByFirstCharacter('b'));
        System.out.println("words on 'z' = " + wordCounter.getWordsByFirstCharacter('z'));
        System.out.println("words count on 'b' = " + wordCounter.getWordsByFirstCharacterSize('b'));
        System.out.println("words count on 'y' = " + wordCounter.getWordsByFirstCharacterSize('y'));
    }
}
