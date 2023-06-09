package io.codelex.oop.shapes;

public class Triangle extends Shape {
    private double width;
    private double height;

    public Triangle(double width, double height) {
        super(3);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {

        return 0.5 * this.width * this.height;
    }

    @Override
    public double getPerimeter() {
        double hypotenuse = Math.sqrt(Math.pow(this.width, 2) + Math.pow(this.height, 2));
        return this.width + this.height + hypotenuse;
    }
}
