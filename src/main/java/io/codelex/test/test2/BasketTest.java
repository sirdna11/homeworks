package io.codelex.test.test2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BasketTest {

    @Test(expected = BasketFullException.class)
    public void testAppleBasket() {
        Basket<Apple> appleBasket = new Basket<>();


        for (int i = 0; i < 5; i++) {
            appleBasket.addToBasket(new Apple());
        }


        assertEquals(5, appleBasket.getCurrentSize());


        appleBasket.addToBasket(new Apple());
    }

    @Test(expected = BasketFullException.class)
    public void testMushroomBasket() {
        Basket<Mushroom> mushroomBasket = new Basket<>();


        for (int i = 0; i < 7; i++) {
            mushroomBasket.addToBasket(new Mushroom());
        }


        assertEquals(7, mushroomBasket.getCurrentSize());

      
        mushroomBasket.addToBasket(new Mushroom());
    }
}