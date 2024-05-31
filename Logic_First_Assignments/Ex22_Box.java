

public class Ex22_Box {
    int length;
    int breadth;
    int height;
    public static int volume(int l,int b,int h){
        return l*b*h;
    }
    int surfaceArea(){
        return 2*length*breadth + 2*breadth*height + 2*height*length; 
    }
    public static void main(String[] args) {
        System.out.println("Volume of the box is "+volume(12,5,9));
        Ex22_Box blackbox=new Ex22_Box();
        blackbox.length=12;
        blackbox.breadth=5;
        blackbox.height=9;
        System.out.println("Surface area of box is "+ blackbox.surfaceArea());


    }
    
}
