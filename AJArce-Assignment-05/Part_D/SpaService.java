package AssignmentPartD;

public class SpaService {
    private String serviceID;
    private String serviceName;
    private double price;
    private boolean isAvailable;

    public SpaService(String serviceID, String serviceName, double price, boolean isAvailable) {
        this.serviceID = serviceID;
        this.serviceName = serviceName;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public String getServiceID() {
        return serviceID;
    }

    public void setServiceID(String serviceID) {
        this.serviceID = serviceID;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void bookService() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Spa service " + serviceName + " has been booked.");
        } else {
            System.out.println("Spa service " + serviceName + " is currently unavailable.");
        }
    }

    public void cancelService() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Spa service " + serviceName + " has been canceled and is now available.");
        } else {
            System.out.println("Spa service " + serviceName + " is already available.");
        }
    }
}
