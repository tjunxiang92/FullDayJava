// Write a java class with 2 methods to compute the area of the rectangle with 2 arguments (side a and side b) and 1 argument (side a)
// Method 1:			Area = a *b  
// Method 2:			Area = a*a 

package com.tertiaryinfotech.day_1.challenges;

public class Rectangle {
    public static double areaofrect(double a, double b) {
        return a * b;
    }

    public static double areaofrect(double a) {
        return a * a;
    }

    public static void main(String[] args) {
        double area;

        area = areaofrect(4, 5);
        System.out.println(area);

        area = areaofrect(6);
        System.out.println(area);
    }
}