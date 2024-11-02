package mechanic;

public class ElectricCar extends Car {
    private int batteryCapacity = 10;
    private int chargeLevel;

    public ElectricCar(){
        super();
        this.batteryCapacity = 80;
        this.chargeLevel = 100;
    }

    public ElectricCar(String brand, String model, int year, int numberOfDoors, String fuelType, int batteryCapacity, int chargeLevel){
        super(brand, model, year, numberOfDoors, fuelType);
        this.batteryCapacity = batteryCapacity;
        this.chargeLevel = chargeLevel;
    }

    public int getBatteryCapacity(){
        return this.batteryCapacity;
    }

    public int getChargeLevel(){
        return this.chargeLevel;
    }

    public void setChargeLevel(int chargeLevel){
        if (chargeLevel >= 0 && chargeLevel <=100){
            this.chargeLevel = chargeLevel;
        } else {
            System.out.println("Invalid charge level.");
        }
    }

    public void setBatteryCapacity(int batteryCapacity){
        this.batteryCapacity = batteryCapacity;
    }

    public void chargeBattery(){
        if (chargeLevel < 100){
            chargeLevel = 100;
            System.out.println("The battery is now fully charged.");
        } else {
            System.out.println("The battery is already fully charged");
        }
    }

    public void showBatteryStatus(){
        System.out.println("Battery Capacity: " + batteryCapacity + "kWh");
        System.out.println("Current Charge Level: " + chargeLevel + "%");
    }


}
