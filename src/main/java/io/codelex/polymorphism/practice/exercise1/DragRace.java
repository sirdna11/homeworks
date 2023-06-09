package io.codelex.polymorphism.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

/**
 * Take a look at the cars in this package.
 * 1. Extract common behaviour to an interface called Car, and use it in the all classes.
 * Which methods will be extracted with an empty body, and which can be default?
 * 2. Create two more cars of your own choice.
 * 3. As you see there is a possibility to use some kind of boost in Lexus, extract it to a new interface and add that behaviour in one more car.
 * 3. Create one instance of an each car and add them to list.
 * 4. Iterate over the list 10 times, in the 3rd iteration use speed boost on the car if they have one.
 * 5. Print out the car name and speed of the fastest car
 */
public class DragRace {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        Car lexus = new Lexus();
        Car horse = new Horse();
        Car audi = new Audi();
        Car bmw = new Bmw();
        Car lamborghini = new Lamborghini();
        Car tesla = new Tesla();

        cars.add(lexus);
        cars.add(horse);
        cars.add(audi);
        cars.add(bmw);
        cars.add(lamborghini);
        cars.add(tesla);

        Car fastestCar = null;
        int maxSpeed = 0;
        for (int i = 0; i < 10; i++) {
            for (Car car : cars) {
                car.startEngine();
                car.speedUp();

                if (i == 2) {
                    if (car instanceof Boostable) {
                        ((Boostable) car).useNitrousOxideEngine();
                    } else if (car instanceof Steroids) {
                        ((Steroids) car).useRoids();
                    }
                }

                int currentSpeed = Integer.parseInt(car.showCurrentSpeed());
                if (currentSpeed > maxSpeed) {
                    maxSpeed = currentSpeed;
                    fastestCar = car;
                }

                car.slowDown();
            }
        }

        // After the loop, print out the name and speed of the fastest car
        if (fastestCar != null) {
            System.out.println("The fastest car is " + fastestCar.getName() + " with a speed of " + fastestCar.showCurrentSpeed());
        }

        
    }
}
