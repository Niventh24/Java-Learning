
public class Ex28_AverageOfNumbers {
    public static void main(String[] args) {
        Ex28_AverageOfNumbers avg=new Ex28_AverageOfNumbers();
        System.out.println(avg.average(2,2 ));
        System.out.println(avg.average(3,2,4 ));
        System.out.println(avg.average(2,2 ,6,7));
        System.out.println(avg.average(2,6 ));
    }
    public int average(int a,int b){
        return(a+b)/2;
    }
    public int average(int a,int b,int c){
        return(a+b+c)/2;
    }
    public int average(int a,int b,int c,int d){
        return(a+b+c+d)/2;
    }
    
}
