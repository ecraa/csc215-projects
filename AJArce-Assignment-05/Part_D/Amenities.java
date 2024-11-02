package AssignmentPartD;

public class Amenities {
    private boolean wifi;
    private boolean miniBar;
    private boolean airConditioning;

    public Amenities (boolean wifi, boolean minibaar, boolean airConditioning){
        this.wifi = wifi;
        this.miniBar = minibaar;
        this.airConditioning = airConditioning;
    }

    public void displayAmenities(){
        System.out.println("Amenities:");
        System.out.println("WiFi: " + (wifi ? "Available" : "Not Available"));
        System.out.println("MiniBar: " + (miniBar ? "Available" : "Not Available"));
        System.out.println("Air Conditioning: " + (airConditioning ? "Available" : "Not Available"));
    }
}
