package com.homework3;
import java.util.List;

public class Rectangle {
    private double side_a;
    private double side_b;

    public Rectangle(double side_a, double side_b) {
        this.side_a = side_a;
        this.side_b = side_b;
    }

    public List<Double> getRectangleSides() {
        return List.of(side_a, side_b);
    }

    public double getRectanglePerimeter() {
        return (side_a + side_b) * 2;
    }

    public double getRectangleArea() {
        return side_a * side_b;
    }
}
