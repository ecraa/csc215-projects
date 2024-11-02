package TravelingPlanner;

public class Ticket {
    private String destination;
    private int travelMonth;
    private int travelDay;
    private int travelYear;

    public Ticket(){
    }

    public Ticket(String destination, int travelMonth, int travelDay, int travelYear){
        this.destination = destination;
        this.travelMonth = travelMonth;
        this.travelDay = travelDay;
        this.travelYear = travelYear;
    }

    public String getDestination() {
        return this.destination;
    }

    public int getTravelMonth() {
        return this.travelMonth;
    }

    public int getTravelDay(){
        return this.travelDay;
    }

    public int getTravelYear(){
        return this.travelYear;
    }

    public void setDestination(String destination){
        this.destination = destination;
    }

    public void setTravelMonth(int travelMonth){
        this.travelMonth = travelMonth;
    }

    public void setTravelDay(int travelDay){
        this.travelDay = travelDay;
    }

    public void setTravelYear(int travelYear){
        this.travelYear = travelYear;
    }
}
