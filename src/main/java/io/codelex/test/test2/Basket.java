package io.codelex.test.test2;

class Basket<T> {
    private static final int MAX_CAPACITY = 10;
    private int currentSize;

    public Basket() {
        this.currentSize = 0;
    }

    public void addToBasket(T item) {
        if (currentSize == MAX_CAPACITY) {
            throw new BasketFullException("Basket is full");
        }
        currentSize++;

    }

    public void removeFromBasket() {
        if (currentSize == 0) {
            throw new BasketEmptyException("Basket is empty");
        }
        currentSize--;

    }

    public int getCurrentSize() {
        return currentSize;
    }
}