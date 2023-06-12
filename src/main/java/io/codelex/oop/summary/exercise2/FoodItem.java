package io.codelex.oop.summary.exercise2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class FoodItem extends AbstractItem {
    private LocalDate bestBefore;

    public FoodItem(String name, double price, String bestBefore) {
        super(name, price);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        this.bestBefore = LocalDate.parse(bestBefore, formatter);
    }

    public LocalDate getBestBefore() {
        return this.bestBefore;
    }

    public String fullInfo() {
        return this.name + ", " + this.price + " EUR, best before: " + this.bestBefore.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }
}

