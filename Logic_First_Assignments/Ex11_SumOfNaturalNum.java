import java.util.Scanner;

public class Ex11_SumOfNaturalNum {//print sum of first n odd numbers
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n= sc.nextInt();
        sc.close();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println("Sum of first n Natural numbers are: "+sum);
    }
    
}
