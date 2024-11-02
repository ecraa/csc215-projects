package mechanic;

public class Car extends Vehicle {
    private int numberOfDoors;
    private String fuelType;

    public Car(){
        super();
    }

    public Car(String brand, String model, int year, int numberOfDoors, String fuelType){
        super(brand, model, year);
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;
    }

    public int getNumberOfDoors(){
        return numberOfDoors;
    }

    public String getFuelType(){
        return fuelType;
    }

    public void setFuelType(String fuelType){
        this.fuelType = fuelType;
    }

    public void lockDoors(){
        System.out.println("All doors are currently locked.");
    }
    public void unlockDoors(){
        System.out.println("All doors are currently unlocked.");
    }
}


