import java.math.BigDecimal;

abstract class Account implements ibank.Account {

    private String holderName;
    private String number;
    private BigDecimal balance;

    private static int accountCounter = 0;

    public Account(){
        accountCounter++;
        this.number = "" + accountCounter;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public String getHolderName() {
        return holderName;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public boolean deposit(BigDecimal bigDecimal) {
        this.balance = this.balance.add(bigDecimal);
        return true;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public boolean withdraw(BigDecimal bigDecimal) {
        if (balance.compareTo(bigDecimal) >= 0) {
            balance = balance.subtract(bigDecimal);
            return true;
        }
        return false;
    }

}
