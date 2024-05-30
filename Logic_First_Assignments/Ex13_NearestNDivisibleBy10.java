import java.util.Scanner;

public class Ex13_NearestNDivisibleBy10 {//number divisible by 10 and near to 10(n>num)
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        sc.close();
        for(int i=n;i>=0;i--){
            if(i%10==0){
                System.out.println("Number divisible by 10 and near to N is: "+i);
                break;
            }
        }
        }
    
}
