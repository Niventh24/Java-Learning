import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListEx1 {//sort and create unique array using arraylist class
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the list: ");
        int size=sc.nextInt();
        method1(size,sc);
        method2(size,sc);
        sc.close();
}
    private static void method1(int size, Scanner sc) {
        System.out.println("Method1");
        ArrayList <Integer> n=new ArrayList<>();
        while(true){
            System.out.print("Enter your values:");
            n.add(sc.nextInt());
            if(n.size()==size)
                break;
        }
        Collections.sort(n);
        uniquelist(n);
    }
    private static void uniquelist(ArrayList<Integer> n) {
        for(int i=0;i<n.size()-1;){
            if(n.get(i)==n.get(i+1)){
                n.remove(i+1);
            }else
                i++;
        }
        System.out.println(n);
    }
    private static void method2(int size,Scanner sc) {//method 2
        System.out.println("Method2");
        ArrayList <Integer> n=new ArrayList<>();
        int count=0;
        while(true){
            System.out.print("Enter your values:");
            int temp=sc.nextInt();
            if(!(n.contains(temp))){//print unique elements
                n.add(temp);
                count++;
            }else
                count++;
            if(count==size)
                break;
        }
        Collections.sort(n);  
        System.out.println(n); 
    }
}



