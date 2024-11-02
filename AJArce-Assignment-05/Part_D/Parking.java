package AssignmentPartD;

public class Parking {
    private String parkingID;
    private int slotNumber;
    private boolean isOccupied;

    public Parking(String parkingID, int slotNumber, boolean isOccupied) {
        this.parkingID = parkingID;
        this.slotNumber = slotNumber;
        this.isOccupied = isOccupied;
    }

    public String getParkingID() {
        return parkingID;
    }

    public void setParkingID(String parkingID) {
        this.parkingID = parkingID;
    }

    public int getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(int slotNumber) {
        this.slotNumber = slotNumber;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean isOccupied) {
        this.isOccupied = isOccupied;
    }

    public void assignParking() {
        if (!isOccupied) {
            isOccupied = true;
            System.out.println("Parking slot " + slotNumber + " has been assigned.");
        } else {
            System.out.println("Parking slot " + slotNumber + " is already occupied.");
        }
    }

    public void vacateParking() {
        if (isOccupied) {
            isOccupied = false;
            System.out.println("Parking slot " + slotNumber + " is now vacant.");
        } else {
            System.out.println("Parking slot " + slotNumber + " is already vacant.");
        }
    }
}
