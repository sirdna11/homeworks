package io.codelex.oop.exercise9;

public class Triangle extends Shape {
    private double side;

    public Triangle(double side) {
        this.side = side;
    }

    @Override
    public double calculatePerimeter() {
        return 3 * side;
    }

    @Override
    public double calculateArea() {
        return (Math.sqrt(3) / 4) * side * side;
    }
}

