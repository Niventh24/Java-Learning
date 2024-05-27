import java.util.Scanner;

public class LoopTask2 {//get input from user until the sum of input is greater than 100
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int sum=0;
            System.out.print("Enter 1 to execute for loop 2 for while loop 3 for do while loop:");
            int choice=scan.nextInt();
            while(choice>3||choice<1){
                System.out.print("Please enter 1 2 or 3 for respective loops:");
                choice=scan.nextInt();
            }
            if(choice==1){
                for(;sum<=100;){
                    System.out.print("Enter a number:");
                    int num=scan.nextInt();
                    sum=sum+num;
                }
                System.out.println("Done:"+sum);
            }
            //while loop
            else if(choice==2){
                while(sum<=100){
                    System.out.print("Enter a number:");
                    int num=scan.nextInt();
                    sum=sum+num;
                }
                System.out.println("Done:"+sum);
            }
            else {
                do{
                    System.out.print("Enter a number:");
                    int num =scan.nextInt();
                    sum+=num;
                }
                while(sum<=100);
                System.out.println("Done:"+sum);
            }
      
            scan.close();
        }
    }
    
}
