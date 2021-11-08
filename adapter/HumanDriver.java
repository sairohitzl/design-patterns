package adapter;

public class HumanDriver implements CarDriver{


    @Override
    public void movesForward() {
        System.out.println("accelerates the car using pedals");
    }

    @Override
    public void appliesBrakes() {
        System.out.println("hits the brakes when something or someone is ahead");
    }

    @Override
    public void shiftsTransmission() {
        System.out.println("changes gears to match the rev");
    }

    @Override
    public void assignDriver(String driver) {
        System.out.println("Driver name is: "+driver);
    }


}
