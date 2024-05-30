import java.util.Scanner;

public class Ex12_FactorialOfN {//find factorial of n
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n=sc.nextInt();
        sc.close();
        long factorial=1;
        for(int i=1;i<=n;i++){
            factorial*=i;
        }
        System.out.println("Factorial of N is: "+factorial);
    }
    
}
