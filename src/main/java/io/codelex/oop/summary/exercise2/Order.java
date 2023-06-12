package io.codelex.oop.summary.exercise2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Order {
    private List<SellableThing> items = new ArrayList<>();

    public void addItem(SellableThing item) throws BadFoodException {
        if (item instanceof FoodItem) {
            FoodItem foodItem = (FoodItem) item;
            if (foodItem.getBestBefore().isBefore(LocalDate.now())) {
                throw new BadFoodException("The food item is expired!");
            }
        }
        items.add(item);
    }

    public List<SellableThing> getItems() {
        return items;
    }
}

