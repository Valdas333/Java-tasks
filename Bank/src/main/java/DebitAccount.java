import java.math.BigDecimal;

public class DebitAccount extends Account{
    public DebitAccount(String name) {
        this.setHolderName(name);
        setNumber("D" + super.getNumber());
        setBalance(BigDecimal.valueOf(0));
    }

    @Override
    public String toString() {
        return "DebitAccount," +
                "holderName=" + getHolderName() + " account number=" +getNumber();
    }



}

