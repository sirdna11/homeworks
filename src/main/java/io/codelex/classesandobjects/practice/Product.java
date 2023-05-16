package io.codelex.classesandobjects.practice;

public class Product {

    private double price;
    private int amount;

    private String name;

    public Product(String name, double price, int amount) {
        this.price = price;
        this.amount = amount;
        this.name = name;
    }

    public void printProduct() {
        System.out.println(name + "," + "price " + price + " amount " + amount);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }


}
