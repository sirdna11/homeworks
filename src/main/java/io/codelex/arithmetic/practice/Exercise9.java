package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in kilograms: ");
        double weightInKilograms = scanner.nextDouble();

        System.out.print("Enter your height in meters: ");
        double heightInMeters = scanner.nextDouble();

        double weightInPounds = weightInKilograms * 2.20462;
        double heightInInches = heightInMeters * 39.3701;

        double bmi = (weightInPounds * 703) / (heightInInches * heightInInches);

        System.out.println("Your BMI is: " + bmi);

        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi <= 25) {
            System.out.println("You have an optimal weight.");
        } else {
            System.out.println("You are overweight.");
        }
    }
}
