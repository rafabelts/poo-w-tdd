package org.example.figures;

public class Circle extends GeometricFigure implements Figure {

    private double radio;

    public Circle(double radio) {
        this.radio = radio;
    }

    public Circle(double radio, String color, boolean filled) {
        super(
                color,
                filled
        );
        this.radio = radio;
    }

    public double getRadio() {
        return this.radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        return Math.PI * Math.pow(2, this.radio);
    }

    public double getPerimeter() {
        return (2 * Math.PI) * this.radio;
    }

    public double getDiameter() {
        return 2 * this.radio;
    }

    @Override
    public String toString() {
        return "Color: " + this.getColor() + ". Is filled: " + this.itsFilled() + ". Created at: " + this.getCreationDate() + ". Radio: " + this.radio + ". Area: " + this.getArea() + ". Perimeter: " + this.getPerimeter() + ". Diameter: " + this.getDiameter();
    }

}
