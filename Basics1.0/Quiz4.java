import java.util.*;
class Quiz4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        q1(sc);
        q2(sc);
        q3(sc);
        q4(sc);
        q5(sc);
        sc.close();
    }

    private static void q1(Scanner sc) {//ques1-get number 1 by 1 in array and print it
        int [] arr1=new int[5];
        for(int i=0;i<=4;i++){
            System.out.print("Enter number "+i+":");
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<=4;i++){
            System.out.println(arr1[i]);
        }
    }

    private static void q2(Scanner sc) {
        int [] arr1={1,2,3,4,5,6,7,8,9,10};//ques2-print elements in the array
        for(int i=0;i<=9;i++){
            System.out.println("Number "+i+":"+ arr1[i]);
        }
    }

    private static void q3(Scanner sc) {
        for(int i=2;i<100; ){//ques3-print multiples of 2
            System.out.print(i+" ");
            i+=2;
         }
         //or
        // for(int i=1;i<=10;i++){
        //     System.out.println(i+"x2="+i*2);
        // }
    }

    private static void q4(Scanner sc) {
        //ques4-print tables
        System.out.print("Enter Table Number:");
        int table=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(i+"x"+table+"="+i*table);
        }
    }

    private static void q5(Scanner sc) {
        //ques5-get input from user and store values in array and print middle element 
        System.out.print("Enter the size of the array:");
        int size=sc.nextInt();
        int []arr1=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter Number "+i+":");
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.println(arr1[i]);
        }
        int mid=(size/2);
        System.out.println("Middle Element:"+arr1[mid]);
    }
}