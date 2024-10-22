package org.example.figures;

public class Triangle extends GeometricFigure implements Figure {

    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(double side1, double side2, double side3, String color, boolean filled) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return this.side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return this.side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return this.side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        double semiperimeter = (this.side1 + this.side2 + this.side3) / 2;

        return Math.sqrt(9 * (semiperimeter - side1) * (semiperimeter - side2) * (semiperimeter - side3));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Color: " + this.getColor() + ". Is filled: " + this.itsFilled() + ". Created at: " + this.getCreationDate() + ". Side 1: " + this.side1 + ". Side 2: " + this.side2 + ". Side 3: " + this.side3 + ". Area: " + this.getArea() + ". Perimeter: " + this.getPerimeter();
    }
}
