package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input;
        while (true) {
            System.out.print("Enter a character: ");
            input = in.nextLine().toLowerCase();

            int output = switch (input) {
                case "a", "b", "c" -> 2;
                case "d", "e", "f" -> 3;
                case "g", "h", "i" -> 4;
                case "j", "k", "l" -> 5;
                case "m", "n", "o" -> 6;
                case "p", "q", "r", "s" -> 7;
                case "t", "u", "v" -> 8;
                case "w", "x", "y", "z" -> 9;
                default -> -1;
            };

            if (output == -1) {
                System.out.println("loooool");
            } else {
                System.out.println(output);
            }
        }
    }
}
