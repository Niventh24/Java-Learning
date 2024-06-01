import java.time.LocalDate;

public class Ex35_Employee {
    private String name;
    private double salary;
    private int employID;
    private LocalDate joiningDate;

    public Ex35_Employee(String name,double salary,int employID){
        this.name=name;
        this.salary=salary;
        this.employID=employID;
        this.joiningDate=LocalDate.now();
    }
    
    public double raiseSalary(double percentage) {
        return salary+=salary*percentage/100;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployID() {
        return "EmpID"+employID;
    }
    public String display(){
        return "Employee ID: "+getEmployID()+" Name:"+name+" Salary: "+getSalary()+" Joining Date: "+joiningDate;
    }
    
    
}
