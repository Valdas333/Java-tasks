import ibank.Account;

import java.math.BigDecimal;
import java.util.Random;

public class CreditAccount implements Account {

    private String holderName;
    private BigDecimal creditLimit;
    private String number;

    private BigDecimal balance;
    public CreditAccount(String holderName, BigDecimal creditLimit) {
        this.holderName = holderName;
        this.creditLimit = creditLimit;
        Random rand = new Random();
        this.number = "C" + rand.nextInt(100);

    }

    @Override
    public String getNumber() {
        return number;
    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    @Override
    public String getHolderName() {
        return holderName;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Override
    public BigDecimal getBalance() {
        return balance;
    }

    @Override
    public boolean deposit(BigDecimal bigDecimal) {
        return false;
    }

    @Override
    public boolean withdraw(BigDecimal bigDecimal) {
        return false;
    }
}
