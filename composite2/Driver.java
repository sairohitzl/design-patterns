package composite2;

public class Driver {
    public static void main(String[] args) {
        Letter letter1 = new Letter('c',10,false);
        Letter letter2 = new Letter('a',10,false);
        Letter letter3 = new Letter('s',10,false);
        Letter letter4 = new Letter('h',10,false);

        Word word1 = new Word();
        word1.addLetter(letter1);
        word1.addLetter(letter2);
        word1.addLetter(letter3);
        word1.addLetter(letter4);

        //System.out.println(word1.getWordFromLetters());

        Word word2 = new Word();
        word2.addLetter(new Letter('i',10,false));
        word2.addLetter(new Letter('s',10,false));



        Word word3 = new Word("digitized");
//        word3.addLetter(new Letter('d',10,false));
//        word3.addLetter(new Letter('i',10,false));
//        word3.addLetter(new Letter('g',10,false));
//        word3.addLetter(new Letter('i',10,false));
//        word3.addLetter(new Letter('t',10,false));
//        word3.addLetter(new Letter('i',10,false));
//        word3.addLetter(new Letter('z',10,false));
//        word3.addLetter(new Letter('e',10,false));
//        word3.addLetter(new Letter('d',10,false));
        Sentence sentence =  new Sentence();

        sentence.addWord(word1);
        sentence.addWord(word2);
        sentence.addWord(word3);

        sentence.getSentence();




    }
}
