package Basics;
import java.util.*;

public class UserInput {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);//Question 1 and 2
        // System.out.print("Enter your Name:");
        // String Name=sc.nextLine();
        // System.out.print("Enter your age:");
        // int age=sc.nextInt();
        // sc.nextLine();
        // System.out.print("Enter your address:");
        // String Address=sc.nextLine();
        // System.out.println("My name is "+ Name);
        // System.out.println("My age is " + age);
        // System.out.println("My address is "+ Address);
        // Scanner sc=new Scanner(System.in);//Question 3
        // System.out.print("Enter value of 1st number:");
        // int a=sc.nextInt();
        // System.out.print("Enter value of 2nd number:");
        // int b=sc.nextInt();
        // System.out.print("Enter value of 3rd number:");
        // int c=sc.nextInt();
        // int d=a*b*c;
        // int e=a+b+c;
        // System.out.println("Answeris:"+d/e);
        Scanner sc=new Scanner(System.in);//Question 4
        System.out.print("Enter your name:");
        String Name=sc.nextLine();
        System.out.print("Enter your Score:");
        double Score=sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter your Department:");
        String Department=sc.nextLine();
        System.out.println("Name:"+Name);
        System.out.println("Score:"+Score/10+"/10");
        System.out.println("Department:"+Department);
        sc.close();
    }

    
}