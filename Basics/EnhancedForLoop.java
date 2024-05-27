package Basics;
public class EnhancedForLoop {
    public static void main(String[] args) {//print array elements using enhanced for loop
        int [] arr1={5,2,2,0};
        int i=0;
        for(int loop:arr1){
            System.out.println(loop+" "+i);
            i++;
        }
    }
    
}
