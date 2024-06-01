public class Ex36_Main {
    public static void main(String[] args) {
        // Square s1=new Square(5);
        // System.out.println(s1.area());
        // System.out.println(s1.perimeter());

        // Triangle t1=new Triangle(10, 5, 12);
        // System.out.println(t1.area());
        // System.out.println(t1.perimeter());

        Ex36_Shape[] shapes=new Ex36_Shape[4];
        shapes[0]=new Square(6);
        shapes[1]=new Triangle(10, 5, 12);
        shapes[2]=new Square(6);
        shapes[3]=new Triangle(15, 8, 18);
        
        for(Ex36_Shape i: shapes){
            System.out.println("Area of shapes is: "+i.area());
        }
        System.out.println();
        
        for(Ex36_Shape i: shapes){
            System.out.println("Perimeter of shapes is: "+i.perimeter());
        }
    }
    
}
