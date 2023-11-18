package Accounts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class AccountWithTransactions extends Account{

    private String name;
    private ArrayList<Transactions> transactionLog = new ArrayList<>();

    public AccountWithTransactions(int id, double balance, String name) {
        super(id, balance);
        this.name = name;
    }
    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        transactionLog.add(new Transactions('W',amount, getBalance(),this.name));
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        transactionLog.add(new Transactions('D',amount, getBalance(),this.name));
    }

    @Override
    public String toString() {
        return "AccountWithTransactions" + " account owner: " + name + " interest rate: " + getMonthlyInterestRate() +
                " current balance " + getBalance() + " and transaction log:\n" +
                (transactionLog.stream().map(Transactions::toString).collect(Collectors.joining(
                        " \n")));
    }

    public void printTransactionLog(){
        transactionLog.forEach(System.out::println);
    }

    public void transferMoney(AccountWithTransactions destinationAccount,
                              double amount){
        this.withdraw(amount);
        destinationAccount.deposit(amount);
    }
}
