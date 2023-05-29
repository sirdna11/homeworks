package io.codelex.oop.computers;

public class Exercise8 {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Intel i7", 16, "Nvidia RTX 3070", "Lenovo", "Legion 5", 80);
        Laptop laptop2 = new Laptop("AMD Ryzen 7", 16, "AMD RX 6800", "Asus", "ROG Strix", 90);
        Laptop laptop3 = new Laptop("Intel i7", 16, "Nvidia RTX 3070", "Lenovo", "Legion 5", 80);

        System.out.println(laptop1.toString());
        System.out.println(laptop2.toString());

        System.out.println(laptop1.equals(laptop2));  // Expected output: false
        System.out.println(laptop1.equals(laptop3));  // Expected output: true
    }
}
