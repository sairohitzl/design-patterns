package adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        CarDriver carDriver = new HumanDriver();
        AutonomousVehicle autonomousBot = new AutonomousVehicle();

        AutonomousVehicleAdapter ava = new AutonomousVehicleAdapter(autonomousBot);

        System.out.println("Autonomous vehicle is stating..");

        autonomousBot.engineInCharge("eren");
        autonomousBot.autoAccel();
        autonomousBot.stops();
        autonomousBot.autoRevMatching();
        System.out.println("******************************************** \n");
        System.out.println("Human Driving..");

        carDriver.assignDriver("eren");
        carDriver.appliesBrakes();
        carDriver.movesForward();
        carDriver.shiftsTransmission();

        System.out.println("******************************************** \n");

        System.out.println("Autonomous vehicle with adapter");

        ava.assignDriver("pixis");
        ava.appliesBrakes();
        ava.movesForward();
        ava.shiftsTransmission();



    }
}
