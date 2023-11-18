package SimpleAccounts;

import java.util.ArrayList;

public class Bank {

    String accountType;
    private ArrayList<Account> accounts= new ArrayList<>();

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void getAccounts() {
        for (Account account: accounts) {
            System.out.println(account);
        }
    }

    public void getAccountsWithCredit(){
        for (Account account: accounts) {
            if (account instanceof CreditAccount) {
                System.out.println("Credit account: \n" + account.getOwner());
            }
        }
    }






}
