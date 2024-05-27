import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {//find max and min integer in an array
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();
        int[] arr1=new int[n];
        getNumbers(arr1,sc);
        sc.close();
        calcMin(arr1);
    }

    private static void calcMin(int[] arr1) {
        int min=arr1[0];
        int max=arr1[0];
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>max){
                max=arr1[i];
            }
            else if(arr1[i]<min){
                min=arr1[i];
            }
        }
        System.out.println();
       System.out.println("Maximum number is "+max);
       System.out.println();
       System.out.println("Minimum number is "+min); 
    }

    private static void getNumbers(int[] arr1, Scanner sc) {       
        for(int i=0;i<arr1.length;i++){
            System.out.print("Enter the value of array["+i+"]: ");
            arr1[i]=sc.nextInt();
        }
    }

  
    
}
