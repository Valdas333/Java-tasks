package Accounts;

public class SavingsAccount extends Account{
    @Override
    public void withdraw(double amount) {
        // already implemented in Account, to use method in all classes
        super.withdraw(amount);
    }

    @Override
    public String toString() {
        return "Savings account which id is " + getId() + " and balance is " + getBalance();
    }
}
