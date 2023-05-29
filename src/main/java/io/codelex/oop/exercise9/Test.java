package io.codelex.oop.exercise9;

public class Test {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 5);
        System.out.println("Rectangle perimeter: " + rectangle.calculatePerimeter());
        System.out.println("Rectangle area: " + rectangle.calculateArea());

        Triangle triangle = new Triangle(6);
        System.out.println("Triangle perimeter: " + triangle.calculatePerimeter());
        System.out.println("Triangle area: " + triangle.calculateArea());

        Hexagon hexagon = new Hexagon(7);
        System.out.println("Hexagon perimeter: " + hexagon.calculatePerimeter());
        System.out.println("Hexagon area: " + hexagon.calculateArea());
    }
}
