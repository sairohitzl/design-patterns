package builder;

public class GamingPCBuilder implements  PcBuilder{

    private Pc pc;

    public GamingPCBuilder()
    {
        pc=new Pc();
    }

    @Override
    public void insertRam() {
        pc.setRam("2* 4gb corsair ram(s) installed");
    }

    @Override
    public void configureWifiAdapter() {
        pc.setWifiAdapter("w-lan v5.04 card inserted and wireless drivers installed");
    }

    @Override
    public void insertProcessor() {
        pc.setProcessor("Intel i7 3.2 Ghz 8 cores ,configured to pc");
    }

    @Override
    public void insertGpu() {
        pc.setGpu("Nvidia graphics , 4gb memory installed");
    }

    @Override
    public Pc getPc() {
        return this.pc;
    }
}
