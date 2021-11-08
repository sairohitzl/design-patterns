package adapter;

import java.util.Random;

public class AutonomousVehicle {
    Random generator = new Random();
    public void autoAccel(){
        int accelSpeed = generator.nextInt(10)+1;
        System.out.println("automatically accelerates with speed: "+accelSpeed+"mph");
    }
    public void stops(){
        float seconds = generator.nextFloat()+ 2;
        System.out.println("stops in: "+seconds+"seconds");
    }
    public void autoRevMatching(){
        int gear = generator.nextInt(5)+1;
        System.out.println("changes gear to: "+gear);
    }
    public void engineInCharge(String driver){
        System.out.println("commands given by: "+driver);
    }
}
