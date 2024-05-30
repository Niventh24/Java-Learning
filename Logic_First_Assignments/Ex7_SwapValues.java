public class Ex7_SwapValues {
    public static void main(String[] args) {//swap values
        int a=10;
        int b=5;
        System.out.println("value before swapping");
        System.out.println("value of a: "+a+" "+"value of b: "+b);
        System.out.println();
        swapWithThirdVariable(a,b);
        swapWithoutThirdVariableUsingXor(a,b);
        swapWithoutThirdVariableUsingAddAndSubract(a,b);
    }

    private static void swapWithoutThirdVariableUsingAddAndSubract(int a, int b) {
        System.out.println("Swap Without Third Variable Using Addiction And Subraction");
         a=(a+b);
         b=(a-b);
         a=(a-b);
         System.out.println("value of a: "+a+" "+"value of b: "+b);
         System.out.println();
    }

    private static void swapWithoutThirdVariableUsingXor(int a, int b) {
        System.out.println("Swap Without Third Variable using Xor");
         a=(a^b);
         b=(a^b);
         a=(a^b);
         System.out.println("value of a: "+a+" "+"value of b: "+b);
         System.out.println();
    }

    private static void swapWithThirdVariable(int a, int b) {
        System.out.println("Swap With Third Variable");
        int c=a;
         a=b;
         b=c;
         System.out.println("value of a: "+a+" "+"value of b: "+b);
         System.out.println();
    }
    
}
