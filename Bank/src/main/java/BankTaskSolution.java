import ibank.Account;
import ibank.Bank;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class BankTaskSolution implements Bank {
    private Map<String, Account> accounts= new HashMap<>();

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

        accounts.put(s, new Account() {
        });
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
