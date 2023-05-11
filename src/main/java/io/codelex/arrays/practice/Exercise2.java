package io.codelex.arrays.practice;

import java.util.Scanner;
import java.util.Arrays;

public class Exercise2 {

    //TODO: Write a Java program to sum values of an array.
    // Array values are starting from min (including) till max (including) number.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a min number");
        int minNumber = input.nextInt();

        System.out.println("Please enter a max number");
        int maxNumber = input.nextInt();

        int[] myArray = new int[maxNumber - minNumber + 1];
        int sum = 0;


        for (int i = minNumber, j = 0; i <= maxNumber; i++, j++) {
            myArray[j] = i;
            sum += i;
        }

        System.out.println("ArrayList: " + Arrays.toString(myArray));
        System.out.println("The sum is " + sum);
    }
}
