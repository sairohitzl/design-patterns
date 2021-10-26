package builder;

public class Builder {
    public static void main(String[] args) {
        PcBuilder pcBuilder1 = new GamingPCBuilder();
        HardwareEngineer hardwareEngineer1 = new HardwareEngineer(pcBuilder1);

        hardwareEngineer1.buildPC();
        Pc pc = hardwareEngineer1.getPc();
        System.out.println(pc);
        System.out.println("Pc built. ");

    }
}
