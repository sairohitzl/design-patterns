package factory;

public class SmartPhone implements Phone{
    @Override
    public void communicate() {
        System.out.println("Communicates via vo-ip,network messages, wifi etc");
    }
}
