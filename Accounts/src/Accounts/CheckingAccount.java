package Accounts;

public class CheckingAccount extends Account{

    private double overdraftLimit = 0;

    public CheckingAccount(Double limit){
        this.overdraftLimit = limit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= overdraftLimit) {
            super.withdraw(amount);
            this.overdraftLimit -= amount;
        }
        else {System.out.println("Overdraft limit reached!");}
    }

    @Override
    public String toString() {
        return "CheckingAccount funds= " + super.getBalance() +
                ", overdraftLimit= " + overdraftLimit +
                '}';
    }
}
