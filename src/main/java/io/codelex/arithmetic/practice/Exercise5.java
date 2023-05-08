package io.codelex.arithmetic.practice;
import java.util.Scanner;
import java.util.Random;
public class Exercise5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        System.out.println(randomNumber);
        System.out.println("I'm thinking of a number between 1-100.  Try to guess it.");
        int playersNumber = scanner.nextInt();

        if (playersNumber == randomNumber){
            System.out.println("You guessed it!  What are the odds?!?");
        }else if (playersNumber > randomNumber){
            System.out.println("Sorry, you are too high.  I was thinking of "+randomNumber);
        }else{
            System.out.println("Sorry, you are too low.  I was thinking of "+randomNumber);
        }
    }
}
