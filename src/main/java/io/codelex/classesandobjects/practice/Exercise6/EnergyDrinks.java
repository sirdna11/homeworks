package io.codelex.classesandobjects.practice.Exercise6;

public class EnergyDrinks {
    static final int NUMBERED_SURVEYED = 12467;
    static final double PURCHASED_ENERGY_DRINKS = 0.14;
    static final double PREFER_CITRUS_DRINKS = 0.64;

    public static void main(String[] args) {

        System.out.println("Total number of people surveyed " + getNUMBERED_SURVEYED());
        System.out.println("Approximately " + calculateEnergyDrinkers() + " bought at least one energy drink");
        System.out.println(calculatePreferCitrus() + " of those " + "prefer citrus flavored energy drinks.");
    }

    public static double calculateEnergyDrinkers() {
        return getNUMBERED_SURVEYED() * getPURCHASED_ENERGY_DRINKS();
    }

    public static double calculatePreferCitrus() {
        return calculateEnergyDrinkers() * getPREFER_CITRUS_DRINKS();
    }

    public static double getPURCHASED_ENERGY_DRINKS() {
        return PURCHASED_ENERGY_DRINKS;
    }

    public static double getPREFER_CITRUS_DRINKS() {
        return PREFER_CITRUS_DRINKS;
    }

    public static int getNUMBERED_SURVEYED() {
        return NUMBERED_SURVEYED;
    }
}
