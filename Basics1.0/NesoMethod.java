import java.util.Scanner;

public class NesoMethod {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("My name is "+ username(sc));
       System.out.println("My age is "+age(sc));
    }
    public static String username(Scanner sc){       
        System.out.print("Enter your Name: ");
        String name=sc.nextLine();
        return name;       
    }
    public static int age(Scanner sc){
        System.out.print("Enter your Age: ");
        int age=sc.nextInt();
        return age; 
    }
    
}
