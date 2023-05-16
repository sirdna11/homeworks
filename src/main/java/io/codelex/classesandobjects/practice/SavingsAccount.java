package io.codelex.classesandobjects.practice;

public class SavingsAccount {
    private double annualInterestRate;
    private double balance;

    public SavingsAccount(double balance, double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
        this.balance = balance;
    }

    public void withdrawal(double a) {
        this.balance = getBalance() - a;
    }

    public void deposit(double x) {
        this.balance = getBalance() + x;
    }

    public void monthlyInterest() {
        double monthlyInterestRate = this.annualInterestRate / 12 / 100;

        double monthlyInterest = this.balance * monthlyInterestRate;

        this.balance += monthlyInterest;
    }

    public double totalInterest(int numberOfMonths) {
        double totalInterest = 0;
        double monthlyInterestRate = annualInterestRate / 12 / 100;
        double currentBalance = balance;

        for (int i = 0; i < numberOfMonths; i++) {
            double monthlyInterest = currentBalance * monthlyInterestRate;
            totalInterest += monthlyInterest;
            currentBalance += monthlyInterest;
        }

        return totalInterest;
    }

    public double getBalance() {
        return balance;
    }
}
