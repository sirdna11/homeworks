package io.codelex.test;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard("123456789", "andruha bobs", "123", 500);
        DebitCard debitCard = new DebitCard("987654321", "sily goose", "456", 2000);

        try {
            creditCard.addMoney(6000);
            debitCard.addMoney(9000);

            creditCard.takeMoney(700);
            debitCard.takeMoney(1500);

            System.out.println("Credit Card Balance: " + creditCard.getBalance());
            System.out.println("Debit Card Balance: " + debitCard.getBalance());
        } catch (NotEnoughFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}