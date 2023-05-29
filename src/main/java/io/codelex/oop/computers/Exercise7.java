package io.codelex.oop.computers;

public class Exercise7 {
    public static void main(String[] args) {
        Computer computer1 = new Computer("Intel i7", 16, "Nvidia RTX 3070", "Lenovo", "Legion 5");
        Computer computer2 = new Computer("AMD Ryzen 7", 16, "AMD RX 6800", "Asus", "ROG Strix");
        Computer computer3 = new Computer("Intel i7", 16, "Nvidia RTX 3070", "Lenovo", "Legion 5");

        System.out.println(computer1.toString());
        System.out.println(computer2.toString());

        System.out.println(computer1.equals(computer2));  // Expected output: false
        System.out.println(computer1.equals(computer3));  // Expected output: true
    }
}
