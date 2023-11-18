package SimpleAccounts;

public class CreditAccount extends Account{

    private double creditLimit;

    public CreditAccount(int number, String owner, double balance, double creditLimit) {
        super(number, owner, balance);
        this.creditLimit = creditLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount){
            super.withdraw(amount);
        } else if ((getBalance() + this.creditLimit) >= amount) {
            super.addMoney(creditLimit);
            creditLimit = 0;
            super.withdraw(amount);
            System.out.println("Started using credit");
        }
        else {
            System.out.println("Not enough funds, current account status: \n" + this);
        }
    }

    @Override
    public String toString() {
        return "Account: " + getBalance() +
                "\nCredit Limit: " + creditLimit + "\nOwner name: " + getOwner();
    }
}
