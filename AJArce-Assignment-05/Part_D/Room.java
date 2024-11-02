package AssignmentPartD;

public class Room {
    private int roomNumber;
    private String roomType;
    private boolean isAvailable;
    private Amenities amenities;

    public Room(){
    }

    public Room(int roomNumber, String roomType, boolean isAvailable, Ammenities ammenities){
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.isAvailable = isAvailable;
        this.amenities = ammenities;
    }

    public int getRoomNumber(){
        return this.roomNumber;
    }

    public String getRoomType(){
        return this.roomType;
    }

    public Amenities getAmenities(){
        return amenities;
    }

    public boolean isAvailable(){
        return isAvailable;
    }

    public void setRoomNumber(int roomNumber){
        this.roomNumber = roomNumber;
    }

    public void setRoomType(String roomType){
        this.roomType = roomType;
    }

    public void setAmenities(Amenities amenities){
        this.amenities = amenities;
    }

    public void bookRoom(){
        if (this.isAvailable){
            System.out.println("This room is now booked!");
            this.isAvailable = false;
        } else {
            System.out.println("This room is already booked!");
        }
    }

    public void vacateRoom(){
        if (!this.isAvailable) {
            System.out.println("The room is now vacated!");
            this.isAvailable = true;
        } else {
            System.out.println("This room is already vacated!");
        }
    }

    public void displayRoomDetials(){
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Room Type: " + roomType);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Booked"));
        amenities.displayAmenities();
    }
}
