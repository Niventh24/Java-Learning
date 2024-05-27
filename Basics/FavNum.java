package Basics;
import java.util.Scanner;

public class FavNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // System.out.print("Enter your favourite integer: ");//q1- print fav number
        // System.out.println(sc.nextInt()+" is my favourite integer too");
        //q2
        System.out.print("Enter your name and age: ");//print name and age
        String name=sc.next();
        double age=sc.nextDouble();
        System.out.println("Hi! "+name+" ,You are "+age+" years old.");
        sc.close();
    }
    
}
