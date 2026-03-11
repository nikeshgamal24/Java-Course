package in.kgcoding.challenge77.utils;

import in.kgcoding.challenge77.geometry.Circle;
import in.kgcoding.challenge77.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args){
        Circle cir = new Circle(5.5);
        Rectangle rect = new Rectangle(6, 8);

        double cirArea = Math.PI * Math.pow(cir.radius,2);
        int rectArea  = rect.length * rect.breadth;

        System.out.println("Area of the circle is: " + cirArea);
        System.out.println("Area of the rectangle is: " + rectArea);
    }
}
