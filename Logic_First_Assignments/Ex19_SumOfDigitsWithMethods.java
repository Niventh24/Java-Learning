

public class Ex19_SumOfDigitsWithMethods {///print sum using methods

    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static int sum(int a,int b,int c,int d){
        return a+b+c+d;
    }
    public static void main(String[] args) {
        System.out.println("The sum of values are: "+sum(4, 06));
        System.out.println("The sum of values are: "+sum(5, 07,5,7));
        System.out.println("The sum of values are: "+sum(1, 05,5));
        System.out.println("The sum of values are: "+sum(4, 9,7,8));
        System.out.println("The sum of values are: "+sum(3, 8,6));
        System.out.println("The sum of values are: "+sum(3, 8));
    }
    
}
