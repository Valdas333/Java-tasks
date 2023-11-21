import java.math.BigDecimal;

public class Account implements ibank.Account {
    @Override
    public String getNumber() {
        return null;
    }

    @Override
    public String getHolderName() {
        return null;
    }

    @Override
    public BigDecimal getBalance() {
        return null;
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
