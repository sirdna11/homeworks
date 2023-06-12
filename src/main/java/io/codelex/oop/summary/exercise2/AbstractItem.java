package io.codelex.oop.summary.exercise2;

abstract class AbstractItem implements Item {
    protected String name;
    protected double price;

    public AbstractItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }
}
