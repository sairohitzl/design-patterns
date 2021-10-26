package builder;

public interface PcBuilder {
    void insertRam();
    void configureWifiAdapter();
    void insertProcessor();
    void insertGpu();

    public Pc getPc();
}
