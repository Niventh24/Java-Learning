import java.util.Scanner;

public class Ex15_PrimeOrNot {//prime or not
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        sc.close();
        if(n==1){
            System.out.println("1 is neither prime nor composite number");
        }else if (n<=0){
            System.out.println("Please enter a valid natural number");
        }else{
            boolean isprime=true;
            for(int i=2;i<=n/2;i++){
                if(n%i==0){
                    System.out.println(n+" is not a prime number");
                    isprime=false;
                    break;
                }
            }
            if(isprime){
                System.out.println(n+" is a prime number");
            }
        }
    }
    
}
