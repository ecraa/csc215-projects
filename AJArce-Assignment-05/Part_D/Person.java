package AssignmentPartD;

public class Person {
    private String name;
    private int age;
    private int phoneNumber;

    public Person(){
    }

    public Person(String name, int age, int phoneNumber){
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public int getPhoneNumber(){
        return this.phoneNumber;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void displayInfo(){
        System.out.println("This persons name is: " + this.name );
        System.out.println("This persons age is: " + this.age);
        System.out.println("This persons phone number is: " + this.phoneNumber);
    }
}
