package TravelingPlanner;

public class Traveler {
    private String name;
    private int age;
    private Luggage luggage;
    private Passport passport;
    private Ticket ticket;

    public Traveler(){
    }
    public Traveler(String name, int age, Luggage luggage, Passport passport, Ticket ticket){
        this.name = name;
        this.age = age;
        this.luggage = luggage;
        this.passport = passport;
        this.ticket = ticket;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public Luggage getLuggage(){
        return this.luggage;
    }

    public Passport getPassport(){
        return this.passport;
    }

    public Ticket getTicket(){
        return this.ticket;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setLuggage(Luggage luggage){
        this.luggage = luggage;
    }

    public void setPassport(Passport passport){
        this.passport = passport;
    }

    public void setTicket(Ticket ticket){
        this.ticket = ticket;
    }

    @Override
    public String toString(){
        return "Traveler: " + this.name +
                "\nAge: " + this.age +
                "\nPassport Expiry Date: " + this.passport.getExpireMonth() + "/" + this.passport.getExpireYear() +
                "\nLuggage Size in Inches: " + this.luggage.getSize() +
                "\nLuggage Weight in Pounds: " + this.luggage.getWeight() +
                "\nTravel Destination: " + this.ticket.getDestination() +
                "\nTravel Date: " + this.ticket.getTravelMonth() + "/" + this.ticket.getTravelDay() + "/" + this.ticket.getTravelYear();

    }



}
