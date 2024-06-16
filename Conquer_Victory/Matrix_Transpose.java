package Conquer_Victory;

import java.util.Scanner;

public class Matrix_Transpose {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows for matrix : ");
        int r1=sc.nextInt();
        System.out.print("Enter the number of columns for matrix : ");
        int c1=sc.nextInt();
        int a1[][]=new int[r1][c1];
        int a2[][]=new int[c1][r1];
        for(int i=0;i<a1.length;i++){
            for(int j=0;j<a1[i].length;j++){
                System.out.print("Enter the values for matrix : ");
                a1[i][j]=sc.nextInt();
            }
        }
        sc.close();
        for(int i=0;i<c1;i++){//0123
            for(int j=0;j<r1;j++){//01
                a2[i][j]=a1[j][i];
                System.out.print(a2[i][j]+" ");
            }
            System.out.println();
        }
        // for(int i=0;i<r1;i++){//01
        //     for(int j=0;j<c1;j++){//0123
        //         a2[j][i]=a1[i][j];
        //         System.out.print(a2[i][j]+" ");
        //     }
        //     System.out.println();
        // }
    }
}
