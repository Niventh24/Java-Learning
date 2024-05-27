package Basics;
import java.util.Scanner;

public class DoWhile1 {
    public static void main(String[] args) {//check if the input is between 1 and 10
        Scanner sc=new Scanner(System.in);
        int num=0;
        do{
        System.out.print("Enter a number between 1 and 10: ");
        num=sc.nextInt();
        }while(!(num>=1&&num<=10));
        System.out.println(num+" is between 1 and 10.Thanks!");
        sc.close();
        
    }
}
