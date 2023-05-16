package io.codelex.classesandobjects.practice;

public class FuelGauge {


    private double currentAmountOfFuel;

    public FuelGauge(double currentAmountOfFuel) {
        this.currentAmountOfFuel = currentAmountOfFuel;
    }

    public double getCurrentAmountOfFuel() {
        return currentAmountOfFuel;
    }

    public void incrementTheAmountOfFuelBy1Liter() {
        if (currentAmountOfFuel <= 70)
            this.currentAmountOfFuel = currentAmountOfFuel + 1;
    }

    public void decrementTheAmountOfFuelBy1Liter() {
        if (currentAmountOfFuel > 0)
            this.currentAmountOfFuel = currentAmountOfFuel - 1;
    }
}
