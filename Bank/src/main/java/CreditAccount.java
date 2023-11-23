import java.math.BigDecimal;


public class CreditAccount extends Account {

    private BigDecimal creditLimit;
    private boolean creditIsTaken;

    public CreditAccount(String holderName, BigDecimal creditLimit) {
        setHolderName(holderName);
        this.creditLimit = creditLimit;
        setNumber("C" + super.getNumber());
        setBalance(BigDecimal.valueOf(0));
        this.creditIsTaken = false;
    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    @Override
    public boolean withdraw(BigDecimal amount) {
        BigDecimal availableBalance = getBalance().add(this.creditLimit);
        if (availableBalance.compareTo(amount) >= 0) {
            if (getBalance().subtract(amount).compareTo(BigDecimal.valueOf(0)) > 0){
                this.creditIsTaken = true;
            }
            setBalance(getBalance().subtract(amount));
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "CreditAccount," +
                "holderName=" + getHolderName() + " account number=" +getNumber();
    }

    @Override
    public BigDecimal getBalance() {
        if (creditIsTaken){
            return super.getBalance().negate();
        }
        return super.getBalance();
    }
}



