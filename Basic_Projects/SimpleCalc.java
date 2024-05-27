import java.util.Scanner;

public class SimpleCalc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num1 operator and num2(5 + 5): ");
        double num1=sc.nextDouble();
        String op=sc.next();
        double num2=sc.nextDouble();
        if(op.equals("+")){
            System.out.println("The result is "+(num1+num2));
        }
        else if(op.equals("-")){
            System.out.println("The result is "+(num1-num2));
        }
        else if(op.equals("*")){
            System.out.println("The result is "+(num1*num2));
        }
        else if(op.equals("/")){
            System.out.println("The result is "+(num1/num2));
        }
        else if(op.equals("%")){
            System.out.println("The result is "+(num1%num2));
        }
        else{
            System.out.println("Enter a valid expression");
        }
        sc.close();
    }
    
}
