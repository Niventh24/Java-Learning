package Conquer_Victory;

import java.util.Scanner;

public class Matrix_SumOfDiagonal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows for matrix : ");
        int r1=sc.nextInt();
        System.out.print("Enter the number of columns for matrix : ");
        int c1=sc.nextInt();
        int a1[][]=new int[r1][c1];
        int sum1=0;
        int sum2=0;
        if(r1==c1){
            for(int i=0;i<a1.length;i++){
                for(int j=0;j<a1[i].length;j++){
                    System.out.print("Enter the values for matrix : ");
                    a1[i][j]=sc.nextInt();
                }
            }
            sc.close();
            for(int i=0;i<a1.length;i++){      
                    sum1+=a1[i][i];
                    sum2+=a1[i][r1-1-i];//or i+j==r1-1
            }
            System.out.println("Sum of Primary diagonal is: "+sum1);
            System.out.println("Sum of Secondary diagonal is: "+sum2);
        }
        else{
            System.out.println("The given matrix is unsupported for the sum of Diagonals");
        }
    }
}