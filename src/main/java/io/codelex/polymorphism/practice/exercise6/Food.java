package io.codelex.polymorphism.practice.exercise6;

public abstract class Food {
    private int quantity;

    public Food(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void increaseQuantity(int amount) {
        this.quantity += amount;
    }

    public void decreaseQuantity(int amount) {
        if (this.quantity - amount < 0) {
            throw new IllegalArgumentException("Amount is greater than existing quantity");
        }
        this.quantity -= amount;
    }

    public abstract void consume();

    @Override
    public String toString() {
        return "Food quantity: " + this.quantity;
    }
}

