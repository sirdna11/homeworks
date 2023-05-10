package io.codelex.loops.practice;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Min? ");
        int min = scanner.nextInt();
        System.out.print("Max? ");
        int max = scanner.nextInt();

        for (int i = min; i <= max; i++) {
            for (int j = 0; j < max - min + 1; j++) {
                int num = (i + j - min) % (max - min + 1) + min;
                System.out.print(num);
            }
            System.out.println();
        }


    }

}
