package io.codelex.loops.practice;

import java.util.Scanner;
import java.util.Random;

public class Exercise7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int totalScore = 0;
        boolean continueGame = true;

        System.out.println("Welcome to Piglet!");

        while (continueGame) {
            int dieRoll = random.nextInt(6) + 1;
            System.out.println("You rolled a " + dieRoll);

            if (dieRoll == 1) {
                totalScore = 0;
                continueGame = false;
            } else {
                totalScore += dieRoll;
                System.out.println("Your current score is " + totalScore + ". Do you want to roll again? (y/n)");
                String userInput = scanner.next();

                if (userInput.equalsIgnoreCase("n")) {
                    continueGame = false;
                }
            }
        }

        System.out.println("You got " + totalScore + " points.");
        
    }

}
