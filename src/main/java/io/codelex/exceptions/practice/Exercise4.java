package io.codelex.exceptions.practice;

import java.util.Scanner;

class NonPositiveNumberException extends Exception {
    NonPositiveNumberException(String message) {
        super(message);
    }
}

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Please enter a number:");
            String input = scanner.nextLine();
            double d = getInput(input);
            double root = Math.sqrt(d);
            System.out.println(
                    "The square root of " + d + " is " + root);
        } catch (NumberFormatException e) {
            System.out.println("Be sure to enter a number.");
        } catch (NonPositiveNumberException e) {
            System.out.println("Result will be imaginary number.");
        }
    }

    static double getInput(String s) throws NonPositiveNumberException {
        double d = Double.parseDouble(s);
        if (d < 0) {
            throw new NonPositiveNumberException("Input is less than 0");
        }
        return d;
    }
}
