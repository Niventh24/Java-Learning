import java.util.Scanner;

public class Ex2_Pattern {//print pattern with scanner and print statements
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your a decimal value:");
        int ip=sc.nextInt();
        sc.close();
        System.out.println("   "+ip);
        System.out.println("  "+ip+""+ip+""+ip);
        System.out.println(" "+ip+""+ip+""+ip+""+ip+""+ip);
        System.out.println(ip+""+ip+""+ip+""+ip+""+ip+""+ip+""+ip);
    }
    
}
