import java.util.Scanner;

public class Ex33_permutation {
     public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        System.out.print("Enter the value of r: ");
        int r=sc.nextInt();
        sc.close();
        System.out.println("The result for the permutation operation is "+permutation(n,r));
     }

    private static int permutation(int n, int r) {
        
        return factorial(n)/factorial(n-r);
    }

    private static int factorial(int n) {
        if(n==0)
            return 1;
        return n*factorial(n-1);
    }
}
