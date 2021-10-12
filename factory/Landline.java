package factory;

public class Landline implements Phone{
    @Override
    public void communicate(){
        System.out.println("communicates via under-ground wire.");
    }
}
