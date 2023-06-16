package io.codelex.trivia;

import java.util.List;
import java.util.Scanner;

public class TriviaGame {
    public static void main(String[] args) throws Exception {
        NumbersApiTrivia triviaGenerator = new NumbersApiTrivia();
        Scanner scanner = new Scanner(System.in);
        int correctAnswres = 0;
        while (correctAnswres < 20) {
            NumbersApiTrivia.Trivia trivia = triviaGenerator.getTriviaQuestion();

            System.out.println("Here is your question: ");
            System.out.println(trivia.question());
            List<Integer> options = trivia.options();
            for (int i = 0; i < options.size(); i++) {
                System.out.println((i + 1) + ". " + options.get(i));
            }


            String input = scanner.nextLine();


            if (input.equalsIgnoreCase("quit")) {
                break;
            }

            try {
                int guess = Integer.parseInt(input);
                if (guess == trivia.answer()) {
                    System.out.println("Correct!");
                    correctAnswres++;
                } else {
                    System.out.println("Sorry, that's not correct. The correct answer is " + trivia.answer() + ".");
                    System.out.println("you answered " + correctAnswres + " question correct");
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }

        scanner.close();
    }
}
