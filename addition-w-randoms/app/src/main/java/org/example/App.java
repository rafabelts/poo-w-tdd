/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

import java.io.InputStream;
import java.util.Scanner;

class GetRandom implements TimeInMillis {

    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}

public class App {

    TimeInMillis random1;
    TimeInMillis random2;

    App(TimeInMillis r1, TimeInMillis r2) {
        this.random1 = r1;
        this.random2 = r2;
    }

    String getAnswer() {
        int num1 = (int) (this.random1.currentTimeMillis() % 10); // Cast as int
        int num2 = (int) (this.random2.currentTimeMillis() % 10);

        System.out.println("Add num: ");
        Scanner scn = new Scanner(System.in);
        int answer = scn.nextInt();

        int sum = num1 + num2;

        scn.close();
        if (answer == sum) {
            return "Le atinaste a la suma!";
        }

        return "No le atinaste la respuesta era: " + sum;
    }

    public static void main(String[] args) {
        App app = new App(new GetRandom(), new GetRandom());

        System.out.println(app.getAnswer());
    }
}
