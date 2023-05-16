package io.codelex.classesandobjects.practice;

public class DogTest {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Max", "male", "Rocky", "Lady");
        Dog dog2 = new Dog("Rocky", "male", "Sam", "Molly");
        Dog dog3 = new Dog("Sparky", "male");
        Dog dog4 = new Dog("Buster", "male", "Sparky", "Lady");
        Dog dog5 = new Dog("Sam", "male");
        Dog dog6 = new Dog("Lady", "female");
        Dog dog7 = new Dog("Molly", "female");
        Dog dog8 = new Dog("Coco", "female", "Buster", "Molly");


        System.out.println(dog8.fathersName());
        System.out.println(dog8.hasSameMotherAs(dog2));

    }
}
