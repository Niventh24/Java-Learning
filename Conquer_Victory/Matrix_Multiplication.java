package Conquer_Victory;

import java.util.Scanner;

public class Matrix_Multiplication {
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
        if(c1==r2){
            int[][] a=new int[r1][c1];
            int[][] b=new int[r2][c2];
            int[][] c=new int[r1][c2];
            for (int[] i : a) {
                for(int j=0;j<c1;j++){
                    System.out.print("Enter the value for matrix A: ");
                    i[j]=sc.nextInt();
                }
            }
            for (int[] i : b) {
                for(int j=0;j<c2;j++){
                    System.out.print("Enter the value for matrix B: ");
                    i[j]=sc.nextInt();
                }
            }
            sc.close();
            for (int i=0;i<a.length;i++) {
                for(int j=0;j<b[i].length;j++){
                    for(int k=0;k<a[i].length;k++){
                        c[i][j]+=a[i][k]*b[k][j];
                    }
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("The given matrix is unsupported for matrix multiplication");
        }
    }
}
