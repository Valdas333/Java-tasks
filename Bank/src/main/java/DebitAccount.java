import ibank.Account;
import ibank.Bank;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.Random;

public class DebitAccount implements Account {

    private String number;
    private String holder;
    private BigDecimal balance;

    public DebitAccount(String holder){
        Random rand = new Random();
        this.holder = holder;
        this.number = "D" + rand.nextInt(100);
        this.balance = new BigDecimal(0);
    }

    @Override
    public String getNumber() {
        return this.number;
    }
    @Override
    public String getHolderName() {
        return this.holder;
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
        if (balance.compareTo(amount) >= 0) {
            balance = balance.subtract(amount);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "DebitAccount{" +
                "holder='" + holder + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DebitAccount that = (DebitAccount) o;
        return Objects.equals(number, that.number) && Objects.equals(holder, that.holder) &&
                Objects.equals(balance, that.balance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, holder, balance);
    }
}
