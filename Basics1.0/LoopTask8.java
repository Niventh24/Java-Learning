import java.util.Scanner;

public class LoopTask8 {//print string with space between each char
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your string:");
        String input=sc.nextLine();
        System.out.print("String: ");
        for(int i=0;i<=input.length()-1;i++){
            System.out.print(input.charAt(i)+" ");            
        }
        sc.close();
    }
    
}
