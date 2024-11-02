package TravelingPlanner;

public class OOP_ClassRelationship_HAS_A_AJArce {
    public static void runTravelPlanner(){
        Luggage luggage = new Luggage(22, 15);
        Passport passport = new Passport(12, 2025);
        Ticket ticket = new Ticket("Japan", 3, 10, 2025);
        Traveler traveler = new Traveler("Duc Ta", 20, luggage, passport, ticket);

        System.out.println(traveler);
    }

    public static void main(String[] args) {
        runTravelPlanner();
    }
}
