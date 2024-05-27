import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        sc.close();
        pattern1(n);
    }
    //1
// *****
// *****
// *****
// *****
// *****
    public static void pattern1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
//2
// *
// **
// ***
// ****
// *****
public static void pattern2(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}

// *****
// ****
// ***
// **
// *
public static void pattern3(int n){
    for(int i=1;i<=n;i++){
        for(int j=n;j>=i;j--){
            System.out.print("*");
        }
        System.out.println();
    }
}

// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5
public static void pattern4(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j+(" "));
        }
        System.out.println();
    }
}


// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *
public static void pattern5(int n){
    int count=0;
    for(int i=1;i<2*n;i++){       
        count=i<=n?count+1:count-1;
        for(int j=1;j<=count;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}


// 6.   *
//     **
//    ***
//   ****
//  *****
public static void pattern6(int n){
    for(int i=1;i<=n;i++){  
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }    
        for(int k=1;k<=i;k++){
            System.out.print("*");
        }
        System.out.println();
    }
}


//  *****
//   ****
//    ***
//     **
//      *
public static void pattern7(int n){
    for(int i=1;i<=n;i++){  
        for(int j=1;j<i;j++){
            System.out.print(" ");
        }    
        for(int k=1;k<=n-i+1;k++){
            System.out.print("*");
        }
        System.out.println();
    }
}


// 8.  *
//    ***
//   *****
//  *******
// *********
public static void pattern8(int n){
    for(int i=1;i<=n;i++){  
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }    
        for(int k=1;k<=2*i-1;k++){
            System.out.print("*");
        }
        System.out.println();
    }
}


// *********
//  *******
//   *****
//    ***
//     *
public static void pattern9(int n){
    for(int i=1;i<=n;i++){  
        for(int j=1;j<=i-1;j++){
            System.out.print(" ");
        }    
        for(int k=1;k<=2*(n-i)+1;k++){
            System.out.print("*");
        }
        System.out.println();
    }
}

// 10.  *
//     * *
//    * * *
//   * * * *
//  * * * * *
public static void pattern10(int n){
    for(int i=1;i<=n;i++){  
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }    
        for(int k=1;k<=i;k++){
            System.out.print("* ");
        }
        System.out.println();
    }
}

//  * * * * *
//   * * * *
//    * * *
//     * *
//      *
public static void pattern11(int n){
    for(int i=1;i<=n;i++){  
        for(int j=1;j<=i-1;j++){
            System.out.print(" ");
        }    
        for(int k=1;k<=n+1-i;k++){
            System.out.print("* ");
        }
        System.out.println();
    }
}

//  * * * * *
//   * * * *
//    * * *
//     * *
//      *
//      *
//     * *
//    * * *
//   * * * *
//  * * * * *
public static void pattern12(int n){
    int count=0;
    int count2=n+1;
    for(int i=1;i<=2*n;i++){ 
        if(i<=n){
            count+=1;
            count2-=1;
        }else if(i>n+1){
            count-=1; 
            count2+=1;
        }
        for(int j=1;j<count;j++){   
            System.out.print(" ");
        }    
        for(int k=1;k<=count2;k++){  
            System.out.print("* ");
        }
        System.out.println();
    }
}

// 13.  *
//     * *
//    *   *
//   *     *
//  *********
public static void pattern13(int n){
    for(int i=1;i<=n;i++){  
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }    
        for(int k=1;k<=2*i-1;k++){
            if(k==1||k==2*i-1||i==n){
            System.out.print("*");
            }else
                System.out.print(" ");
        }
        System.out.println();
    }
}

//  *********
//   *     *
//    *   *
//     * *
//      *
public static void pattern14(int n){
    for(int i=1;i<=n;i++){  
        for(int j=1;j<=i-1;j++){
            System.out.print(" ");
        }    
        for(int k=1;k<=2*(n-i)+1;k++){
            if(k==1||k==2*(n-i)+1||i==1)
                System.out.print("*");
                else
                    System.out.print(" ");
        }
        System.out.println();
    }
}

