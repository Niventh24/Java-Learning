package com.Project1;
import java.awt.*;
public class circle {
    Point center;
    double radius;

    circle(){}
    circle(Point initialCenter,double initialRadius){
        center=initialCenter;
        radius=initialRadius;
    }
    double getArea(){
        double Area=Math.PI*radius*radius;
        return Area;
    }
    double getPerimeter(){
        double Perimeter=2*Math.PI*radius;
        return Perimeter;
    }
    void setRadius(double radius){
        this.radius=radius;
    }
    void setCenter(Point center){
        this.center=center;
    }

    
}
