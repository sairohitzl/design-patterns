package singleton.utilities;

public abstract class Application {

    int SpaceRequired;

    public void execute()
    {
        System.out.println("Runs");
    }

    public int getSpaceRequired() {
        return SpaceRequired;
    }

    public void setSpaceRequired(int spaceRequired) {
        SpaceRequired = spaceRequired;
    }

    @Override
    public String toString() {
        return "Application{}: "+this.getClass().getName();
    }
}
