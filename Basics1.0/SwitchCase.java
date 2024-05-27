import java.util.Scanner;

public class SwitchCase {//print odd or even
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter you number: ");
        int num=sc.nextInt();
        switch(num%2){
            case 0:
                System.out.println("The given number is even number");
                break;
            case 1:
                System.out.println("The given number is odd number");
                break;
            default:
                System.out.println("Enter a valid number");

        }
        sc.close();
    }
}
