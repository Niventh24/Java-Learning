import java.util.Scanner;

public class LoopTask5 {//find the minimum and maximum of sequence  with negative numbers as terminator(2 4 6 7 -1)
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
            System.out.println("Use Negative numbers to end the number sequence.");
            System.out.print("Enter numbers: ");
            calc(sc);
            sc.close();     
    }

    private static void calc(Scanner sc) {
        int high;
        int low;
        int num1=sc.nextInt();
        high=num1;
        low=num1;
        if(num1>=0){
            for(;num1>0;){          
                num1=sc.nextInt();
                if(num1<0)break;
                //high=Math.max(high,num1);
                //low=Math.min(low,num1);
                high=num1>high?num1:high;
                low=num1<low?num1:low;
                }
            System.out.println("Highest number is "+high);
            System.out.println("Lowest number is "+low);
        }
        else
            System.out.println(num1+" is invalid sequence");
    }
    
}
