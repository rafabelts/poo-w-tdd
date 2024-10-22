package org.example.figures;

public class Rectangle extends GeometricFigure implements Figure {

    private double base;
    private double height;

    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public Rectangle(double base, double height, String color, boolean filled) {
        super(color, filled);
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return this.base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return this.base * this.height;
    }

    public double getPerimeter() {
        return (2 * this.base) + (2 * this.height);
    }

    @Override
    public String toString() {
        return "Color: " + this.getColor() + ". Is filled: " + this.itsFilled() + ". Created at: " + this.getCreationDate() + ". Base: " + this.base + ". Height: " + this.height + ". Area: " + this.getArea() + ". Perimeter: " + this.getPerimeter();
    }

}
