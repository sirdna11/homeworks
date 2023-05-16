package io.codelex.classesandobjects.practice;

public class Car {
    private double startKilometers;
    private double endKilometers;
    private double liters;

    public Car(double startKilometers) {
        this.startKilometers = startKilometers;
        this.endKilometers = 0;
        this.liters = 0;
    }

    public void fillUp(double mileage, double liters) {
        this.startKilometers = this.endKilometers;
        this.endKilometers = mileage;
        this.liters = liters;
    }

    public double calculateConsumption() {
        double distance = endKilometers - startKilometers;
        return (distance / liters) * 100;
    }

    public boolean gasHog() {
        double consumption = calculateConsumption();
        return consumption > 15.0;
    }

    public boolean economyCar() {
        double consumption = calculateConsumption();
        return consumption < 5.0;
    }
}

