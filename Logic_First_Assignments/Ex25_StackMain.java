import java.util.Scanner;

public class Ex25_StackMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the stack: ");
        int size=sc.nextInt();
        Ex25_Stack s1=new Ex25_Stack(size);
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
                    System.out.print("Enter the element to push: ");
                    s1.push(sc.nextInt());
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
