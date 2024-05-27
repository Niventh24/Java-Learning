import java.util.Scanner;

public class LoopTask13 {//print pattern
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i*2-1;k++){//to print triangle
                if(i==num){
                    System.out.print("*");
                }
                else if(k==1||k==i*2-1){
                    System.out.print("*");
                }
                else
                    System.out.print(" ");             
            }
            System.out.println();
        }
        sc.close();
    }
    
}
