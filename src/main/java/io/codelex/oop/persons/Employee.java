package io.codelex.oop.persons;

import java.time.LocalDate;
import java.time.Period;

public class Employee extends Person {
    private String position;
    private LocalDate startedWorking;

    public Employee(String firstName, String lastName, String id, int age, String position, int year, int month, int day) {
        super(firstName, lastName, id, age);
        this.position = position;
        this.startedWorking = LocalDate.of(year, month, day);

    }

    public int getWorkExperience() {
        LocalDate today = LocalDate.now();
        Period period = Period.between(this.startedWorking, today);
        return period.getYears();
    }

    @Override
    public String getInfo() {
        return getFirstName() + " " + getLastName() + " " + position + " " + getWorkExperience() + " years";
    }
}
