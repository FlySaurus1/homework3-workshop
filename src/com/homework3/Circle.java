package com.homework3;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getCircleRadius(){
        return radius;
    }

    public double getCirclePerimeter(){
        return radius*2*Math.PI;
    }

    public double getCircleArea(){
        return Math.PI*radius*radius;
    }
}
