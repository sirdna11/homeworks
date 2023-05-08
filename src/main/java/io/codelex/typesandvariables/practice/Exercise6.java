package io.codelex.typesandvariables.practice;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class Exercise6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        List<Integer> numbers = new ArrayList<>();

        while (scanner.hasNextInt()){
            int number = scanner.nextInt();
            numbers.add(number);
            int sum=0;
            for (int numbe : numbers) {
                sum += numbe;
            }
            System.out.println("You entered: " + number +" the sum is " +sum);
        }

    }
}
