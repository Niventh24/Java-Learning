import java.util.Scanner;

public class Ex8_Switch_DaysOfWeek {//print days of week using switch
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("*********** Print Days of the week **************");
        System.out.print("Enter a number between 1 and 7: ");
        int num=sc.nextInt();
        sc.close();
        switch(num){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wedday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sundday");
                break;
            default:
                System.out.println("Please enter a valid number between 1 and 7");
        }
    }
}
