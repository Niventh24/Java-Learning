import java.util.Scanner;

public class LoopTask6 {//sum of digits of input
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num=sc.nextInt();
        int sum=0;
        int i=1;
        while(true){
            if(num/i==0)break;
            sum+=(num/i)%10;
            i=i*10;
        }
        System.out.println("Sum of digits is "+sum);
        sc.close();
    }
    
}
