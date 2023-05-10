package io.codelex.loops.practice;

import java.util.Scanner;

public class MultiplyByItself {

    public static void main(String[] args) {
        int i, n;
        i = 4;

        System.out.print("Input number of terms : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        for (int j = 0; j <= n; j++) {
            i *= i;
            System.out.println(i);
        }
    }

}
