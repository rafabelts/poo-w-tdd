package org.example;

public class Circle {

    final double radius;

    static int numObjects = 0;

    Circle() {
        this.radius = 1;
        numObjects++;
    }

    Circle(double radius) {
        this.radius = radius;
        numObjects++;
    }

}
