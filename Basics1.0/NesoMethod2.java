import java.util.Scanner;

public class NesoMethod2 {
    public static void main(String[] args) {//find between given numbers
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter starting number:");
        int start=sc.nextInt();
        System.out.print("Enter ending number:");
        int end=sc.nextInt();
        sc.close();
       primebetween(start, end);
    }
    public static boolean isprime(int num){
        boolean prime=num==1?false:true;
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                prime=false;
            }
        }
        return prime;
    }
    public static void primebetween(int start,int end){
        for(int i=start;i<=end;i++){
            if(isprime(i)){
                System.out.print(i+" ");
            }
        }
    }
}
