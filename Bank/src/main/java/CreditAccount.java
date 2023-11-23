import ibank.Account;

import java.math.BigDecimal;
import java.util.Objects;
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
        this.balance = new BigDecimal(0);

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
        this.balance = this.balance.add(bigDecimal);
        return true;
    }

    @Override
    public boolean withdraw(BigDecimal amount) {
        BigDecimal availableBalance = this.balance.add(this.creditLimit);

        if (availableBalance.compareTo(amount) >= 0) {
            this.balance = this.balance.subtract(amount);
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "CreditAccount{" +
                "holderName='" + holderName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreditAccount that = (CreditAccount) o;
        return Objects.equals(holderName, that.holderName) &&
                Objects.equals(creditLimit, that.creditLimit) && Objects.equals(number, that.number) &&
                Objects.equals(balance, that.balance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(holderName, creditLimit, number, balance);
    }
}

