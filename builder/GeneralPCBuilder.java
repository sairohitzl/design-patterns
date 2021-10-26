package builder;

public class GeneralPCBuilder implements  PcBuilder{

    private Pc pc;

    public GeneralPCBuilder()
    {
        pc=new Pc();
    }

    @Override
    public void insertRam() {
        pc.setRam("4b corsair ram installed");
    }

    @Override
    public void configureWifiAdapter() {
        pc.setWifiAdapter("w-lan card inserted and wireless drivers installed");
    }

    @Override
    public void insertProcessor() {
        pc.setProcessor("Intel pentium processor 1.1 Ghz configured to pc");
    }

    @Override
    public void insertGpu() {
        pc.setGpu("Intel integrated graphics 220, 768mb memory installed");
    }

    @Override
    public Pc getPc() {
        return this.pc;
    }
}
