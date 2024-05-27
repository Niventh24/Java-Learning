package Basics;
import java.util.*;
public class IfElseQuiz2{
public static void main(String[] args) {
    // Scanner scan=new Scanner(System.in);//1
    //System.out.print("Enter your mark:");
    // int Mark=scan.nextInt();
    // if(Mark>=35){
    //     System.out.println("Pass");
    // }else{
    //     System.out.println("Fail");
    // }
    // Scanner scan=new Scanner(System.in);//2
    //System.out.print("Enter your income:");
    // int Income=scan.nextInt();
    // if(Income>=7000){
    //     System.out.println("Scholarship is available");
    // }else{
    //     System.out.println("Scholarship is not available");
    // }
    // Scanner scan=new Scanner(System.in);//3
    //System.out.print("Enter value of number:");
    // int Number=scan.nextInt();
    // if(Number%3==0&&Number%5==0){
    //     System.out.println("The number is divisible by 3 and 5");
    // }else{
    //     System.out.println("The number is not divisible by 3 and 5");
    // }
    // Scanner scan=new Scanner(System.in);//4
    //System.out.print("Enter value of number:");
    // int Number=scan.nextInt();
    // if(Number%2==0){
    //     System.out.println("The number is Even");
    // }else{
    //     System.out.println("The number is Odd");
    // }
    // Scanner sc=new Scanner(System.in);//5
   // System.out.print("Enter your score:");
    // int score=sc.nextInt();
    // if(score<50){
    //     System.out.println("You need to improve");
    // }
    // else if (score>=50 && score<70) {
    //     System.out.println("Good Job");
    // }
    // else if(score>=70){
    //         System.out.println("Excellent performance");
    // }
    // Scanner sc=new Scanner(System.in);//6
    //System.out.print("Enter mark for 1st subject:");
    // int sub1=sc.nextInt();
    //System.out.print("Enter mark for 2nd subject:");
    // int sub2=sc.nextInt();
    //System.out.print("Enter mark for 3rd subject:");
    // int sub3=sc.nextInt();
    //System.out.print("Enter mark for 4th subject:");
    // int sub4=sc.nextInt();
    //System.out.print("Enter mark for 5th subject:");
    // int sub5=sc.nextInt();
    // int Average=(sub1+sub2+sub3+sub4+sub5)/5;
    // if(Average<35){
    //     System.out.println("Additional class is required");
    // }
    // else{
    //     System.out.println("You are good to go");
    // }
    // Scanner sc=new Scanner(System.in);
    //System.out.print("Enter Signal color:");
    // String Traffic_colour=sc.nextLine();
    // if(Traffic_colour.equals("red")){
    //     System.out.println("Stop");
    // }
    // else if(Traffic_colour.equals("yellow")){
    //     System.out.println("Get ready");
    // }
    // else if(Traffic_colour.equals("green")){
    //     System.out.println("Go");
    // }
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter your salary:");
    int Salary=sc.nextInt();
    System.out.print("Enter your age:");
    int Age=sc.nextInt();
    if(Salary>=20000||Age<=25){
        int Loan=sc.nextInt();
        if(Loan<=50000){
            System.out.println("You are eligible for loan");
        }
        else if(Loan>50000){
            System.out.println("Maximum loan amount is 50000");
        }
    }else{
        System.out.println("You are not eligible");
    }
    sc.close();
}
}