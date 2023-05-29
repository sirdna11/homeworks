package io.codelex.oop.shapes;

abstract class Shape {
    int numSides;

    public Shape(int numSides) {
        this.numSides = numSides;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public int getNumSides() {
        return numSides;
    }
}
