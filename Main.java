package VehicleApp;

public class Main {
    public static void main(String[] args) {
        SUV  fortuner = new SUV("Fortuner", 4, "SUV", 5, 6,false );
        fortuner.move(40, 0);
        fortuner.accelerate(20);
        fortuner.accelerate(-60);

        System.out.println(" Current Gear : " + fortuner.getCurrentGear());
        System.out.println(" Current Speed : " + fortuner.getCurrentSpeed());

    }

}
