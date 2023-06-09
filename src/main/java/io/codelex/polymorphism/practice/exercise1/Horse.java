package io.codelex.polymorphism.practice.exercise1;

public class Horse implements Car, Steroids {
    private Integer currentSpeed = 0;

    @Override
    public void speedUp() {
        currentSpeed += 10;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 10;
    }

    @Override
    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    @Override
    public void startEngine() {
        System.out.println("ehahahahahaha");
    }

    @Override
    public String getName() {
        return "Roberts";
    }


    @Override
    public void useRoids() {
        currentSpeed = currentSpeed + 30;
    }
}
