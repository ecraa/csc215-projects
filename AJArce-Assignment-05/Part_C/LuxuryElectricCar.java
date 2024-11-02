package mechanic;

public class LuxuryElectricCar extends ElectricCar {
    private String interiorMaterial;
    private boolean selfDrivingEnabled;

    public LuxuryElectricCar(){
        super();
        this.interiorMaterial = "Standard";
        this.selfDrivingEnabled = false;
    }

    public LuxuryElectricCar(String brand, String model, int year, int numberOfDoors, String fuelType, int batteryCapacity, int chargeLevel, String interiorMaterial, boolean selfDrivingEnabled){
        super(brand, model, year, numberOfDoors, fuelType, batteryCapacity, chargeLevel);
        this.interiorMaterial = interiorMaterial;
        this.selfDrivingEnabled = selfDrivingEnabled;
    }

    public String getInteriorMaterial(){
        return interiorMaterial;
    }

    public boolean isSelfDrivingEnabled() {
        return selfDrivingEnabled;
    }

    public void setInteriorMaterial(String interiorMaterial){
        this.interiorMaterial = interiorMaterial;
    }

    public void setSelfDrivingEnabled(boolean selfDrivingEnabled){
        this.selfDrivingEnabled = selfDrivingEnabled;
    }

    public void activateSelfDriving(){
        if(!selfDrivingEnabled) {
            System.out.println("Self-Driving Mode Activated!");
        } else {
            System.out.println("Self-Driving Mode Is Already Activated!");
        }
    }

    public void deactivateSelfDriving(){
        if (selfDrivingEnabled) {
            System.out.println("Self-Driving Mode Deactivated!");
        } else {
            System.out.println("Self-Driving Mode Already Deactivated!");
        }
    }
}
