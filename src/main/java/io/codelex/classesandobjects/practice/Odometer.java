package io.codelex.classesandobjects.practice;

public class Odometer {
    private int currentMileage; // The car's current mileage
    private static final int MAX_MILEAGE = 999999; // The maximum mileage the odometer can store
    private static final int KM_PER_LITER = 10; // The car's fuel economy (10 kilometers per liter)
    private FuelGauge fuelGauge; // The FuelGauge object associated with the odometer

    // Constructor
    public Odometer(int initialMileage, FuelGauge fuelGauge) {
        if (initialMileage >= 0 && initialMileage <= MAX_MILEAGE) {
            this.currentMileage = initialMileage;
        } else {
            System.out.println("Invalid initial mileage value. Setting mileage to 0.");
            this.currentMileage = 0;
        }
        this.fuelGauge = fuelGauge;
    }

    // Get the car's current mileage
    public int getCurrentMileage() {
        return currentMileage;
    }

    // Increment the current mileage by 1 kilometer
    public void incrementMileage() {
        currentMileage = (currentMileage + 1) % (MAX_MILEAGE + 1);

        if (currentMileage % KM_PER_LITER == 0) {
            fuelGauge.decrementTheAmountOfFuelBy1Liter();
        }
    }
}

