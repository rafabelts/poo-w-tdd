package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {

    private String rockPaperScissorsChecker(
        int element,
        String action_if_scissor,
        String action_if_stone,
        String action_if_paper
    ) {
        switch (element) {
            case 0 -> {
                return action_if_scissor;
            }
            case 1 -> {
                return action_if_stone;
            }
            default -> {
                return action_if_paper;
            }
        }
    }

    public void rockPaperScissors() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Tijera (0), piedra(1), papel(2)");

        int user_option = reader.nextInt();
        int element = (int) (Math.random() * 3 + 1);

        switch (user_option) {
            case 0:
                System.out.println(
                    rockPaperScissorsChecker(
                        element,
                        "Empate",
                        "Perdiste",
                        "Ganaste"
                    )
                );
                break;
            case 1:
                System.out.println(
                    rockPaperScissorsChecker(
                        element,
                        "Ganaste",
                        "Empate",
                        "Perdiste"
                    )
                );

                break;
            case 2:
                System.out.println(
                    rockPaperScissorsChecker(
                        element,
                        "Perdiste",
                        "Ganaste",
                        "Empate"
                    )
                );

                break;
            default:
                System.out.println("Esa opción no exite");
                break;
        }
        reader.close();
    }

    public void showNums() {
        Scanner reader = new Scanner(System.in);

        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("Add num: ");
            int num = reader.nextInt();
            nums.add(num);
        }

        Collections.sort(nums);

        for (Integer num : nums) {
            System.out.println(num);
        }
        reader.close();
    }

    public String color() {
        int num = (int) (Math.random() * 7 + 1);
        switch (num) {
            case 1 -> {
                return "violeta";
            }
            case 2 -> {
                return "añil";
            }
            case 3 -> {
                return "azul";
            }
            case 4 -> {
                return "verde";
            }
            case 5 -> {
                return "amarillo";
            }
            case 6 -> {
                return "naranja";
            }
            default -> {
                return "rojo";
            }
        }
    }

    public static void main(String[] args) {
        App app = new App();
        app.rockPaperScissors();
    }
}
