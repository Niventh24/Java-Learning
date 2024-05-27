import java.util.Scanner;

public class LoopTask12 {//print pattern
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i*2-1;k++){//to print triangle
            // for(int k=1;k<=i;k++){//for right angle triangle
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
