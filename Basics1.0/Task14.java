import java.util.Scanner;

public class Task14 {    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num=sc.nextInt();
        pattern1(num);//to print pattern1-cylinder
        pattern2(num);//to print pattern2-Hollow_cylinder
        pattern3(num);//to print pattern3-I_Type_cylinder
        sc.close();
    }

    private static void pattern1(int num) {
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void pattern2(int num) {
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(i==1||i==num){
                    System.out.print("*");
                }else if(j==1||j==num){
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static void pattern3(int num) {
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(i==1||i==num){
                    System.out.print("*");
                }else if(j==1||j==num){
                    System.out.print(" ");
                }
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
