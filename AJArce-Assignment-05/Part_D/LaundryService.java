package AssignmentPartD;

public class LaundryService {
    private String serviceID;
    private Guest guest;
    private String laundryType;
    private boolean isCompleted;

    public LaundryService(String serviceID, Guest guest, String laundryType, boolean isCompleted) {
        this.serviceID = serviceID;
        this.guest = guest;
        this.laundryType = laundryType;
        this.isCompleted = isCompleted;
    }

    public String getServiceID() {
        return serviceID;
    }

    public void setServiceID(String serviceID) {
        this.serviceID = serviceID;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public String getLaundryType() {
        return laundryType;
    }

    public void setLaundryType(String laundryType) {
        this.laundryType = laundryType;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

    public void requestLaundry() {
        System.out.println("Laundry service requested for " + laundryType + " by guest " + guest.getName());
    }

    public void completeLaundry() {
        isCompleted = true;
        System.out.println("Laundry service for " + laundryType + " has been completed.");
    }
}
