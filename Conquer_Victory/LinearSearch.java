package Conquer_Victory;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value to be searched: ");
        int r1=sc.nextInt();
        sc.close();
        int []a1={1,4,5,6,6,7,44,55,3,22,7,9};
        for(int i=0;i<a1.length;i++){
            if(a1[i]==r1){
                System.out.println("Element "+a1[i]+" is at index "+i );
                break;
            }else if(i==a1.length-1 && a1[i]!=r1){
                System.out.println("Element cannot be found ! :-1");
            }
        }
    }
    
}
