/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

public class App {

    public static int max(int num1, int num2) {
        return (num1 > num2) ? num1 : num2;
    }

    public static int min(int num1, int num2) {
        return (num1 < num2) ? num1 : num2;
    }

    public static void main(String[] args) {
        System.out.printf("El número mayor es %d", max(3, 4));
    }
}
