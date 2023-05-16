package io.codelex.arrays.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        String[] words = {"i", "like", "to", "program", "in", "java", "even", "if", "this", "exercise", "is", "a", "lot", "easier", "in", "javascript", "turtle"};

        Random random = new Random();

        int randomIndex = random.nextInt(words.length);
        Scanner scanner = new Scanner(System.in);
        String randomWord = words[randomIndex];
        List<Character> wrongGuesses = new ArrayList<>();
        List<Character> rightGuesses = new ArrayList<>();
        char[] hiddenWord = new char[randomWord.length()];

        for (int i = 0; i < randomWord.length(); i++) {
            hiddenWord[i] = '_';
        }

        boolean gameWon = false;
        int attempts = randomWord.length() + 3;
        while (attempts > 0 && !gameWon) {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.print("Word: ");
            for (char c : hiddenWord) {
                System.out.print(c + " ");
            }
            System.out.println();
            System.out.println("Misses:" + wrongGuesses);
            System.out.println("Guess:" + rightGuesses);
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");

            char guessedLetter = scanner.next().charAt(0);

            boolean letterFound = false;

            for (int i = 0; i < randomWord.length(); i++) {
                if (randomWord.charAt(i) == guessedLetter) {
                    hiddenWord[i] = guessedLetter;
                    letterFound = true;
                }
            }
            if (letterFound) {
                System.out.println("Correct!");
                rightGuesses.add(guessedLetter);
            } else {
                System.out.println("Wrong!");
                attempts--;
                wrongGuesses.add(guessedLetter);

            }

            if (String.valueOf(hiddenWord).equals(randomWord)) {
                gameWon = true;
            }
        }
        if (gameWon) {
            System.out.println("Congratulations! You've guessed the word: " + randomWord);
        } else {
            System.out.println("Sorry, you've run out of attempts. The word was: " + randomWord);
        }

    }
}
