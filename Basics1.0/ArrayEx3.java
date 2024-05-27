import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {//check the occurence of integers in an array
        int[] arr1={1,1,1,2,3,4,2,5};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n=sc.nextInt();
        sc.close();
        getNumOccur(n,arr1);
        
    }

    private static void getNumOccur(int n, int[] arr1) {
        int count=0;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]==n){
                count++;
            }
        }
        System.out.println("The number "+n+" occured "+count+" times.");
    }   
}
