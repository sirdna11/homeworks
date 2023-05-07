package io.codelex.arithmetic.practice;
import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter another number");
        int secondNumber = scanner.nextInt();

        boolean result = checkIfEitherNumberIsFifteen(firstNumber, secondNumber);
        System.out.println("Result: " + result);

    }
    public static boolean checkIfEitherNumberIsFifteen(int firstNumber, int secondNumber) {
        return firstNumber == 15 || secondNumber == 15 ||
                firstNumber + secondNumber == 15 ||
                Math.abs(firstNumber - secondNumber) == 15;
    }
}