// 15.  *
//     * *
//    *   *
//   *     *
//  *       *
//   *     *
//    *   *
//     * *
//      *
public static void pattern15(int n){
    int count1=n+1;
    int count2=0;
    for(int i=1;i<=2*n-1;i++){ 
        if(i<=n) {
            count1-=1;
            count2+=1;
        }
        else{
            count2-=1;
            count1+=1;
        }
        for(int j=1;j<count1;j++){
            System.out.print(" ");
        }    
        for(int k=1;k<=2*count2-1;k++){
            if(k==1||k==2*count2-1){
            System.out.print("*");
            }else
                System.out.print(" ");
        }
        System.out.println();
    }
}
//           1
//         1   1
//       1   2   1
//     1   3   3   1
//   1   4   6   4   1
public static void pattern16(int n){  
    for(int i=1;i<=n;i++){  
        for(int j=1;j<=n-i;j++){
            System.out.print("  ");
        } 
        int sum=1;   
        for(int k=1;k<=i;k++){
            System.out.print(sum+"   ");
            sum=sum*(i - k) / k;
        }
        System.out.println();
    }
}

// 17.  1
//     212
//    32123
//   4321234
//    32123
//     212
//      1
public static void pattern17(int n){
    int count1=n;
    int value=0;
    for(int i=1;i<=2*n-1;i++){ 
        if(i<=n){
            count1-=1;
            value+=1;
        }else{
            value-=1;
            count1+=1;
        }
        for(int j=1;j<=count1;j++){
            System.out.print(" ");
        }   
        for(int k=value;k>=1;k--){
            System.out.print(k);
        }
        for(int l=2;l<=value;l++)
            System.out.print(l);
        System.out.println();
    }
}

//   **********
//   ****  ****
//   ***    ***
//   **      **
//   *        *
//   *        *
//   **      **
//   ***    ***
//   ****  ****
//   **********
public static void pattern18(int n){
    int count1=n+1;
    for(int i=1;i<=2*n;i++){
        if(i<=n){
            count1-=1;
        }else if(i>n+1){
            count1+=1;
        }
        for(int j=1;j<=count1;j++){
            System.out.print("*");
        }
        for(int k=1;k<=2*(n-count1);k++){
            System.out.print(" ");
        }
        for(int j=1;j<=count1;j++){
            System.out.print("*");
        }
    
        System.out.println();
    }
}

//    *        *
//    **      **
//    ***    ***
//    ****  ****
//    **********
//    ****  ****
//    ***    ***
//    **      **
//    *        *
public static void pattern19(int n){
    int count1=0;
    for(int i=1;i<=2*n;i++){ 
        if(i<=5){
            count1+=1;
        }
        else{
            count1-=1; 
        }
        for(int j=1;j<=count1;j++){
            System.out.print("*");
        }    
        for(int k=1;k<=2*(n-count1);k++){
            System.out.print(" ");
        }
        for(int j=1;j<=count1;j++){
            System.out.print("*");
        }  
        System.out.println();
    }
}

