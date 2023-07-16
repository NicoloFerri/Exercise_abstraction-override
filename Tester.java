package javaOOPAdvanced_V2.abstraction_override;

public class Tester {
    public static void main(String[] args) {
        Car c1 = new Car(4,4,18000.00);
        Boat b1= new Boat(20,15000);

        c1.showVehiclesDetails();
        c1.doVehicleSound();

        System.out.println("\n");

        b1.showVehiclesDetails();
        b1.doVehicleSound();

        System.out.println("\n");

        b1.getBoatWeightAndSpeed();
    }
}
