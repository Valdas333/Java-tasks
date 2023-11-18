package SimpleAccounts;

public class Account {

    private int number;
    private String owner;
    private double balance;

    public Account(int number, String owner, double balance) {
        this.number = number;
        this.owner = owner;
        this.balance = balance;
    }

    public void addMoney(double balance) {
        this.balance += balance;
    }

    public double getBalance() {
        return balance;
    }

    public int getNumber() {
        return number;
    }

    public String getOwner() {
        return owner;
    }

    public void withdraw(double amount){
        if (amount <= this.balance){
            balance -= amount;
        }
        else {System.out.println("Not enough money in account");}
    }

    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", owner='" + owner + '\'' +
                ", balance=" + balance +
                '}';
    }
}
