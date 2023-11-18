package Accounts;
import java.time.LocalDate;

public class Transactions {

    private LocalDate transactionDate;
    private char type;
    private double amount;
    private double balance;
    private String description;

    public Transactions(char type, double amount, double balance, String description) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
        this.transactionDate = LocalDate.now();
    }

    @Override
    public String toString() {
        return  "transactionDate=" + transactionDate +
                ", type=" + type +
                ", amount=" + amount +
                ", balance=" + balance +
                ", description='" + description + '\'' +
                '}';
    }
}
