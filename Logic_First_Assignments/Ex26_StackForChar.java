import java.util.Scanner;

public class Ex26_StackForChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the stack: ");
        int size=sc.nextInt();
        Stack s1=new Stack(size);
        int choice=0;
        while(choice!=4){
            System.out.println("Press 1 to push element");
            System.out.println("Press 2 to pop element");
            System.out.println("Press 3 to display the stack");
            System.out.println("Press 4 to exit");
            System.out.print("Enter your choice:");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter the character to push: ");
                    s1.push(sc.next().charAt(0));
                    break;
                case 2:
                    s1.pop();
                    break;
                case 3:
                    s1.display();
                    break;
                case 4:
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Please enter a valid choice ");
                    System.out.println();
            }
        }
        sc.close();
    }
}

class Stack {
    private int size;
    private char [] arr1;
    private int tos;

    public Stack(int size){
        this.size=size;
        arr1=new char[size];
        tos= -1;
    }
    
    public void push(char a){
        if(tos==size-1){
            System.out.println("Stack is full!");
        }
        else{
            arr1[++tos]=a;
            System.out.println(a+" is pushed into the stack");
        }
    }

    public void pop(){
        if(tos>=0){
            System.out.println(arr1[tos--]+" is popped");
            arr1[tos+1]=0;
        }else{
            System.out.println("Stack is empty!");
        }
    }

    public void display(){
        System.out.print("The characters in the stack are ");
        for(char i:arr1){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}