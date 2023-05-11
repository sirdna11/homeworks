package io.codelex.arrays.practice;

import java.util.Random;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        String[] words = {"man", "patik", "programet", "suns"};

        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int randomIndex = random.nextInt(words.length);

        String randomWord = words[randomIndex];
        char[] characters = randomWord.toCharArray();

        for (char c : characters) {
            System.out.print(" _ ");
        }

        while (true) {
            String inputString = input.next();
            char letter = inputString.charAt(0);

            for (char c : characters) {
                if (letter == c) {
                    System.out.println(c);
                }
            }
        }

    }
}
