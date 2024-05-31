import java.util.Scanner;

public class Ex30_FactorialRecursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of N :");
        int n=sc.nextInt();
        sc.close();
        System.out.println("Factorial of n is "+factorial(n));
    }

    private static int factorial(int n) {
        if(n==0)
            return 1;
        return n* factorial(n-1);
    }
    
}
