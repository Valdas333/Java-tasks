import ibank.Account;
import ibank.Bank;

import java.math.BigDecimal;
import java.util.*;

public class BankTaskSolution implements Bank {
    private Map<String, Account> accounts = new HashMap<>();
        private Account account;
    @Override
    public int getNumberOfAccounts() {
        return accounts.size();
    }

    @Override
    public BigDecimal getTotalReserves() {
        BigDecimal sum = accounts.values()
                .stream()
                .map(Account::getBalance)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        return sum;
    }

    @Override
    public Collection<Account> getAllAccounts() {
        ArrayList<Account> openAccounts = new ArrayList<>();
        for (String acc : accounts.keySet()) {
            openAccounts.add(accounts.get(acc));
        }
        return openAccounts;
    }

    @Override
    public Account openDebitAccount(String s) {
        if (!accounts.containsKey(s)) {
            DebitAccount newAccount = new DebitAccount(s);
            accounts.put(s, newAccount);
            return newAccount;
        } else return null;
    }

    @Override
    public Account openCreditAccount(String s, BigDecimal bigDecimal) {
        if (!accounts.containsKey(s)) {
            CreditAccount newCreditAccount = new CreditAccount(s,bigDecimal);
            accounts.put(s, newCreditAccount);
            return newCreditAccount;
        } else return null;
    }

    @Override
    public Account getAccountByHolderName(String s) {
        return accounts.get(s);
    }

    @Override
    public Account getAccountByNumber(String s) {
        for (String acc : accounts.keySet()) {
            if (accounts.get(acc).getNumber().equals(s)) {
                return accounts.get(acc);
            }
        }
        return null;
    }

    @Override
    public void closeAccount(Account account) {
        accounts.remove(account.getHolderName());


//        Iterator<Map.Entry<String, Account>> iterator = accounts.entrySet().iterator();
//        while (iterator.hasNext()) {
//            Map.Entry<String, Account> entry = iterator.next();
//            if (entry.getValue().equals(account)) {
//                iterator.remove();
//                break;  // exit the loop after removing the account
//            }
//        }
    }

}
