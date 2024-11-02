package AssignmentPartD;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String name;
    private String location;
    private List<Room> rooms;
    private List<Staff> staff;

    public Hotel(String name, String location) {
        this.name = name;
        this.location = location;
        this.rooms = new ArrayList<>();
        this.staff = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public List<Staff> getStaff() {
        return staff;
    }

    public void addStaff(Staff staffMember) {
        staff.add(staffMember);
    }

    public void getHotelDetails() {
        System.out.println("Hotel Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Number of Rooms: " + rooms.size());
        System.out.println("Number of Staff: " + staff.size());
    }
}
