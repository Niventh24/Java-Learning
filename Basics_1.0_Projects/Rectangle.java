package com.Project1;
public class Rectangle {
    private double width;
    private double height;
    
    public Rectangle(){
        this(1.0,1.0);
    }
    public Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }

    public double getArea(){
        return height*width;
    }
    public double getPerimeter(){
        return 2*(width+height);
    }
    public double getWidth(){
        return width;
    }
    public double getheight(){
        return height;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public void setHeight(double height){
        this.height=height;
    }    
}
