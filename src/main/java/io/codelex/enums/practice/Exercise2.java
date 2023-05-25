package io.codelex.enums.practice;

import java.util.*;

public class Exercise2 {
    public static void main(String[] args) {
        int userWins = 0, compWins = 0, ties = 0;
        Scanner scanner = new Scanner(System.in);
        String userInput;

        System.out.println("Let us begin...");

        while (true) {
            System.out.println("Scissor-Paper-Stone");
            System.out.print("Your turn (Enter s for scissor, p for paper, t for stone, q to quit): ");

            userInput = scanner.next().toLowerCase();

            if (userInput.equals("q")) {
                break;
            }

            Move userMove;
            userMove = switch (userInput) {
                case "s" -> Move.SCISSOR;
                case "p" -> Move.PAPER;
                case "t" -> Move.STONE;
                default -> {
                    System.out.println("Invalid input, try again...");
                    yield null;
                }
            };

            Move compMove = Move.getRandom();
            System.out.println("My turn: " + compMove);

            if (userMove == compMove) {
                System.out.println("Tie!\n");
                ties++;
                continue;
            }

            switch (userMove) {
                case SCISSOR -> {
                    if (compMove == Move.PAPER) {
                        System.out.println("Scissor cuts paper, you won!\n");
                        userWins++;
                    } else {
                        System.out.println("Stone breaks scissor, I won!\n");
                        compWins++;
                    }
                }
                case PAPER -> {
                    if (compMove == Move.STONE) {
                        System.out.println("Paper wraps stone, you won!\n");
                        userWins++;
                    } else {
                        System.out.println("Scissor cuts paper, I won!\n");
                        compWins++;
                    }
                }
                case STONE -> {
                    if (compMove == Move.SCISSOR) {
                        System.out.println("Stone breaks scissor, you won!\n");
                        userWins++;
                    } else {
                        System.out.println("Paper wraps stone, I won!\n");
                        compWins++;
                    }
                }
            }
        }

        int totalGames = userWins + compWins + ties;
        System.out.println("\nNumber of trials: " + totalGames);
        System.out.printf("I won %d(%.2f%%). You won %d(%.2f%%).\n", compWins, 100.0 * compWins / totalGames,
                userWins, 100.0 * userWins / totalGames);
        System.out.println("Bye!");
    }

    public enum Move {
        SCISSOR, PAPER, STONE;

        public static Move getRandom() {
            Random random = new Random();
            return values()[random.nextInt(values().length)];
        }
    }
}
