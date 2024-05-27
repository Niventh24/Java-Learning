import java.util.Scanner;

public class LoopTask1 {//print odd or even numbers in ascending or descending order
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter 1 for ascending order and 2 for descending order: ");
        int scase=sc.nextInt();
        //while
        while(!(scase==1||scase==2)){
            System.out.print("Please enter 1 for ascending order and 2 for descending order: ");
            scase=sc.nextInt();
        }
        //switch case
        switch (scase) {
            //Ascending order
            case 1:{
                int choice1;
                //do while
                do{
                    System.out.print("Please enter 1 to perform for loop and 2 to perform while loop: ");
                    choice1=sc.nextInt();
                }while(!(choice1==1||choice1==2));
                
                System.out.print("Enter Starting number: ");
                int number1=sc.nextInt();
                System.out.print("Enter Ending number: ");
                int number2=sc.nextInt();
                System.out.println();
            
                //for loop
                //if else statement
                if(choice1==1){
                    System.out.println("You chose for loop!");
                    System.out.print("Even numbers: ");   
                    for(int i=number1;i<=number2;i++){
                        System.out.print((i%2==0?i:"")+" ");
                    }
                    System.out.println();
                    System.out.print("Odd numbers: ");
                    for(int i=number1;i<=number2;i++){
                        System.out.print((i%2==1?i:"")+" ");
                    }
                }
                //while loop
                else if(choice1==2){
                    System.out.println("You chose while loop!");
                    int i=number1;
                    System.out.print("Even numbers: ");
                    while(i<=number2){
                        System.out.print((i%2==0?i:"")+" ");
                        i++;
                    }
                    System.out.println();
                    System.out.print("Odd numbers: ");
                    i=number1;
                    while(i<=number2){
                        System.out.print((i%2==1?i:"")+" ");
                        i++;
                    }
                }
                break;
            }
            //Descending order
            case 2:{
                int choice2;
                //do while
                do{
                    System.out.print("Please enter 1 to perform for loop and 2 to perform while loop: ");
                    choice2=sc.nextInt();
                }while(!(choice2==1||choice2==2));
                
                System.out.print("Enter Starting number: ");
                int num=sc.nextInt();
                System.out.print("Enter Ending number: ");
                int num2=sc.nextInt();
                System.out.println();
            
                //for loop
                //if else statement
                if(choice2==1){
                    System.out.println("You chose for loop!");
                    System.out.print("Even numbers: ");   
                    for(int i=num2;i>=num;i--){
                        System.out.print((i%2==0?i:"")+" ");
                    }
                    System.out.println();
                    System.out.print("Odd numbers: ");
                    for(int i=num2;i>=num;i--){
                        System.out.print((i%2==1?i:"")+" ");
                    }
                }
                //while loop
                else if(choice2==2){
                    System.out.println("You chose while loop!");
                    int i=num2;
                    System.out.print("Even numbers: ");
                    while(i>=num){
                        System.out.print((i%2==0?i:"")+" ");
                        i--;
                    }
                    System.out.println();
                    System.out.print("Odd numbers: ");
                    i=num2;
                    while(i>=num){
                        System.out.print((i%2==1?i:"")+" ");
                        i--;
                    }
                }
                break;
            }
            
            default:
                System.out.println("please enter 1 or 2");
                break;
        }

        
    
        sc.close();
    }    
}
