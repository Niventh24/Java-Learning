import java.util.*;
class TernaryOp{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//ques1
        // System.out.print("Enter if it rains or not:");
        // String rain=sc.nextLine();
        // String output=rain.equals("rain")?"Bring umbrella":"Enjoy the sunlight";
        // System.out.println(output);
        System.out.print("Enter 1st number:");//ques2
        int num1=sc.nextInt();
        System.out.print("Enter 2nd number:");
        int num2=sc.nextInt();
        String result=num1>num2?"Number 1 is greater":"Number 2 is greater";
        System.out.println(result);
        sc.close();
    }
}