package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        String input;
        while (true) {
            System.out.print("Enter a character: ");
            input = in.nextLine().toLowerCase();
            switch (input) {
                case "a":
                case "b":
                case "c":
                    System.out.println(2);
                    break;
                case "d":
                case "e":
                case "f":
                    System.out.println(3);
                    break;
                case "g":
                case "h":
                case "i":
                    System.out.println(4);
                    break;
                case "j":
                case "k":
                case "l":
                    System.out.println(5);
                    break;
                case "m":
                case "n":
                case "o":
                    System.out.println(6);
                    break;
                case "p":
                case "q":
                case "r":
                case "s":
                    System.out.println(7);
                    break;
                case "t":
                case "u":
                case "v":
                    System.out.println(8);
                    break;
                case "w":
                case "x":
                case "y":
                case "z":
                    System.out.println(9);
                    break;
                default:
                    System.out.println("loooool");
            }
        }


    }


}
