package javaOOPAdvanced_V2.abstraction_override;

public class Boat extends Vehicle{

    private double maxKnotsSpeed;

    private int boatKilosWeight;

    public Boat(double maxKnotsSpeed, int boatKilosWeight) {
        super("Boat", 0);
        this.maxKnotsSpeed = maxKnotsSpeed;
        this.boatKilosWeight = boatKilosWeight;
    }

    public void getBoatWeightAndSpeed(){
        System.out.println("Total kilos weight = " + boatKilosWeight);
        System.out.println("Maximum knots speed = " + maxKnotsSpeed);
    }

    @Override
    public void doVehicleSound() {
        System.out.println("Sound = Splash splash!");
    }
}
