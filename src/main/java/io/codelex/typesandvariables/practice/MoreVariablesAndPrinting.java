package io.codelex.typesandvariables.practice;

public class MoreVariablesAndPrinting {
    public static void main(String[] args) {
        String name, eyes, teeth, hair;
        double age, height, weight;

        name = "Zed A. Shaw";
        age = 35;
        height = Math.round(74*2.54 * 100) / 100.0;  // inches
        weight = Math.round(180*0.453592 * 100) / 100.0; // lbs
        eyes = "Blue";
        teeth = "White";
        hair = "Brown";

        System.out.println("Let's talk about " + name + ".");
        System.out.println("He's " + height + " cm tall.");
        System.out.println("He's " + weight + " kg heavy.");
        System.out.println("Actually, that's not too heavy.");
        System.out.println("He's got " + eyes + " eyes and " + hair + " hair.");
        System.out.println("His teeth are usually " + teeth + " depending on the coffee.");

        System.out.println("If I add " + age + ", " + height + ", and " + weight
                + " I get " + (age + height + weight) + ".");
    }
}
