import java.util.Scanner;

// public class Task9 {//print reverse of a string
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter your String: ");
//         String inp=sc.nextLine();
//         System.out.print("Reversed string: ");
//         for(int i=inp.length()-1;i>=0;i--){
//             System.out.print(inp.charAt(i) );
//         }
        
//         sc.close();
//     }
    
// }
public class LoopTask9{//print string using reverse variable
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String reverse="";
        System.out.print("Enter your String: ");
        String inp=sc.nextLine();
        for(int i=inp.length()-1;i>=0;i--){
            reverse+=inp.charAt(i)+" "; 
        }
        System.out.println("Reversed String: "+reverse);
        sc.close();
    }
}
