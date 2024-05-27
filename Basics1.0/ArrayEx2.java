import java.util.*;
public class ArrayEx2 {//to fill and print sum,product and average of array
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array(1-20): ");
        int n=sc.nextInt();
        while(n<=0||n>20){
            System.out.print("Please enter the size of the array between(1-20): ");
            n=sc.nextInt();
        }
        int[] arr1=new int[n];
        fillArray(sc,arr1);
        printArray(arr1);
        calc(arr1);
        sc.close();
    }
    private static void calc(int[] arr1) {
        int sum=0;
        int product=1;
        for(int i=0;i<arr1.length;i++){
            sum+=arr1[i];
            product*=arr1[i];
        }
        double average=sum/arr1.length;
        System.out.println("The sum of the array is "+sum);
        System.out.println();
        System.out.println("The product of the array is "+product);
        System.out.println();
        System.out.println("The average of the array is "+average);
        System.out.println();
    }
    private static void printArray(int[] arr1) {
        System.out.println();
        System.out.println("The elements are "+Arrays.toString(arr1));
        System.out.println();
    }
    public static void fillArray(Scanner sc,int[]arr1){
        for(int i=0;i<arr1.length;i++){
            System.out.print("Enter value of arr["+(i+1) +"]: ");
            arr1[i]=sc.nextInt();
        }
    }

    
}
