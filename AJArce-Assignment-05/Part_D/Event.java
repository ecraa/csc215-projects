package AssignmentPartD;

public class Event {
    private String eventID;
    private String eventName;
    private String eventDate;
    private String eventLocation;

    public Event(String eventID, String eventName, String eventDate, String eventLocation) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventLocation = eventLocation;
    }

    public String getEventID() {
        return eventID;
    }

    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

    public void scheduleEvent() {
        System.out.println("Event " + eventName + " has been scheduled on " + eventDate + " at " + eventLocation + ".");
    }

    public void cancelEvent() {
        System.out.println("Event " + eventName + " has been canceled.");
    }
}
