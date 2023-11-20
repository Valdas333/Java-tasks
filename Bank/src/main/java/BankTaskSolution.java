import ibank.Account;
import ibank.Bank;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;

public class BankTaskSolution implements Bank {
    ArrayList<Account> accounts= new ArrayList<>();
    @Override
    public int getNumberOfAccounts() {
        return accounts.size();
    }

    @Override
    public BigDecimal getTotalReserves() {
        return null;
    }

    @Override
    public Collection<Account> getAllAccounts() {
        return null;
    }

    @Override
    public Account openDebitAccount(String s) {
        return null;
    }

    @Override
    public Account openCreditAccount(String s, BigDecimal bigDecimal) {
        return null;
    }

    @Override
    public Account getAccountByHolderName(String s) {
        return null;
    }

    @Override
    public Account getAccountByNumber(String s) {
        return null;
    }

    @Override
    public void closeAccount(Account account) {

    }
}
