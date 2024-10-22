package org.example.figures;

import java.util.Scanner;
import java.util.logging.Logger;

public class FigureFactory {

    /*
     Patron de diseño fabrica para la creacion de las figuras, las figuras tienen que satisfacer
     la interfaz shape, es decir, deben tener la funcion toString, getArea y getPerimeter 
     */
    public static Figure createFigure(Logger logger, int option, Scanner scanner, String color, boolean isFilled) {

        switch (option) {
            case 1 -> {
                logger.info("Ingresa el radio del círculo: ");
                double radius = scanner.nextDouble();

                return new Circle(radius, color, isFilled);
            }

            case 2 -> {
                logger.info("Ingresa la base del rectángulo:");
                double base = scanner.nextDouble();

                logger.info("Ingresa la altura del rectángulo:");
                double height = scanner.nextDouble();

                return new Rectangle(base, height, color, isFilled);
            }

            case 3 -> {
                double[] sides = new double[3];

                for (int i = 0; i < 3; i++) {
                    logger.info("Ingresa el lado " + (i + 1) + " :");
                    sides[i] = scanner.nextDouble();
                }

                return new Triangle(sides[0], sides[1], sides[2], color, isFilled);
            }

            default ->
                throw new AssertionError();
        }

    }

}
