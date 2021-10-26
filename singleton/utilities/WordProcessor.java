package singleton.utilities;

public class WordProcessor extends Application{

    public WordProcessor() {
    }

    public WordProcessor(int space)
    {
        this.setSpaceRequired(space);
    }

    @Override
    public void execute() {
        System.out.println("runs ms word/libre office");
    }

}
