package AssignmentPartD;

public class Reservation {
    private String guest;
    private int room;
    private int checkoutMonth;
    private int checkoutDay;
    private int checkinMonth;
    private int checkinDay;

    public Reservation(String guest, int room, int checkoutMonth, int checkoutDay, int checkinMonth, int checkinDay){
        this.guest = guest;
        this.room = room;
        this.checkinMonth = checkinMonth;
        this.checkinDay = checkinDay;
        this.checkoutMonth = checkoutMonth;
        this.checkoutDay = checkoutDay;
    }

    public String getGuest() {
        return this.guest;
    }

    public int getRoom() {
        return this.room;
    }

    public int getCheckinMonth(){
        return this.checkinMonth;
    }

    public int getCheckinDay() {
        return this.checkinDay;
    }

    public int getCheckoutMonth(){
        return this.checkoutMonth;
    }

    public int getCheckoutDay(){
        return this.checkoutDay;
    }

    public void getGuest(String guest) {
        this.guest = guest;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public void setCheckinMonth(int checkinMonth){
        this.checkinMonth = checkinMonth;
    }

    public void setCheckinDay(int checkinDay) {
        this.checkinDay = checkinDay;
    }

    public void setCheckoutMonth(int checkoutMonth){
        this.checkoutMonth = checkinMonth;
    }

    public void setCheckoutDay(int checkoutDay){
        this.checkoutDay = checkoutDay;
    }

    public void displayReservationDetails() {
        System.out.println("Reservation Details:");
        System.out.println("Guest: " + guest);
        System.out.println("Room Number: " + room);
        System.out.println("Check-In Date: " + checkinMonth + "/" + checkinDay);
        System.out.println("Check-Out Date: " + checkoutMonth + "/" + checkoutDay);
    }

}
