package adapter;

public class AutonomousVehicleAdapter  implements CarDriver{

    AutonomousVehicle autonomousVehicle;
    public AutonomousVehicleAdapter(AutonomousVehicle autonomousVehicle){
        this.autonomousVehicle = autonomousVehicle;
    }

    @Override
    public void movesForward() {
        autonomousVehicle.autoAccel();
    }

    @Override
    public void appliesBrakes() {
        autonomousVehicle.stops();
    }

    @Override
    public void shiftsTransmission() {
        autonomousVehicle.autoRevMatching();
    }

    @Override
    public void assignDriver(String driver) {
        autonomousVehicle.engineInCharge(driver);
    }
}
