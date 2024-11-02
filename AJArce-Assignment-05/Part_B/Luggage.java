package TravelingPlanner;

public class Luggage {
    private int size; //Luggage Size should be in inches
    private int weight;// Luggage Weight should be in pounds

    public Luggage(){
    }

    public Luggage(int size, int weight){
        this.size = size;
        this.weight = weight;
    }

    public int getSize() {
        return this.size;
    }

    public int getWeight(){
        return this.weight;
    }

    public void setSize(int size){
        this.size = size;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }
}
