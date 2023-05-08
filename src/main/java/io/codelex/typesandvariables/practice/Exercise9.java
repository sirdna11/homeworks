package io.codelex.typesandvariables.practice;
import java.util.Scanner;
public class Exercise9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter distance in meters");
        double distanceMeters = scanner.nextDouble();
        System.out.println("Enter time traveled in hours");
        int hours = scanner.nextInt();
        System.out.println("Enter time traveled in minutes");
        int minutes = scanner.nextInt();
        System.out.println("Enter time traveled in seconds");
        int seconds = scanner.nextInt();

        // Convert time to seconds
        double timeSeconds = hours * 3600 + minutes * 60 + seconds;

        // Calculate speed in meters/second
        double speedMetersPerSecond = distanceMeters / timeSeconds;

        // Calculate speed in km/h and miles/h
        double speedKmPerHour = (distanceMeters / 1000) / (timeSeconds / 3600);
        double speedMilesPerHour = speedKmPerHour * 0.62150403;

        System.out.printf("Your speed in meters/second is %.8f%n", speedMetersPerSecond);
        System.out.printf("Your speed in km/h is %.8f%n", speedKmPerHour);
        System.out.printf("Your speed in miles/h is %.8f%n", speedMilesPerHour);
    }
}
