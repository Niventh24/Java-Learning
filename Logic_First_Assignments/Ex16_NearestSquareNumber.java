import java.util.Scanner;

public class Ex16_NearestSquareNumber {//print nearest perfect square number greater than n
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        double n=sc.nextInt();
        sc.close();
        n=Math.sqrt(n);
        System.out.println("The nearest perfect Square number greater than n is "+(int)(Math.ceil(n)*Math.ceil(n)));
    }
    
}
