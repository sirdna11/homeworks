package io.codelex.polymorphism.practice.exercise3;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Andris", "Klimkāns", "neteiksu", 42069);
        Person student = new Student("bobis", "kacoks", "zem tilta", 1232231, 9.9);
        Person employee = new Employee("kalmars", "rexis", "offisa tolete", 420 + 69, "junior");

        person.display();
        student.display();
        employee.display();
    }
}
