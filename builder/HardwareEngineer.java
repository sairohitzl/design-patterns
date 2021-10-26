package builder;

public class HardwareEngineer {

    private PcBuilder pcBuilder;

    public HardwareEngineer(){}

    public HardwareEngineer(PcBuilder pcBuilder)
    {
        this.pcBuilder=pcBuilder;
    }

    public Pc getPc()
    {
        return this.pcBuilder.getPc();
    }

    public void buildPC()
    {
        this.pcBuilder.insertRam();
        this.pcBuilder.configureWifiAdapter();
        this.pcBuilder.insertGpu();
        this.pcBuilder.insertProcessor();
    }
}
