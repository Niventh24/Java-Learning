public class Ex35_Main {
    public static void main(String[] args) {
        Ex35_Employee employee1=new Ex35_Employee("Akash", 30000, 01);
        employee1.raiseSalary(10);
       // System.out.println(employee1.display());

        Ex35_Manager manager1=new Ex35_Manager("Sanjay",50000, 02, 5000);
        manager1.raiseSalary(10);
        //System.out.println(manager1.display());

        Ex35_Employee [] employees=new Ex35_Employee[5];
        employees[0]=new Ex35_Employee("Akash", 30000, 01);
        employees[1]=manager1;
        employees[2]=new Ex35_Employee("Bharat", 30000, 03);
        employees[3]=new Ex35_Employee("Chandru", 30000, 04);
        employees[4]=new Ex35_Manager("Sudeep", 50000, 05,5000);

        for(Ex35_Employee i:employees){
            System.out.println(i.display());
        }
        Ex35_Manager manager2=(Ex35_Manager)employees[4];
        manager2.setBonus(500);
        //employees[4].setBonus(500);
        if(employees[0] instanceof Ex35_Manager){
            Ex35_Manager manager3=(Ex35_Manager)employees[0];
            manager3.setBonus(500);
        }
        System.out.println(employees[1].getSalary());
        System.out.println(employees[4].getSalary());
    }
    
}
