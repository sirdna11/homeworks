package io.codelex.oop.summary.exercise2;

class ElectronicsItem extends AbstractItem {
    private int power;

    public ElectronicsItem(String name, double price, int power) {
        super(name, price);
        this.power = power;
    }

    public String fullInfo() {
        return this.name + ", " + this.price + " EUR, power: " + this.power + "W";
    }
}
