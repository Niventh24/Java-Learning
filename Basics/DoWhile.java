package Basics;

import java.util.Scanner;
class DoWhile {//get a number greater than 10 from user
public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    int count =0;
    do {
        System.out.println("Enter the number > 10:");
        count = scan.nextInt();
    } while(count<=10);
    System.out.println("Thanks!");
    scan.close();
    }
}