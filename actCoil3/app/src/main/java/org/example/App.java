package org.example;

import java.util.Scanner;
import java.util.logging.Logger;

import org.example.figures.Figure;
import org.example.figures.FigureFactory;

public class App {

    static final Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        String color = "white";

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                logger.info("--- Menú de opciones ---\n1) Círculo\n2) Rectángulo\n3) Triángulo\n4) Salir ");
                int option = scanner.nextInt();

                if (option == 4) {
                    logger.info("Bye bye");
                    break;
                }

                logger.info("Se conoce el color de la figura?\n1) Si\n2) No");
                int kColor = scanner.nextInt();

                if (kColor == 1) {
                    logger.info("Ingresa el color: ");
                    color = scanner.next();
                }

                logger.info("La figura esta rellena?\n1) Si\n2) No");
                int isFilled = scanner.nextInt();

                Figure figure = FigureFactory.createFigure(logger, option, scanner, color, (isFilled == 1));

                logger.info(figure.toString());

            }
        }

    }

}
