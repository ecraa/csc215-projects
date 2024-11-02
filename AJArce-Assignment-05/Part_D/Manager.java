package AssignmentPartD;

public class Manager extends Staff {
    private String departmentManaged;

    public Manager(){
        super();
    }

    public Manager(String name, int age, int phoneNumber, int staffID, String position, String departmentManaged){
        super(name, age, phoneNumber, staffID, position);
        this.departmentManaged = departmentManaged;
    }

    public String getDepartmentManaged(){
        return this.departmentManaged;
    }

    public void setDepartmentManaged(String departmentManaged){
        this.departmentManaged = departmentManaged;
    }

    public void manageDepartment(){
        System.out.println(this.getName() + " is managing the department intensely!");
    }
}
