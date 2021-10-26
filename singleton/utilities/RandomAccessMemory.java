package singleton.utilities;

public class RandomAccessMemory {

    private static RandomAccessMemory ramInstance;

    static private final int memory = 2048;

    public RandomAccessMemory(){}

    synchronized public static RandomAccessMemory getInstance()
    {
        if(ramInstance == null)
        {
            ramInstance = new RandomAccessMemory();
        }

        return ramInstance;
    }

    public void allocateSpace(Application application)
    {

        if(application.getSpaceRequired() > memory)
        {
            System.out.println("Enough space not available");
        }

        else{
            System.out.println("Allocating memory");
            application.execute();
            System.out.println("status: ok! \n");
        }

    }

}
