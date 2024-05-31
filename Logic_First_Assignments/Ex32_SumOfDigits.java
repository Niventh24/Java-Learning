import java.util.Scanner;

public class Ex32_SumOfDigits {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        sc.close();
        System.out.println("The sum of Digits of n is "+sum(n));
    }

    private static int sum(int n) {
        if(n<10)
            return n;
        return n%10+ sum(n/10);
    }
}
