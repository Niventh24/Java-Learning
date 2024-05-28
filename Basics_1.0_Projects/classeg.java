package com.Project1;

import java.util.Scanner;

public class classeg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Rectangle[] r1=new Rectangle[3];
        for(int i=0;i<r1.length;i++){
            System.out.print("Do you want to give input for the rectangles(y/n):");
            char choice=sc.next().charAt(0);
            if(choice=='y'){
                System.out.print("Enter height and width: ");
                r1[i]=new Rectangle(sc.nextDouble(),sc.nextDouble());
            }
            else{
                r1[i]=new Rectangle();
        }
        sc.nextLine();
    }sc.close();
    System.out.println("The rectangles are: ");
    for(int i=0;i<r1.length;i++){
        System.out.println("Rectangle "+(i+1)+" :width:"+r1[i].getWidth()+", height:"+r1[i].getheight());
    }
    }
    
}
