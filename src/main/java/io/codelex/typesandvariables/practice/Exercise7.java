package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("enter a word");
            String inputString = scanner.nextLine();

            int howManyUpperCases = 0;
            for (int i = 0; i < inputString.length(); i++) {
                if (Character.isUpperCase(inputString.charAt(i))) {
                    howManyUpperCases++;

                }
            }
            System.out.println("You entered: " + inputString + " and ther was " + howManyUpperCases + " Upper cases");
        }
    }
}
