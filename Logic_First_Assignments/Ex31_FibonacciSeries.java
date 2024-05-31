import java.util.Scanner;

public class Ex31_FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        sc.close();
        System.out.println("The fibonacci number at "+n+" is "+fibonacci(n));
    }

    private static int fibonacci(int n) {
        if(n==1)
            return 0;
        if(n==2)
            return 1;
        return fibonacci(n-1)+fibonacci(n-2);
    }
    
}
