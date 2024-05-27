package Basics;
import java.util.*;
class AddWithUserInput{//add three numbers
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter value of 1st number:");
        int a=input.nextInt();
        System.out.print("Enter value of 2nd number:");
        int b=input.nextInt();
        System.out.print("Enter value of 3rd number:");
        int c=input.nextInt();
        int Sum=a+b+c;
        System.out.println("Sum ="+ Sum);

        input.close();
    }
}