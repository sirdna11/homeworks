package io.codelex.loops.practice;

public class Exercise8 {
    public static final int SIZE = 3;

    public static void main(String[] args) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < 4 * (SIZE - i) - 4; j++) {
                System.out.print("/");
            }

            for (int j = 0; j < 8 * i; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < 4 * (SIZE - i) - 4; j++) {
                System.out.print("\\");
            }

            System.out.println();
        }
    }
}
