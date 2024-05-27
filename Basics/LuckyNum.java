package Basics;
import java.util.Scanner;

public class LuckyNum {
    public static void main(String[] args) {//check if num is lucky num or not-num1+num2=num3+num4
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a 4 digit number:");
        String num=sc.nextLine();
        
        if(num.length()==4){
            int num1=num.charAt(0);
            int num2=num.charAt(1);
            int num3=num.charAt(2);
            int num4=num.charAt(3);
            if(num1+num2==num3+num4){
                System.out.println("The number given is a lucky number");
            }
            else{
                System.out.println("The number is not a lucky number");
            }
        }
        else
             System.out.println("The entered number is not a 4 digit number");
    
    sc.close();
    }
}
