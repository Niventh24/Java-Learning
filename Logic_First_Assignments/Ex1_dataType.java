import java.util.Scanner;

public class Ex1_dataType {//scan and get every type of data
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int i=sc.nextInt();
       char c= sc.next().charAt(0);
        byte b=sc.nextByte();
        short sh=sc.nextShort();
        long l=sc.nextLong();
        float f=sc.nextFloat();
        double d=sc.nextDouble();
        boolean bl=sc.nextBoolean();
        System.out.println(s+i+c+b+sh+l+f+d+bl);
        sc.close();
    }
    
}
