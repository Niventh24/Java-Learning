
class NestedForLoop{
    public static void main(String args[]){
        System.out.println("Pattern1");
        for(int i=1;i<=3;i++){//pattern1
            for(int j=1;j<=3;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //ques2
        System.out.println("Pattern2");
        for(int i=1;i<=3;i++){//pattern2
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}