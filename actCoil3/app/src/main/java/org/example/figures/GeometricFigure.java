package org.example.figures;

import java.util.Date;

class GeometricFigure {

    private String color;
    private boolean filled;
    private final Date creationDate;

    public GeometricFigure() {
        this.color = "white";
        this.creationDate = new Date();
    }

    public GeometricFigure(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.creationDate = new Date();
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;

    }

    public boolean itsFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getCreationDate() {
        return this.creationDate;
    }

    @Override
    public String toString() {
        return "Color: " + this.color + ". Is filled: " + this.filled + ". Created at: " + this.creationDate;
    }
}
