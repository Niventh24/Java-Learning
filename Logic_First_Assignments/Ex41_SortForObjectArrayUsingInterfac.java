import java.time.LocalDate;
import java.util.Arrays;

public class Ex41_SortForObjectArrayUsingInterfac {
    public static void main(String[] args) {
        Employee [] employee1=new Employee[5];
        employee1 [2]=new Employee("Akash", 30000, 04);
        employee1 [4]=new Manager("Bharat", 30000, 02,5000);
        employee1 [1]=new Manager("Chandru", 30000, 01,5000);
        employee1 [0]=new Manager("Dravid", 30000, 03,5000);
        employee1 [3]=new Manager("Erick", 30000, 05,5000);
        System.out.println("Before sorting");
        for(Employee e:employee1){
            System.out.println(e.display());
        }
        Arrays.sort(employee1);//sorting based on employID 
        System.out.println("After sorting");
        for(Employee e:employee1){
            System.out.println(e.display());
        }
    }
}


class Employee implements Comparable<Employee>{
    private String name;
    private double salary;
    private int employID;
    private LocalDate joiningDate;

    public Employee(String name,double salary,int employID){
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

    // public int compareTo(Employee o) {
    //     if(this.employID==o.employID)
    //         return 0;
    //     if(this.employID<o.employID)
    //         return -1;
    //     return 1;
    // } 
    public int compareTo(Employee s) {
        if(this.getName().charAt(0)==s.getName().charAt(0))
            return 0;
        if(this.getName().charAt(0)<s.getName().charAt(0))
            return -1;
        return 1;
    }   
}

class Manager extends Employee{
    private double bonus;
    public Manager(String name,double salary,int empID,double bonus){
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
}

