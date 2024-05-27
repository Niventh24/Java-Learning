package Basics;

import java.util.*;
class Ques2{
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        getNameAge(Sc);
        getNameAgeAddress(Sc); 
        Sc.close();         
    }

    private static void getNameAgeAddress(Scanner Sc) {
        System.out.print("Enter your name:");
        String Name=Sc.nextLine();
        System.out.print("Enter your age:");
        int Age=Sc.nextInt();
        Sc.nextLine();
        System.out.print("Enter your address:");
        String Address=Sc.nextLine();
        System.out.println("My Name is "+Name);
        System.out.println("My Age is "+Age);
        System.out.println("My Address is "+Address);
    }

    private static void getNameAge(Scanner Sc) {
        System.out.print("Enter your name:");
        String Name=Sc.nextLine();
           System.out.print("Enter your age:");
        int Age=Sc.nextInt();
        System.out.println("My Name is "+Name);
        System.out.println("My Age is "+Age);
    }
}
