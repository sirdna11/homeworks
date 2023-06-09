package io.codelex.oop.persons;

public class Exercise2 {
    public static void main(String[] args) {
        Customer customer = new Customer("Andris", "Klimkāns", 23, "abc123", 0);
        System.out.println(customer.getInfo());
        Employee employee = new Employee("Andris", "Klimkāns", "123abc", 23, "100x developer", 2022, 04, 13);
        System.out.println(employee.getWorkExperience());
        System.out.println(employee.getInfo());
    }
}
