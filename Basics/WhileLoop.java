package Basics;
import java.util.*;
class WhileLoop{
    public static void main(String[] args) {//generate random numbers untill 5
        Random rand=new Random();
        int num=0;
        while(num!=5){
            num=rand.nextInt(10);
            System.out.println(num);
        }

    }
}