package AssignmentPartD;

public class EventBooking {
    private String bookingID;
    private Event event;
    private Guest guest;

    public EventBooking(String bookingID, Event event, Guest guest) {
        this.bookingID = bookingID;
        this.event = event;
        this.guest = guest;
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public void confirmBooking() {
        System.out.println("Event booking confirmed for " + event.getEventName() + " by guest " + guest.getName());
    }

    public void cancelBooking() {
        System.out.println("Event booking for " + event.getEventName() + " has been canceled.");
    }
}
