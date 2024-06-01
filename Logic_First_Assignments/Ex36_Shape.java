abstract class Ex36_Shape {
    public abstract double area();
    public abstract double perimeter();
    
}
class Square extends Ex36_Shape{
    private double side;
    public Square(double side){
        this.side=side;
    }
    public double area(){
        return side*side;
    }
    public double perimeter(){
        return 4*side;
    }

}
class Triangle extends Ex36_Shape{
    private double length;
    private double breadth;
    private double height;

    public Triangle(double length,double breadth,double height){
        this.length=length;
        this.breadth=breadth;
        this.height=height;
    }
    public double area(){
        return 0.5*length*breadth;
    }

    public double perimeter(){
        return length+breadth+height;
    }
    
}
