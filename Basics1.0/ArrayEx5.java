import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {//print odd number first and even numbers at the last in an array
        Scanner sc=new Scanner(System.in);
        int size=size(sc);
        while(size<1||size>20){
            size=size(sc);
        }
        int[] arr1=new int[size];
        array(sc,arr1);
        arrayOperation(arr1);
    }
    private static int size(Scanner sc) {
        System.out.print("Enter the size of the array(1-20):");
        int s=sc.nextInt();
        return s;
    }

    private static void array(Scanner sc,int[] arr1) { 
        for(int i=0;i<arr1.length;i++){
            System.out.print("Enter the value of array["+i+"]: ");
            arr1[i]=sc.nextInt();
        }
    }

    private static void arrayOperation(int[] arr) {
        int[] arr2=new int[arr.length];
        int j=0;int k=arr.length-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                arr2[k--]=arr[i];
            }else
                arr2[j++]=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=arr2[i];
        }print(arr);
    }

    private static void print(int[] arr) {
        System.out.println("Elements of the array are "+Arrays.toString(arr));
    }
    
}
