package io.codelex.oop.cars;

import java.util.stream.DoubleStream;
import java.util.*;
import java.util.stream.Collectors;

public class CarService {
    private List<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public void removeCar(Car car) {
        cars.remove(car);
    }

    public List<Car> getAllCars() {
        return new ArrayList<>(cars);
    }

    public List<Car> getCarsWithV12Engine() {
        return cars.stream()
                .filter(car -> car.getEngineType() == EngineType.V12)
                .collect(Collectors.toList());
    }

    public List<Car> getCarsProducedBefore1999() {
        return cars.stream()
                .filter(car -> car.getYearOfManufacture() < 1999)
                .collect(Collectors.toList());
    }

    public Car getMostExpensiveCar() {
        return cars.stream()
                .max(Comparator.comparing(Car::getPrice))
                .orElse(null);
    }

    public Car getCheapestCar() {
        return cars.stream()
                .min(Comparator.comparing(Car::getPrice))
                .orElse(null);
    }


    public List<Car> getSortedCars(boolean ascending) {
        return cars.stream()
                .sorted(Comparator.comparing(Car::getPrice, ascending ? Comparator.naturalOrder() : Comparator.reverseOrder()))
                .collect(Collectors.toList());
    }

    public boolean isCarInList(Car car) {
        return cars.contains(car);
    }


}
