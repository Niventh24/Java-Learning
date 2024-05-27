import java.util.*;
class Quiz3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num1:");
        int num1=sc.nextInt();
        System.out.print("Enter num2:");
        int num2=sc.nextInt();
        printNum(num1,num2);
        printEvenNum(num1,num2);
        printOddNum(num1,num2);
        printOddEvenCount(num1,num2);
        printDivisiors(num1,num2);
        sc.close();
    }
    private static void printDivisiors(int num1, int num2) {
        System.out.print("Divisors of "+num1+" and "+num2+" between 1 to 100 are ");
        for(int i=1;i<=100;i++){//the numbers div by num1 and num2 between 1 and 100
            if(i%num1==0&&i%num2==0){
                System.out.print(i+" ");
            }
        }
    }
    private static void printOddEvenCount(int num1, int num2) {
        System.out.println("The number of odd and even numbers between "+num1+" and "+num2+" are");
        int oddcount=0;//ques3 and 4-print no of odd and even numbers between inputs
        int evencount=0;
        for(int i=num1;i<=num2;i++){
            if(i%2!=0){
                oddcount+=1;
            }
            else{
                evencount+=1;
            }
        }
        System.out.println("Odd Numbers: "+oddcount);
        System.out.println("Even Numbers: "+evencount);
        System.out.println();
    }
    private static void printEvenNum(int num1, int num2) {
        System.out.print("The even numbers between "+num1+" and "+num2+" are ");
        for(int i=num1;i<=num2;i++){//ques2-print even numbers
            //System.out.println(i);
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();System.out.println();
    }
    private static void printOddNum(int num1, int num2) {
        System.out.print("The odd numbers between "+num1+" and "+num2+" are ");
        for(int i=num1;i<=num2;i++){//ques2-print odd numbers
            //System.out.println(i);
            if(i%2==1){
                System.out.print(i+" ");
            }
        }
        System.out.println();System.out.println();
    }
    private static void printNum(int num1, int num2) {
        System.out.print("The numbers between "+num1+" and "+num2+" are ");
        for(;num1<=num2;num1++){//ques1-print numbers from input1 to input 2
            System.out.print(num1+" ");
        }
        System.out.println();System.out.println();
    }
}