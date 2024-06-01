
public class Ex35_Manager extends Ex35_Employee{
    private double bonus;
    public Ex35_Manager(String name,double salary,int empID,double bonus){
        super(name,salary,empID);
        this.bonus=bonus;
    }
    public void setBonus(double bonus){
        this.bonus=bonus;
    }    

    public double getSalary(){
        return super.getSalary()+bonus;
    }

}
