package io.codelex.typesandvariables.practice;

public class MoreVariablesAndPrinting {
    public static void main(String[] args) {
        String Name, Eyes, Teeth, Hair;
        double Age, Height, Weight;

        Name = "Zed A. Shaw";
        Age = 35;
        Height = Math.round(74*2.54 * 100) / 100.0;  // inches
        Weight = Math.round(180*0.453592 * 100) / 100.0; // lbs
        Eyes = "Blue";
        Teeth = "White";
        Hair = "Brown";

        System.out.println("Let's talk about " + Name + ".");
        System.out.println("He's " + Height + " cm tall.");
        System.out.println("He's " + Weight + " kg heavy.");
        System.out.println("Actually, that's not too heavy.");
        System.out.println("He's got " + Eyes + " eyes and " + Hair + " hair.");
        System.out.println("His teeth are usually " + Teeth + " depending on the coffee.");

        System.out.println("If I add " + Age + ", " + Height + ", and " + Weight
                + " I get " + (Age + Height + Weight) + ".");
    }
}