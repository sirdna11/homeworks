package io.codelex.classesandobjects.practice;

// Each BankAccount object represents one user's account
// information including name and balance of money.

public class BankAccount {
    public String name;
    public double balance;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public final void deposit(double amount) {
        //todo
    }

    @Override
    public String toString() {
        return String.format("%s, %s$%.2f", name, balance < 0 ? "-" : "", Math.abs(balance));
    }

    public final void withdraw(double amount) {
        //todo
    }

}
