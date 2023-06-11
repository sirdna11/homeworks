package io.codelex.polymorphism.practice.exercise6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Animal> animals = new ArrayList<>();

        while (true) {
            System.out.println("Enter animal type (or 'End' to finish):");
            String animalType = scanner.nextLine();

            if (animalType.equals("End")) {
                break;
            }

            System.out.println("Enter animal name:");
            String animalName = scanner.nextLine();
            System.out.println("Enter animal weight:");
            double animalWeight = Double.parseDouble(scanner.nextLine());
            System.out.println("Enter animal living region:");
            String animalLivingRegion = scanner.nextLine();
            String breed = "";
            if (animalType.equals("Cat")) {
                System.out.println("Enter breed:");
                breed = scanner.nextLine();
            }

            Animal animal;
            switch (animalType) {
                case "cat":
                    animal = new Cat(animalName, animalWeight, animalLivingRegion, breed);
                    break;
                // Add more cases for other animal types
                default:
                    continue;
            }

            animal.makeSound(); // Move makeSound() here

            System.out.println("Enter food type:");
            String foodType = scanner.nextLine();
            System.out.println("Enter quantity:");
            int quantity = Integer.parseInt(scanner.nextLine());

            Food food = foodType.equals("Vegetable")
                    ? new Vegatable(quantity)
                    : new Meat(quantity);

            try {
                animal.eat(food);
            } catch (IllegalArgumentException iae) {
                System.out.println(animal.getClass().getSimpleName() + "s are not eating that type of food!");
            }
            animals.add(animal);
        }

        for (Animal animal : animals) {
            System.out.println(animal);
        }

        scanner.close();
    }
}
