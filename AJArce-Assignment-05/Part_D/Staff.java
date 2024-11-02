package AssignmentPartD;

public class Staff extends Person {
    private int staffID;
    private String position;

    public Staff(){
        super();
    }

    public Staff(String name, int age, int phoneNumber, int staffID, String position){
        super(name, age, phoneNumber);
        this.staffID = staffID;
        this.position = position;
    }

    public int getStaffID(){
        return this.staffID;
    }

    public String getPosition(){
        return this.getPosition();
    }

    public void setStaffID(int staffID){
        this.staffID = staffID;
    }

    public void setPosition(String position){
        this.position = position;
    }

    public void performDuty(){
        System.out.println(this.getName() + " performed their work duty!");
    }

    @Override
    public void displayInfo(){
        System.out.println("The staffs name is: " + this.getName());
        System.out.println("The staffs age is: " + this.getAge());
        System.out.println("The staffs phone number is: "+ this.getPhoneNumber());
        System.out.println("The staffs ID is: " + this.getStaffID());
        System.out.println("The position of the staff member is: " + this.getPosition());
    }
}
