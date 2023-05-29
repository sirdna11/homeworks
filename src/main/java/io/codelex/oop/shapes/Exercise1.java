package io.codelex.oop.shapes;

public class Exercise1 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(60, 50);
        System.out.println(rectangle.getNumSides());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        Triangle triangle = new Triangle(30, 50);
        System.out.println(triangle.getNumSides());
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
    }
}
