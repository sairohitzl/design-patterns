package composite2;

import java.util.ArrayList;
import java.util.List;

public class Sentence {

    private String sentenceContent;

    private List<Word> words = new ArrayList<>();

    public Sentence() {
    }

    public Sentence(String sentence) {
        sentenceContent = sentence;
    }

    public void addWord(Word word) {
        words.add(word);
    }

    public void deleteWord(Word word) {
        words.remove(word);
    }

    public void getSentence() {

        for (Word word : words) {
            if (word.getWordFromLetters().isEmpty()) {
                System.out.print(word.getWordName() + " ");

            }
            else
            {
                System.out.print(word.getWordFromLetters() + " ");


            }

        }

    }
}
