// Create a Circle class that has a private member data of radius and 
// 3 public member functions:
// - setRadius()
// - getRadius() 
// - getArea() 

package com.tertiaryinfotech.day_1.challenges;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        Circle c = new Circle(8.0);
        System.out.printf("Area of Circle: %.2f\n", c.getArea());
    }
}