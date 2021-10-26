package singleton.utilities;

public class Gaming extends Application{

    public Gaming() {
    }

    public Gaming(int space)
    {
        this.setSpaceRequired(space);
    }

    @Override
    public void execute() {
        System.out.println("runs gaming engine");
    }

}
