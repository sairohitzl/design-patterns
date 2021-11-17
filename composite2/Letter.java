package composite2;

public class Letter {

   private char letterCharacter;
   private int fontSize;
   private boolean capitalized;

    public Letter(char l,int fs,boolean cap){
        letterCharacter = l;
        fontSize=fs;
        capitalized=cap;
    }

    public void PrintLetter(){
        System.out.print(letterCharacter);
    }
    public void letterDetails(){
        System.out.println("character: '"+letterCharacter+"' "+"font-size: "+fontSize);

    }

    public char getLetterCharacter() {
        return letterCharacter;
    }
}
