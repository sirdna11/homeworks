package io.codelex.test;

class DebitCard extends Card {
    public DebitCard(String number, String owner, String ccv, double balance) {
        super(number, owner, ccv, balance);
    }

    @Override
    public void addMoney(double amount) throws NotEnoughFundsException {
        balance += amount;
        if (balance > 10000) {
            System.out.println("Warning: Too much money");
        }
    }

    @Override
    public void takeMoney(double amount) throws NotEnoughFundsException {
        if (balance - amount < 0) {
            throw new NotEnoughFundsException("Insufficient funds");
        }
        balance -= amount;
    }
}
