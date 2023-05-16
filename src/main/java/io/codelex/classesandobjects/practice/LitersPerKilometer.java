package io.codelex.classesandobjects.practice;

import java.util.Scanner;


public class LitersPerKilometer {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first reading: ");
        double startKilometers = scan.nextDouble();

        Car car = new Car(startKilometers);

        while (true) {
            System.out.print("Enter current odometer reading: ");
            double endKilometers = scan.nextDouble();

            System.out.print("Enter liters consumed: ");
            double liters = scan.nextDouble();

            car.fillUp(endKilometers, liters);

            System.out.println("Kilometers per liter are " + car.calculateConsumption());

            System.out.print("Do you want to add another fill-up? (yes/no): ");
            String answer = scan.next();
            if (!answer.equalsIgnoreCase("yes")) {
                break;
            }
        }

        System.out.println("Final car type: " + (car.gasHog() ? "gas hog" : (car.economyCar() ? "economy" : "regular")));

        scan.close();
    }


}
