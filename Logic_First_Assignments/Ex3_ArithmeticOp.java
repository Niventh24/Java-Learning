import java.util.Scanner;

public class Ex3_ArithmeticOp {//perform all arithmetic operations
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1=sc.nextInt();
        System.out.print("Enter Second number: ");
        int n2=sc.nextInt();
        System.out.println("Addition: "+(n1+n2));
        System.out.println("Subraction: "+(n1-n2));
        System.out.println("Multiplication: "+(n1*n2));
        System.out.println("Division: "+(n1/n2));
        System.out.println("Modulus: "+(n1%n2));
        sc.close();
    }  
}
