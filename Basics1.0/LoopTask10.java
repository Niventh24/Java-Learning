import java.util.Scanner;

public class LoopTask10 {
    public static void main(String[] args) {//find if the string is palendrome
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your String: ");
        String inp=sc.nextLine();
        boolean palen=true;
        for(int i=0,j=inp.length()-1;i<j;i++,j--){
            if(inp.charAt(i)==(inp.charAt(j))){
                continue;
            }
            palen=false;
            break;
        }           
        System.out.println(palen?"The given String "+inp+" is a palindrome":"The given string "+inp+" is not a palindrome");
        sc.close();
    }
    
}
