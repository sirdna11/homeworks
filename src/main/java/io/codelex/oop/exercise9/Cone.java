package io.codelex.oop.exercise9;

public class Cone extends Shape3D {
    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * (radius + Math.sqrt(height * height + radius * radius));
    }

    @Override
    public double calculateVolume() {
        return Math.PI * radius * radius * height / 3.0;
    }
}
