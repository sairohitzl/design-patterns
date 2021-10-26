package builder;

public class Pc implements  PcPlan{

    private String ram;
    private String WifiAdapterVersion;
    private String ProcessorVersion;
    private String Gpu;

    @Override
    public void setRam(String ram) {
        this.ram=ram;
    }

    @Override
    public void setWifiAdapter(String WifiAdapterVersion) {
        this.WifiAdapterVersion=WifiAdapterVersion;
    }

    @Override
    public void setProcessor(String ProcessorVersion) {
        this.ProcessorVersion=ProcessorVersion;
    }

    @Override
    public void setGpu(String Gpu) {
        this.Gpu=Gpu;
    }

    @Override
    public String toString() {
        return "Pc{ " +
                "ram='" + ram + '\'' +
                "\n WifiAdapterVersion='" + WifiAdapterVersion + '\'' +
                "\n ProcessorVersion='" + ProcessorVersion + '\'' +
                "\n Gpu=' " + Gpu + '\'' +
                '}';
    }
}
