package io.codelex.test;

abstract class Card {
    protected double balance;
    private String number;
    private String owner;
    private String ccv;

    public Card(String number, String owner, String ccv, double balance) {
        this.number = number;
        this.owner = owner;
        this.ccv = ccv;
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public String getOwner() {
        return owner;
    }

    public String getCcv() {
        return ccv;
    }

    public double getBalance() {
        return balance;
    }


    public abstract void addMoney(double amount) throws NotEnoughFundsException;


    public abstract void takeMoney(double amount) throws NotEnoughFundsException;
}
