package com.homework3;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        System.out.print("Input radius: ");
        double radius = scan.nextDouble();
        Circle circle1 = new Circle(radius);

        Rectangle rectangle1 = new Rectangle(10, 23);
        Triangle triangle1 = new Triangle(8, 5, 11);

        System.out.println("Rectangle parameters:\n - Sides: " + rectangle1.getRectangleSides() + "\n - Perimeter: " + rectangle1.getRectanglePerimeter() + "\n - Area: " + rectangle1.getRectangleArea() + "\n");

        System.out.println("Triangle parameters:\n - Sides: " + triangle1.getTriangleSides());
        System.out.println(triangle1.checkTriangleExistence());
        System.out.println(" - Perimeter: " + triangle1.getTrianglePerimeter() + "\n - Area: " + triangle1.getTriangleArea() + "\n");

        System.out.println("Circle parameters:\n - Radius: " + circle1.getCircleRadius() + "\n - Perimeter: " + circle1.getCirclePerimeter() + "\n - Area: " + circle1.getCircleArea());
    }
}