package VehicleApp;

public class SUV extends Car{

    public SUV(String name, int wheels, String type, int doors, int gears, boolean isManual) {
        super(name, wheels = 4, type = "SUV", doors = 5, gears = 6, isManual); 
    }

    
    public void accelerate(int rate) {
        int newSpeed = getCurrentSpeed() + rate;

        if(newSpeed == 0) {
            stop();
            changeGear( 1);
        } 
        else if(newSpeed > 0 && newSpeed <= 10) {
            changeGear(1);
        }
         else if(newSpeed > 10 && newSpeed <= 20) {
            changeGear(2);
        } 
        else if(newSpeed > 20 && newSpeed <= 300) {
            changeGear(3);
        } 
        else if(newSpeed > 30 && newSpeed <= 50) {
            changeGear(4);
        } 
        else if(newSpeed > 50 && newSpeed <= 70) {
            changeGear(5);
        } 
        else {
            changeGear(6);
        }
        if(newSpeed > 0 ) {
            changeSpeed(newSpeed, getCurrentDirection());        
        }
    }
}
