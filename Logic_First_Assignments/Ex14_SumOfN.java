import java.util.Scanner;

public class Ex14_SumOfN {//print sum of n with -1 as terminator
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        loop(sc);
        sc.close();
        
    }

    private static void loop(Scanner sc) {
        int sum=0;
        while(true){
            System.out.print("Enter the value of n(Use Negative numbers to terminate): ");
            int n=sc.nextInt();
            if(n<0)
                break;
            sum+=n;
        }
        System.out.println("The sum of values is "+sum);
    }
}
