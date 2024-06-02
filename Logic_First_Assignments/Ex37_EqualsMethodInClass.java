import java.time.LocalDate;
public class Ex37_EqualsMethodInClass {
    public static void main(String[] args) {
        Ex37_Employee employee1=new Ex37_Employee("Akash", 30000, 01);
        Ex37_Employee employee2=new Ex37_Employee("Akash", 30000, 01);
        Ex37_Employee manager1=new Ex37_Manager("Akash", 30000, 01,5000);
        Ex37_Employee manager2=new Ex37_Manager("Akash", 30000, 01,5000);
        System.out.println(employee1.equals(employee2));
        System.out.println(manager1.equals(manager2));
    }
}


class Ex37_Employee {
    private String name;
    private double salary;
    private int employID;
    private LocalDate joiningDate;

    public Ex37_Employee(String name,double salary,int employID){
        this.name=name;
        this.salary=salary;
        this.employID=employID;
        this.joiningDate=LocalDate.now();
    }
    
    public LocalDate getJoiningDate() {
        return joiningDate;
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

    public String getEmployID() {
        return "EmpID"+employID;
    }
    public String display(){
        return "Employee ID: "+getEmployID()+" Name:"+name+" Salary: "+getSalary()+" Joining Date: "+joiningDate;
    }
    public boolean equals(Object obj){
        if(this==obj)
            return true;
        if(obj==null)
            return false;
        if(this.getClass()!=obj.getClass())
            return false;
        Ex37_Employee e=(Ex37_Employee) obj;
        return this.getName().equals(e.getName())&&this.getEmployID().equals(e.getEmployID())&&this.getSalary()==e.getSalary()&&this.getJoiningDate().equals(e.getJoiningDate());
    }
    
    
}

class Ex37_Manager extends Ex37_Employee{
    private double bonus;
    public Ex37_Manager(String name,double salary,int empID,double bonus){
        super(name,salary,empID);
        this.bonus=bonus;
    }
    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus){
        this.bonus=bonus;
    }    

    public double getSalary(){
        return super.getSalary()+bonus;
    }
    public boolean equals(Object obj){
        if(this==obj)
            return true;
        if(obj==null)
            return false;
        if(this.getClass()!=obj.getClass())
            return false;
        if(!(super.equals(obj)))
            return false;
        Ex37_Manager m=(Ex37_Manager)obj;
        return this.getBonus()==m.getBonus();
    }
}
