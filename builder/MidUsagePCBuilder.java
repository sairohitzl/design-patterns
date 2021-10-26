package builder;

public class MidUsagePCBuilder implements  PcBuilder{

    private Pc pc;

    public MidUsagePCBuilder()
    {
        pc=new Pc();
    }

    @Override
    public void insertRam() {
        pc.setRam("4b + 1gb corsair ram installed");
    }

    @Override
    public void configureWifiAdapter() {
        pc.setWifiAdapter("w-lan v2.00 card inserted and wireless drivers installed");
    }

    @Override
    public void insertProcessor() {
        pc.setProcessor("Intel i3 1.2 Ghz 2 cores ,configured to pc");
    }

    @Override
    public void insertGpu() {
        pc.setGpu("Intel integrated graphics 235 , 1gb memory installed");
    }

    @Override
    public Pc getPc() {
        return this.pc;
    }
}
