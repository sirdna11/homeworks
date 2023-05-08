package io.codelex.arithmetic.practice;
import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = scanner.nextInt();

        if (isEven(number)) {
            System.out.println(number + " is even.");
            System.out.println("bay");
        } else if (isOdd(number)) {
            System.out.println(number + " is odd.");
            System.out.println("bay");
        }
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }

}
