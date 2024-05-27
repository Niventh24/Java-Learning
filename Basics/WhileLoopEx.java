package Basics;
import java.util.Scanner;

public class WhileLoopEx {//get input between 1 and 10
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int num=sc.nextInt();
        
        if(!(num>=1&&num<=10)){
        while(!(num>=1&&num<=10)){
            System.out.print(num+" is not between 1 and 10. Try Again!: ");
            num=sc.nextInt();
           
        }
        }       
        System.out.println(num+" is between 1 and 10. Thanks!");       
        sc.close();
    }
}
