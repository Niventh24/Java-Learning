public class Ex17_NumDivBy4And6 {
    public static void main(String[] args) {//numbers between 1 and 10 expect numbers divisible by 4 and 6
        System.out.println("The numbers less than 100 and not divisible by 4  and 6 are:");
        for(int i=1;i<=100;i++){
            if(i%4==0 && i%6==0)
                continue;
            System.out.print(i+" ");
        }
    }
}
