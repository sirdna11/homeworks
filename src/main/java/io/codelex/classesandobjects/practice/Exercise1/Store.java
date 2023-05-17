package io.codelex.classesandobjects.practice.Exercise1;

import io.codelex.classesandobjects.practice.Exercise1.Product;

public class Store {

    public static void main(String[] args) {
        Product product1 = new Product("Logitech mouse", 70.00, 14);
        Product product2 = new Product("iPhone 5s", 999.99, 3);
        Product product3 = new Product("Epson EB-U05", 440.46, 1);

        product1.printProduct();
        product2.printProduct();
        product3.printProduct();

        product1.setPrice(8);
        product1.setAmount(100000);
        product1.printProduct();
    }
}
