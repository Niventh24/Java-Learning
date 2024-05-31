import java.util.Scanner;

public class Ex21_FindTwoDigitOrNot {
    static boolean findIfTheNumberIsTwoDigitOrNoT(int n){
        return n>9&&n<100?true:false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n=sc.nextInt();
        boolean output=findIfTheNumberIsTwoDigitOrNoT(n);
        sc.close();
        System.out.println(output);
    }
    
}
