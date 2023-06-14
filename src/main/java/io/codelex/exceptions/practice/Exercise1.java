package io.codelex.exceptions.practice;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        String userInput;
        int numerator = 0, divisor;

        while (true) {
            try {
                System.out.println("Enter the numerator:");
                userInput = scanner.nextLine().trim();

                // Check if the user wants to quit
                if (userInput.equalsIgnoreCase("q") || userInput.equalsIgnoreCase("quit")) {
                    break;
                }

                // Parse numerator
                numerator = Integer.parseInt(userInput);

                System.out.println("Enter the divisor:");
                userInput = scanner.nextLine().trim();
                divisor = Integer.parseInt(userInput);

                // Perform division and print the result
                int result = numerator / divisor;
                System.out.println(numerator + " / " + divisor + " = " + result);
            } catch (ArithmeticException e) {
                System.out.println("You can't divide " + numerator + " by 0");
            } catch (NumberFormatException e) {
                System.out.println("You entered bad data. Please try again.");
            }
        }
        scanner.close();
    }
}

