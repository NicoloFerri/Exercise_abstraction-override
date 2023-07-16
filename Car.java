package javaOOPAdvanced_V2.abstraction_override;

public class Car extends Vehicle{

    private int numbersOfDoors;
    private double carPrice;

    public Car(int wheels , int doors , double price) {
        super("Car",wheels);
        this.numbersOfDoors=doors;
        this.carPrice=price;
    }

    @Override
    public void showVehiclesDetails() {
        super.showVehiclesDetails();
        System.out.println("Number of doors = " + numbersOfDoors);
    }

    @Override
    public void doVehicleSound() {
        System.out.println("Sound = Vroom vroom!");
    }
}
