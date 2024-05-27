import java.util.Scanner;
class OddOrEven{
    public static void main(String args[]){//check if the number is odd or even
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of number:");
        int num=sc.nextInt();
        if(num%2==1){
            System.out.println("Num is Odd");
        }
        else{
            System.out.println("Num is Even");
        }
        sc.close();
    }
}