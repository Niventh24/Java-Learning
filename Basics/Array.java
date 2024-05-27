package Basics;
import java.util.Scanner;
class Array{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int [] arr1=new int[5];
        System.out.print("Enter num1:");
        arr1[0]=sc.nextInt();
        System.out.print("Enter num2:");
        arr1[1]=sc.nextInt();
        System.out.print("Enter num3:");
        arr1[2]=sc.nextInt();
        System.out.print("Enter num4:");
        arr1[3]=sc.nextInt();
        System.out.print("Enter num5:");
        arr1[4]=sc.nextInt();
        int total=arr1[0]+arr1[1]+arr1[2]+arr1[3]+arr1[4];
        System.out.println(total);
        sc.close();
    }
}