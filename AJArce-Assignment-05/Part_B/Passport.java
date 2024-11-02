package TravelingPlanner;

public class Passport {
    private int expireMonth;
    private int expireYear;

    public Passport(){
    }

    public Passport(int expireMonth, int expireYear){
        this.expireMonth = expireMonth;
        this.expireYear = expireYear;
    }

    public int getExpireMonth(){
        return this.expireMonth;
    }

    public int getExpireYear(){
        return this.expireYear;
    }


    public void setExpireMonth(int expireMonth){
        this.expireMonth = expireMonth;
    }

    public void setExpireYear(int expireYear){
        this.expireYear = expireYear;
    }



}
