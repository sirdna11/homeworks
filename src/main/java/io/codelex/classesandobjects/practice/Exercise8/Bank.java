package io.codelex.classesandobjects.practice.Exercise8;

import io.codelex.classesandobjects.practice.Exercise8.SavingsAccount;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much money is in the account?:");
        double balance = scanner.nextDouble();
        System.out.println("Enter the annual interest rate:");
        double interestRate = scanner.nextDouble();
        SavingsAccount savingsAccount = new SavingsAccount(balance, interestRate);
        System.out.println("How long has the account been opened?");
        int months = scanner.nextInt();

        double totalDeposit = 0;
        double totalWithdraw = 0;
        for (int i = 1; i <= months; i++) {
            System.out.println("Enter amount of deposited money for month:" + i + ":");
            double deposit = scanner.nextDouble();
            totalDeposit += deposit;
            savingsAccount.deposit(deposit);
            System.out.println("Enter amount of withdrawn money for month:" + i + ":");
            double withdrawal = scanner.nextDouble();
            totalWithdraw += withdrawal;
            savingsAccount.withdrawal(withdrawal);
            savingsAccount.monthlyInterest();
        }
        double totalInterest = savingsAccount.totalInterest(months);
        System.out.println("Total deposited: $" + String.format("%.2f", totalDeposit));
        System.out.println("Total withdrawn: $" + String.format("%.2f", totalWithdraw));
        System.out.println("Interest earned: $" + String.format("%.2f", totalInterest));
        System.out.println("Ending balance: $" + String.format("%.2f", savingsAccount.getBalance()));
        //I mean what amazing savings account gives you 40k+ in just 4 months with 5 % annual rate
    }
}
