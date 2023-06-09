package io.codelex.polymorphism.practice.exercise5;

public class Poster extends Hoarding {
    private int height;
    private int width;
    private int numberOfCopies;
    private int costPerCopy;


    public Poster(int fee, int numberOfDays, int rate, int height, int width, int numberOfCopies, int costPerCopy) {
        super(fee, numberOfDays, rate);
        this.height = height;
        this.width = width;
        this.numberOfCopies = numberOfCopies;
        this.costPerCopy = costPerCopy;
    }
}
