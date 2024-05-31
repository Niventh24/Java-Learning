import java.util.Scanner;

public class Ex27_QueueMain {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the queue: ");
        int size=sc.nextInt();
        Ex27_Queue s1=new Ex27_Queue(size);
        int choice=0;
        while(choice!=4){
            System.out.println("Press 1 to Enqueue element");
            System.out.println("Press 2 to Dequeue element");
            System.out.println("Press 3 to display the stack");
            System.out.println("Press 4 to exit");
            System.out.print("Enter your choice:");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter the element to enqueue: ");
                    s1.enqueue(sc.nextInt());
                    break;
                case 2:
                    s1.dequeue();
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
