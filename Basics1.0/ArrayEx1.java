import java.util.Arrays;
import java.util.Scanner;
import java.awt.Point;

public class ArrayEx1 { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1 for Integer operation and 2 for Point operation: ");
        int n=sc.nextInt();
        System.out.print("Enter the value of N(1-20): ");
        int num=sc.nextInt();
        while(true){
            if(num<=0||num>20){
                System.out.print("Please enter the value of N(1-20): ");
                num=sc.nextInt();
            }else{
                break;
            }
        }
        if(n==1){
            ArrayClass arr1=new ArrayClass();
            arr1.array(num,sc);
        }else if(n==2){
            PointsClass point=new PointsClass();
            point.point(num,sc);  
        }else
            System.out.println("Please enter a valid number");      
    }     
}

class PointsClass {
    public void point(int num,Scanner sc) {//getting input for array values and printing them(points)
        Point[] p=new Point[num];
        loop(p,sc);
        print(p);
    }    
    public static void print(Point[] array) {
        System.out.print("The elements are ");
        for(int i=0;i<array.length;i++){
            System.out.print("(" + array[i].x +", " + array[i].y + ")");
        }
    }
    public static void loop(Point []num,Scanner sc){
        for(int i=0;i<num.length;i++){
            System.out.print("Enter value of x and y for point array["+(i+1) +"]: ");
            num[i]=new Point(sc.nextInt(),sc.nextInt());
        }
    }
}
class ArrayClass{//to fill and print array for integer array
    public void array(int num,Scanner sc){
        int[] array=new int[num];
        loop(array,sc);
        print(array);
    }
    public static void print(int[] array) {
        System.out.print("The elements are "+Arrays.toString(array));
    }
    public static void loop(int []num,Scanner sc){
        for(int i=0;i<num.length;i++){
            System.out.print("Enter value of arr["+(i+1) +"]: ");
            num[i]=sc.nextInt();
        }
    }
}
