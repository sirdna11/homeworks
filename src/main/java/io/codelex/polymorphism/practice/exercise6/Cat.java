package io.codelex.polymorphism.practice.exercise6;

import java.text.DecimalFormat;

public class Cat extends Animal {
    private String breed;

    public Cat(String animalName, double animalWeight, String animalLivingRegion, String breed) {
        super(animalName, animalWeight, animalLivingRegion);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("> Meowwww");
    }

    @Override
    public void eat(Food food) {
        setFoodEaten(getFoodEaten() + food.getQuantity());
    }

    @Override
    public String toString() {
        return String.format("Cat[%s, %s, %s, %s, %s]",
                getAnimalName(),
                this.breed,
                new DecimalFormat("#.##").format(getAnimalWeight()),
                getAnimalLivingRegion(),
                getFoodEaten()
        );
    }
}

// Similar for Mouse, Tiger, and Zebra, changing makeSound and eat methods as needed