// 20 ****
//    *  *
//    *  *
//    *  *
//    ****
public static void pattern20(int n){
    for(int i=1;i<=n;i++){     
        for(int k=1;k<=n-1;k++){
            if(i==1||i==n||k==1||k==n-1)
                System.out.print("*");
            else
                System.out.print(" ");
        }
        System.out.println();
    }
}
//    1
//    2  3
//    4  5  6
//    7  8  9  10
//    11 12 13 14 15
public static void pattern21(int n){
    int sum=0;
    for(int i=1;i<=n;i++){     
        for(int k=1;k<=i;k++){
            sum+=1;
            System.out.print(sum+" ");
        }
        System.out.println();
    }
}
//    1
//    0 1
//    1 0 1
//    0 1 0 1
//    1 0 1 0 1
public static void pattern22(int n){
    int val;
    for(int i=1;i<=n;i++){  
        val=(i%2==0)?(val=0):(val=1);
        for(int j=1;j<=i;j++){
            System.out.print(val+" ");
            val=(val==1)?(val=0):(val=1);    
        }    
        System.out.println();
    }
}
//   *     *
//  * *   * *
// *   * *   *
public static void pattern23(int n) {
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= (n - i); j++) {
            System.out.print(" ");
        }
        for (int j = 1; j <= (2 * i - 1); j++) {
            if (j == 1 || j == (2 * i - 1)) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        for (int j = 1; j <= (2 * (n - i) + 1); j++) {
            System.out.print(" ");
        }
        for (int j = 1; j <= (2 * i - 1); j++) {
            if (j == 1 || j == (2 * i - 1)) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}


//    *        *
//    **      **
//    * *    * *
//    *  *  *  *
//    *   **   *
//    *   **   *
//    *  *  *  *
//    * *    * *
//    **      **
//    *        *
public static void pattern24(int n){
    int value1=0;
    for(int i=1;i<=2*n;i++){ 
        if(i<=5){
            value1+=1;
        }
        else if(i>6){
            value1-=1;
        }//left
        for(int j=1;j<=value1;j++){
            if(j==1||j==value1)
                System.out.print("*");
            else
                System.out.print(" ");
        }  //space  
        for(int k=1;k<=2*(n-value1);k++){
            System.out.print(" ");
        }//right
        for(int j=1;j<=value1;j++){
            if(j==1||j==value1)
                System.out.print("*");
            else
                System.out.print(" ");
        }       
        System.out.println();
    }
}
//       *****
//      *   *
//     *   *
//    *   *
//   *****
public static void pattern25(int n){
    for(int i=1;i<=n;i++){  
        for(int k=1;k<=n-i;k++){
            System.out.print(" ");
        }
        for(int j=1;j<=n;j++){
            if(i==1||i==n){
                System.out.print("*");
            }
            else if(j==1||j==n){
                System.out.print("*");
            }
            else
                System.out.print(" ");
        }
        System.out.println();
    }
}
//   1 1 1 1 1 1
//   2 2 2 2 2
//   3 3 3 3
//   4 4 4
//   5 5
//   6
public static void pattern26(int n){
    for(int i=1;i<=n;i++){  
        for(int j=1;j<=n-i+1;j++){
            System.out.print(i+" ");
        }   
        System.out.println();
    }
}
//   1 2 3 4  17 18 19 20
//     5 6 7  14 15 16
//       8 9  12 13
//         10 11
public static void pattern27(int n){
    int end=n*(n+1)+1;
    int sum=1;
    int sum2=1;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i-1;j++){
            System.out.print("  ");
        }  
        for(int j=1;j<=n-i+1;j++){
            System.out.print(sum+(" "));
            sum++;
        }
        System.out.print(" ");
        end=end-(n-i+1);
        sum2=end;
        for(int j=1;j<=n-i+1;j++){
            System.out.print(sum2+(" "));
            sum2++;
        }
        System.out.println();
    }
}
//      *
//     * *
//    * * *
//   * * * *
//  * * * * *
//   * * * *
//    * * *
//     * *
//      *
public static void pattern28(int n){
    int count1=n;
    for(int i=1;i<=2*n-1;i++){
        if(i<=5){
            count1-=1;
        }  
        else{
            count1+=1; 
        }
        for(int j=1;j<=count1;j++){
            System.out.print(" ");
        }    
        for(int k=1;k<=n-count1;k++){
            System.out.print("* ");
        }
        System.out.println();
    }
}
//      
//    *        *
//    **      **
//    ***    ***
//    ****  ****
//    **********
//    ****  ****
//    ***    ***
//    **      **
//    *        *
public static void pattern29(int n){
    int count1=0;
    for(int i=1;i<=2*n-1;i++){
        if(i<=n){
            count1+=1;
        }
        else{
            count1-=1;
        }  
        for(int j=1;j<=count1;j++){
            System.out.print("*");
        }    
        for(int k=1;k<=2*(n-count1);k++){
            System.out.print(" ");
        }
        for(int j=1;j<=count1;j++){
            System.out.print("*");
        } 
        System.out.println();
    }
}
//         1
//       2 1 2
//     3 2 1 2 3
//   4 3 2 1 2 3 4
// 5 4 3 2 1 2 3 4 5

