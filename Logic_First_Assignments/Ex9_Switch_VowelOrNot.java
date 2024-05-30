import java.util.Scanner;

public class Ex9_Switch_VowelOrNot {//Print if the alphabet is vowel or not
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("********************* Print vowel or not ************************");
        System.out.print("Enter your alphabet: ");
        char in=sc.next().toLowerCase().charAt(0);
        sc.close();
        switch(in){
            case 'a':
                //System.out.println(in+" is a vowel");
                //break;
            case 'e':
                //System.out.println(in+" is a vowel");
                //break;
            case 'i':
                //System.out.println(in+" is a vowel");
                //break;
            case 'o':
                //System.out.println(in+" is a vowel");
                //break;
            case 'u':
                System.out.println(in+" is a vowel");
                break;
            default:
                System.out.println(in+" is  a consonant");
        }
    }
    
}
