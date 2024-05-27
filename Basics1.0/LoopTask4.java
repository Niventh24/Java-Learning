import java.util.Scanner;

public class LoopTask4 {//find if the number is prime or not
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1-for loop,2-while loop,3-do while loop:");
        int choice=sc.nextInt();
        while(choice>3||choice<1){
            System.out.print("Please enter 1 2 or 3 for respective loops:");
            choice=sc.nextInt();
        }
        System.out.print("Enter your number: ");
        int num=sc.nextInt();
        boolean ans=true;
        if(num==1){
            System.out.println("Number 1 is neither prime nor composite number");
        }
        else if(num/2==1)
            System.out.println("Number "+num+" is a prime number");
        else{
            int i=2;
            if(choice==1){
                for(;i<=num/2&&ans;i++){
                    if(num%i==0){
                        ans=false;
                        break;
                    }
                }
            }
            else if(choice==2){
                while(i<num/2&&ans){
                    if(num%i==0){
                        ans=false;
                        break;
                    }
                    i++;
                }
            }
            else if(choice==3){
                do{
                    if(num%i==0){
                        ans=false;
                        break;
                    }
                    i++;
                }
                while(i<num/2&&ans);
                
            }
            System.out.println(ans?"Number "+num+" is a prime number":"Number "+num+" is not a prime number");
        }
        sc.close();
        }
    
    }
