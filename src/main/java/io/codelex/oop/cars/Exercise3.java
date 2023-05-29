package io.codelex.oop.cars;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Exercise3 {
    public static void main(String[] args) {
        Manufacturer manufacturer1 = new Manufacturer("ford", 1897, "America");
        Manufacturer manufacturer2 = new Manufacturer("bmw", 2023, "germany");
        Manufacturer manufacturer3 = new Manufacturer("forest", 97, "latvija");

        Car car = new Car("zirgs", "lels-zirgs", new BigDecimal("10000.00"), 1, Arrays.asList(manufacturer1, manufacturer2), EngineType.V12);
        System.out.println("Car name: " + car.getName());
        System.out.println("Car model: " + car.getModel());
        System.out.println("Car price: " + car.getPrice());
        System.out.println("Car year of manufacture: " + car.getYearOfManufacture());

    }
}