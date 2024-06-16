package Conquer_Victory;

import java.util.Scanner;

public class Matrix_Subraction {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number of rows for matrix A: ");
    int r1=sc.nextInt();
    System.out.print("Enter the number of rows for matrix B: ");
    int r2=sc.nextInt();
    System.out.print("Enter the number of columns for matrix A: ");
    int c1=sc.nextInt();
    System.out.print("Enter the number of columns for matrix B: ");
    int c2=sc.nextInt();
    if(r1==r2&&c1==c2){
        int a1[][]=new int[r1][c1];
        int a2[][]=new int[r2][c2];
        int a3[][]=new int[r1][c1];
        for(int i=0;i<a1.length;i++){
            for(int j=0;j<a1[i].length;j++){
                System.out.print("Enter the values for matrix A: ");
                a1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<a2.length;i++){
            for(int j=0;j<a2[i].length;j++){
                System.out.print("Enter the values for matrix B: ");
                a2[i][j]=sc.nextInt();
            }
        }
        sc.close();
        for(int i=0;i<a3.length;i++){
            for(int j=0;j<a3[i].length;j++){
                a3[i][j]=a1[i][j]-a2[i][j];
                System.out.print(a3[i][j]+" ");
            }   
            System.out.println(); 
        }
    }else
        System.out.println("No of rows/columns must be equal!");
    }
}
