import java.util.Scanner;

public class LoopTask7 {//display nth term from a fibonacci series
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
       int num=sc.nextInt();
       int n1=1;
       int n2=1;
       int result=1;
       for(int i=1;i<=num-2;i++){
        result=n1+n2;
        n1=n2;
        n2=result;
       }
       System.out.println(result);
        sc.close();
    }
    
}
