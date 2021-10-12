package factory;

public class SatellitePhone implements Phone{
    @Override
    public void communicate() {
        System.out.println("voice communication via satellite link.");
    }
}
