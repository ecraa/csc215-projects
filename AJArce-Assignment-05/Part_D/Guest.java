package AssignmentPartD;

public class Guest extends Person {
    private int roomNumber;

    private int numberOfGuests;

    public Guest(){
        super();
        numberOfGuests++;
    }

    public Guest(String name, int age, int phoneNumber, int roomNumber){
        super(name, age, phoneNumber);
        this.roomNumber = roomNumber;
        numberOfGuests++;
    }

    public int getRoomNumber(){
        return this.roomNumber;
    }

    public void setRoomNumber(int roomNumber){
        this.roomNumber = roomNumber;
    }

    public void displayNumberOfGuests(){
        System.out.println("There are " + this.numberOfGuests + " number of guests!");
    }

    @Override
    public void displayInfo(){
        System.out.println("The guests name is: " + this.getName());
        System.out.println("The guests age is: " + this.getAge());
        System.out.println("The guests phone number is: " + this.getPhoneNumber());
        System.out.println("The guests room number: " + this.getRoomNumber());
    }
}