public static void pattern30(int n){
    for(int i=1;i<=n;i++){  
        for(int j=1;j<=2*(n-i);j++){
            System.out.print(" ");
        }    
        for(int k=1;k<=i;k++){
            System.out.print(i-k+1+" ");
        }
        for(int k=2;k<=i;k++){
            System.out.print(k+" ");
        }
        System.out.println();
    }
}
//      4 4 4 4 4 4 4  
//      4 3 3 3 3 3 4   
//      4 3 2 2 2 3 4   
//      4 3 2 1 2 3 4   
//      4 3 2 2 2 3 4   
//      4 3 3 3 3 3 4   
//      4 4 4 4 4 4 4 
public static void pattern31(int n){
    n=4;
    int min;
    for(int i=1;i<=2*n-1;i++){  
        for(int j=1;j<=2*n-1;j++){
            min=(n+1)-(Math.min(Math.min(i,j),Math.min((2*n)-j,(2*n)-i)));
            System.out.print(min+" ");
        }
        System.out.println();
    }
}
// 1 1 1 1 1 1 1 
// 1 2 2 2 2 2 1
// 1 2 3 3 3 2 1
// 1 2 3 4 3 2 1
// 1 2 3 3 3 2 1
// 1 2 2 2 2 2 1
// 1 1 1 1 1 1 1
public static void pattern32(int n){
    int min;
    for(int i=1;i<=2*n-1;i++){  
        for(int j=1;j<=2*n-1;j++){
            min=Math.min(Math.min(i,j),Math.min((2*n)-j,(2*n)-i));
            System.out.print(min+" ");
        }
        System.out.println();
    }
}
//    E
//    D E
//    C D E
//    B C D E
//    A B C D E
public static void pattern33(int n){
    char txt='E';
    for(int i=1;i<=n;i++){ 
        int val=txt+1; 
        val-=i;
        for(int j=1;j<=i;j++){
            System.out.print((char)val+" ");
            val++;
        }    
        System.out.println();
    }
}
//    a
//    B c
//    D e F
//    g H i J
//    k L m N o
public static void pattern34(int n){
    char txt='a';
    int val=txt;
    int val2=txt;
    for(int i=1;i<=n;i++){ 
        for(int j=1;j<=i;j++){
            val2=val; 
            if(val%2==0){
                val2-=32;
                val++;
                System.out.print((char)val2+" ");
            }else{
                System.out.print((char)val+" ");
                val++;
            }   
        }    
        System.out.println();
    }
}
//    E D C B A
//    D C B A
//    C B A
//    B A
//    A
public static void pattern35(int n){
    char txt='E';
    int val=txt;
    int val2=txt;
    for(int i=1;i<=n;i++){ 
        for(int j=1;j<=n-i+1;j++){
            System.out.print((char)val+" ");
            val--;
        }
        val=val2-i;     
        System.out.println();
    }
}  
//    1      1
//    12    21
//    123  321
//    12344321
public static void pattern36(int n){
    int val;
    for(int i=1;i<=n;i++){  
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }    
        for(int k=1;k<=2*(n-i);k++){
            System.out.print(" ");
        }
        val=i;
        for(int j=1;j<=i;j++){
            System.out.print(val);
            val--;
        } 
        System.out.println();
    }
}
}