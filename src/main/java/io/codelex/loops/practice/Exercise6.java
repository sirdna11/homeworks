package io.codelex.loops.practice;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter integer to do something");
        int input = in.nextInt();
        int counter = 0;


        for (int i = 1; i <= input; i++) {

            counter++;
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(" FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print(" Fizz ");
            } else if (i % 5 == 0) {
                System.out.print(" Buzz ");
            } else {
                System.out.print(" " + i + " ");
            }
            if (counter == 20) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
