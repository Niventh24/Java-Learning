import java.util.Scanner;

public class LoopTask3 {//print the strict divisors of a number and the sum of strict divisors
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter 1-for loop,2-while loop,3-do while loop:");
            int choice=sc.nextInt();
            while(choice>3||choice<1){
                System.out.print("Please enter 1 2 or 3 for respective loops:");
                choice=sc.nextInt();
            }
            System.out.print("Enter your number: ");
            int num=sc.nextInt();
            sc.close();
            int sum=0;int i=1;
            System.out.print("The divisors of the number are ");
            if(choice==1){
                for(;i<num/2;i++){
                   if(num%i==0){
                    System.out.print(i+" ");
                    sum+=i;
                   }
                }
            }
            else if(choice==2){
                while(i<num/2){
                    if(num%i==0){
                        System.out.print(i+" ");
                        sum+=i;
                       }
                       i++;
                }
            }
            else if(choice==3){  
                do{
                    if(num%i==0){
                        System.out.print(i+" ");
                        sum+=i;
                       }
                       i++;
                }
                while(i<num/2);
            }
            System.out.println();
            System.out.println("The sum of divisors is "+sum);

            
            sc.close();
        
    }
    
}
