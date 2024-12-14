package com.homework3;
import java.util.List;

public class Triangle {
    private double side_a;
    private double side_b;
    private double side_c;
    private double halfPerimeter;

    public List<Double> getTriangleSides() {
        return List.of(side_a, side_b, side_c);
    }

    public Triangle(double side_a, double side_b, double side_c) {
        this.side_a = side_a;
        this.side_b = side_b;
        this.side_c = side_c;
    }

    public double checkTriangleExistence(){
        if ((side_a + side_b <= side_c) || (side_a + side_c <= side_b) || (side_b + side_c <= side_a)){
            throw new RuntimeException("There is no figure with such parameters");
        } else {
            System.out.println(" - There is figure with such parameters");
        }
        return 0;
    }

    public double getTrianglePerimeter(){
        return side_a + side_b + side_c;
    }

    public double getTriangleArea(){
        halfPerimeter = getTrianglePerimeter()/2;
        return Math.sqrt(halfPerimeter*(halfPerimeter-side_a)*(halfPerimeter-side_b)*(halfPerimeter-side_c));
    }

}
