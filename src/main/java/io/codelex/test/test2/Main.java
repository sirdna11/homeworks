package io.codelex.test.test2;

public class Main {
    public static void main(String[] args) {

        Basket<Apple> appleBasket = new Basket<>();

        try {
            for (int i = 0; i < 9; i++) {
                appleBasket.addToBasket(new Apple());
            }
            appleBasket.addToBasket(new Apple());
        } catch (BasketFullException e) {
            System.out.println(e.getMessage());
        }


        Basket<Mushroom> mushroomBasket = new Basket<>();

        try {
            mushroomBasket.removeFromBasket();
        } catch (BasketEmptyException e) {
            System.out.println(e.getMessage());
        }
    }
}
