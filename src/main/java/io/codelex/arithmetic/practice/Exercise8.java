package io.codelex.arithmetic.practice;

public class Exercise8 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Andris", 7.50, 35);
        Employee employee2 = new Employee("Bob", 8.20, 47);
        Employee employee3 = new Employee("Dick", 10.00, 75);

        printEmployeeSalary(employee1);
        printEmployeeSalary(employee2);
        printEmployeeSalary(employee3);
    }

    public static void printEmployeeSalary(Employee employee) {
        try {
            double salary = employee.salaryCalculator();
            System.out.println(employee.getName() + " Salary is $" + salary);
        } catch (IllegalArgumentException e) {
            System.out.println("Error for " + employee.getName() + ": " + e.getMessage());
        }
    }
}

class Employee {
    private String name;
    private double pay;
    private int hours;

    public Employee(String name, double pay, int hours) {
        this.name = name;
        this.pay = pay;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public double salaryCalculator() {
        if (pay < 8) {
            throw new IllegalArgumentException("You need to pay at least $8 to " + name);
        } else if (hours > 60) {
            throw new IllegalArgumentException(name + " has worked more than 60 hours");
        }

        int regularHours = Math.min(hours, 40);
        int overtimeHours = Math.max(hours - 40, 0);

        double regularPay = pay * regularHours;
        double overtimePay = pay * overtimeHours * 1.5;

        double salary = regularPay + overtimePay;
        return salary;
    }
}
