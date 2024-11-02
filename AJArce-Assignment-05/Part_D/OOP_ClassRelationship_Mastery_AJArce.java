package AssignmentPartD;

public class OOP_ClassRelationship_Mastery_AJArce {
   public static void runHotelManagement(){
       Hotel hotel = new Hotel("CSC Hotel", "San Francisco");

       Room room1 = new Room(101, "Single", true, new Amenities(true, true, true));
       Room room2 = new Room(102, "Double", true, new Amenities(false, true, true));
       hotel.addRoom(room1);
       hotel.addRoom(room2);

       Staff staff1 = new Staff("Johnny Sins", 30, 555553555, 123, "Receptionist");
       Manager manager1 = new Manager("Jinny Sons", 45, 123123123, 111, "General Manager", "Hotel Operations");
       hotel.addStaff(staff1);
       hotel.addStaff(manager1);

       Guest guest1 = new Guest("Duc Ta", 28, 11111111, 101);
       Reservation reservation1 = new Reservation("Duc Ta", 101, 12, 20, 12, 25);

       SpaService spaService = new SpaService("SP001", "Full Body", 120.00, true);
       spaService.bookService();

       Event event1 = new Event("EV001", "Wedding Reception", "12/24/2024", "Banquet Hall");
       EventBooking eventBooking1 = new EventBooking("EB001", event1, guest1);
       eventBooking1.confirmBooking();

       hotel.getHotelDetails();
       room1.displayRoomDetials();
       reservation1.displayReservationDetails();
       spaService.bookService();
       event1.scheduleEvent();
   }

   public static void main(String[] args){
       runHotelManagement();
   }
}
