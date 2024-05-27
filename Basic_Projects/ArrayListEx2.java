import java.util.*;

public class ArrayListEx2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice=0;
        ArrayList <Integer> num=new ArrayList <>();
        while(choice!=4){
            System.out.println("1.Add Element");
            System.out.println("2.Remove Element");
            System.out.println("3.Display Element");
            System.out.println("4.Exit");
            System.out.print("Enter your choice: ");
            choice=sc.nextInt();
            System.out.println();
            switch (choice) {
                case 1:{
                    addElement(num,sc);
                    System.out.println();
                    break;
                }
                case 2:{
                    removeElement(num,sc);
                    System.out.println();
                    break;
                }
                case 3:{
                    DisplayElement(num);
                    System.out.println();
                    break;
                }
                case 4:{
                    System.out.println("Good Bye! Have a nice day.");
                    break;
                }
                default:
                    System.out.println("Enter your choice between 1 and 4.");
                    System.out.println();
            }
        }sc.close();

    }

    private static void DisplayElement(ArrayList<Integer> num) {
        System.out.println("The elements in array list are "+num);
    }

    private static void removeElement(ArrayList<Integer> num,Scanner sc) {
        System.out.print("Enter the element to remove: ");
        int temp=sc.nextInt();
        if(num.contains(temp)){
            num.remove(num.indexOf(temp));
            System.out.println("Element removed successfully!");
        }
        else{
            System.out.println("Element not found!");
        }
        
    }

    private static void addElement(ArrayList<Integer> num,Scanner sc) {
        System.out.print("Enter the element to add: ");
        num.add(sc.nextInt());
        System.out.println("Element is added successfully!");
    }
    
}
