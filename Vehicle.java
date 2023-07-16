package javaOOPAdvanced_V2.abstraction_override;

abstract class Vehicle {
    private String type;
    private int numberOfWheels;


    public Vehicle(String type,int numberOfWheels) {
        this.type=type;
        this.numberOfWheels = numberOfWheels;
    }

    public void showVehiclesDetails(){
        System.out.println(type + " " + numberOfWheels);
    }

    public abstract void doVehicleSound();

}
