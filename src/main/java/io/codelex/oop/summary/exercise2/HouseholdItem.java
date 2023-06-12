package io.codelex.oop.summary.exercise2;

class HouseholdItem extends AbstractItem {
    private String color;

    public HouseholdItem(String name, double price, String color) {
        super(name, price);
        this.color = color;
    }

    public String fullInfo() {
        return this.name + ", " + this.price + " EUR, color: " + this.color;
    }
}
