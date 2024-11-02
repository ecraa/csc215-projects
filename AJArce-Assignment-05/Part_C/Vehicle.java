package mechanic;

public class Vehicle {
    private String brand;
    private String model;
    private int year;
    private boolean vehicleRunning;

    public Vehicle(){
        this.vehicleRunning = false;
    }

    public Vehicle(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.vehicleRunning = false;
    }

    public String getBrand(){
        return this.brand;
    }

    public String getModel(){
        return this.model;
    }

    public int getYear(){
        return this.year;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void startVehicle(){
        if (!vehicleRunning){
            vehicleRunning = true;
            System.out.println("The vehicle has started running!");
        } else {
            System.out.println("The vehicle is already running!");
        }
    }

    public void stopVehicle(){
        if (vehicleRunning) {
            vehicleRunning = false;
            System.out.println("The vehicle has stopped running!");
        } else {
            System.out.println("The vehicle is already stopped!");
        }
    }

}
