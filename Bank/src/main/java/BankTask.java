import ibank.Bank;
import ibank.BaseBankTest;

public class BankTask extends BaseBankTest {
    @Override
    protected Bank createBank() {
        return new BankTaskSolution();
    }
}
