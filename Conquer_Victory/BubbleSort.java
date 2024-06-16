package Conquer_Victory;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int r1=sc.nextInt();
        int []a1=new int[r1];
        int t=0;
        for(int i=0;i<r1;i++){
            System.out.print("Enter the value of array: ");
            a1[i]=sc.nextInt();
        }
        System.out.println("Before sort:");
        for (int i : a1) {
            System.out.print(i+" ");
        }
        sc.close();
        for(int i=0;i<r1-1;i++){
            for(int j=0;j<r1-1-i;j++){
                if(a1[j]>a1[j+1]){
                    t=a1[j];
                    a1[j]=a1[j+1];
                    a1[j+1]=t;
                }
            }
        }
        System.out.println();
        System.out.println("After sort: ");
        for (int i : a1) {
            System.out.print(i+" ");
        }
    }
    
}
