package io.codelex.oop.cars;


import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

public class Car {
    private String name;
    private String model;
    private BigDecimal price;
    private int yearOfManufacture;
    private List<Manufacturer> manufacturers;
    private EngineType engineType;


    public Car(String name, String model, BigDecimal price, int yearOfManufacture, List<Manufacturer> manufacturers, EngineType engineType) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.yearOfManufacture = yearOfManufacture;
        this.manufacturers = manufacturers;
        this.engineType = engineType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = BigDecimal.valueOf(price);
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public Manufacturer getManufacturers() {
        return (Manufacturer) manufacturers;
    }

    public void setManufacturers(List<Manufacturer> manufacturers) {
        this.manufacturers = manufacturers;
    }

    public void setManufacturers(Manufacturer manufacturers) {
        this.manufacturers = (List<Manufacturer>) manufacturers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearOfManufacture == car.yearOfManufacture && Objects.equals(name, car.name) && Objects.equals(model, car.model) && Objects.equals(price, car.price) && Objects.equals(manufacturers, car.manufacturers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, yearOfManufacture, manufacturers);
    }


}
