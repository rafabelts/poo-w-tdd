/*

    Elabora un programa que implemente un metodo:

   metodo llamado printFinalGrade e invocar desde main

   Debe retornar valores de acuerdo a lo siguiente

   < 6
   6 < 8: regular
   8 < 9: Bien
   9 > : Excelente


*/
package org.example;

public class App {

    public static String printFinalGrade(double calificacion) {
        String message;

        if (calificacion < 6) {
            message = "Mal";
        } else if (calificacion > 6 && calificacion < 8) {
            message = "Regular";
        } else if (calificacion >= 8 && calificacion < 9) {
            message = "Bien";
        } else if (calificacion >= 9 && calificacion <= 10) {
            message = "Excelente";
        } else {
            message = "Calificacion fuera de rango";
        }

        return message;
    }

    public static void main(String[] args) {
        System.out.println(printFinalGrade(8.5));
    }
}
