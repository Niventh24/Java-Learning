public class Ex18_Pattern {
    public static void main(String[] args) {
        //outer:
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i==2 && j>1 ||i==4 &&j>1 ||i==3 && j>3)
                    continue ;
                    //break;
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
