import ibank.Account;
import ibank.Bank;

import java.math.BigDecimal;
import java.util.Random;

public class DebitAccount implements Account {

    private String number;
    private String holder;
    private BigDecimal balance;

    public DebitAccount(String holder){
        Random rand = new Random();
        this.holder = holder;
        this.number = "D" + rand.nextInt(100);
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
        return false;
    }

    @Override
    public boolean withdraw(BigDecimal bigDecimal) {
        return false;
    }
}
