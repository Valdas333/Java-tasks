import ibank.Account;
import ibank.Bank;

import java.math.BigDecimal;

public class App {

    public static void main(String[] args) {
        BankTaskSolution seb = new BankTaskSolution();
        Account account = seb.openCreditAccount("Morka",new BigDecimal(100));
        System.out.println(account.getBalance());
        account.deposit(new BigDecimal(1000));
        System.out.println(seb.getAllAccounts());
        System.out.println(seb.getTotalReserves());
        Account account1 = seb.openDebitAccount("Burokas");
        account1.deposit(BigDecimal.valueOf(20));
        System.out.println(seb.getAllAccounts());
        System.out.println(seb.getTotalReserves());
        account.withdraw(BigDecimal.valueOf(1050));
        System.out.println(seb.getAllAccounts());
        System.out.println(seb.getTotalReserves());
        System.out.println(account.getBalance());

    }

}
