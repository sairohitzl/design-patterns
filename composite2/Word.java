package composite2;

import java.util.ArrayList;
import java.util.List;

public class Word {

    private String wordName;

    private List<Letter> letters = new ArrayList<>();

    public Word(){}

    public Word(String word){
        wordName = word;
    }

    public void addLetter(Letter c){
        letters.add(c);
    }

    public void deleteLetter(Letter c){
        letters.remove(c);
    }

    public String getWordFromLetters(){
        StringBuilder sb = new StringBuilder();
        for(Letter letter:letters){
            sb.append(letter.getLetterCharacter());
        }
        return sb.toString();
    }

    public String getWordName() {
        return wordName;
    }
}
