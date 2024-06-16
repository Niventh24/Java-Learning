package Conquer_Victory;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value to be searched: ");
        int r1=sc.nextInt();
        int mid=0;
        boolean flag=false;
        sc.close();
        int []a1={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int start=0;
        int end=a1.length-1;
        while(start<=end){
            mid=(start+end)/2;
            if(a1[mid]==r1){
                System.out.println("Element "+r1+" is at index "+mid);
                flag=true;
                break;
            }else if(a1[mid]>r1){
                end=mid-1;
            }else
                start=mid+1;
        }
        if(flag==false){
            System.err.println("Element not found:-1");
        }
    }
}
