package io.codelex.polymorphism.practice.exercise6;

import io.codelex.polymorphism.practice.exercise6.Food;

import java.text.DecimalFormat;

public abstract class Animal {
    private String animalName;
    private double animalWeight;
    private String animalLivingRegion;
    private int foodEaten;

    public Animal(String animalName, double animalWeight, String animalLivingRegion) {
        this.animalName = animalName;
        this.animalWeight = animalWeight;
        this.animalLivingRegion = animalLivingRegion;
        this.foodEaten = 0;
    }

    public abstract void makeSound();

    public abstract void eat(Food food);

    public int getFoodEaten() {
        return this.foodEaten;
    }

    public void setFoodEaten(int foodEaten) {
        this.foodEaten = foodEaten;
    }

    public String getAnimalName() {
        return this.animalName;
    }

    public String getAnimalLivingRegion() {
        return this.animalLivingRegion;
    }

    public double getAnimalWeight() {
        return this.animalWeight;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return String.format("%s[%s, %s, %s, %s]",
                getClass().getSimpleName(),
                this.animalName,
                df.format(this.animalWeight),
                this.animalLivingRegion,
                this.foodEaten
        );
    }
}
