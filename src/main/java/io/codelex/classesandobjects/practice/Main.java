package io.codelex.classesandobjects.practice;


public class Main {
    public static void main(String[] args) {

        Account mattsAccount = new Account("Matt's account", 1000.0);
        Account myAccount = new Account("My account", 0.0);
        Account accountA = new Account("Account A", 100.0);
        Account accountB = new Account("Account B", 0.0);
        Account accountC = new Account("Account C", 0.0);


        Account firstAccount = new Account("First account", 100.0);
        firstAccount.deposit(20.0);
        System.out.println(firstAccount);


        mattsAccount.withdrawal(100.0);
        myAccount.deposit(100.0);

        System.out.println(mattsAccount);
        System.out.println(myAccount);


        transfer(accountA, accountB, 50.0);
        transfer(accountB, accountC, 25.0);

        System.out.println(accountA);
        System.out.println(accountB);
        System.out.println(accountC);
    }

    public static void transfer(Account from, Account to, double howMuch) {
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }
}
