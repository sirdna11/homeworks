package io.codelex.polymorphism.practice.exercise6;

import io.codelex.polymorphism.examples.Animal;

public abstract class Mammal extends Animal {
    private String livingRegion;

    public Mammal(String animalName, String animalType, double animalWeight, String livingRegion) {
        super();
        this.livingRegion = livingRegion;
    }

    @Override
    public void makeSound() {

    }
}
