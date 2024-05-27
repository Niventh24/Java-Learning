package Basics;
import java.util.*;
public class IfElse{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice=0;
        while(choice<1||choice>3){
        choice=choice(sc);        
        switch (choice){
            case 1:{
                method1(sc);//1 find if numbers are equal or not
                break;
            }
            case 2:{
                method2(sc);//2 string matching
                break;
            }
            case 3:{
                method3(sc);// 3 string matching
                break;
            }
            default:               
                System.out.println("Please enter a value between 1 and 3");
        }
    }
        sc.close();
    }
    private static void method3(Scanner sc) {
        System.out.print("Enter if Meghana is dead or alive(dead/alive):");
        String meghana=sc.next();
        if(meghana.equals("dead")){
            System.out.println("Surya meets Ramya");
        }
        else{
            System.out.println("Surya meets Meghana");
        }
    }
    private static void method2(Scanner sc) {
        System.out.print("Enter if RCB Win or not:(win/no)");
        String RCB=sc.next();
        if(RCB.equals("win")){
            System.out.println("Ee saala cup namthe");
        }
        else{
            System.out.println("Cup illa");
        }
    }
    private static void method1(Scanner sc) {
        System.out.print("Enter value of 1st number:");
        int num1=sc.nextInt();
        System.out.print("Enter value of 2nd number:");
        int num2=sc.nextInt();
        if(num1==num2){
            System.out.println("Yes the numbers are Equal");
        }
        else{
            System.out.println("No the numbers are not Equal");
        };
    }
    private static int choice(Scanner sc) {
        System.out.print("Enter a number(1-3): ");
        int choice=sc.nextInt();
        return choice;
    }  
}