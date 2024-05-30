import java.util.Scanner;

public class Ex10_PrintFirstNOddNum {//print first n odd numbers
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n=sc.nextInt();
        sc.close();
        int i=1;
        while(n>0){
            if(i%2==1){
                System.out.print(i+" ");
                n--;
            }
            i++;
        }
    }
}
