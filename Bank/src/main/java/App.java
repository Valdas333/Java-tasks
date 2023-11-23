import ibank.Bank;

import java.math.BigDecimal;

public class App {

    public static void main(String[] args) {
        BankTaskSolution bankTaskSolution = new BankTaskSolution();
        CreditAccount testCredit = new CreditAccount("Homer",new BigDecimal(1));
        bankTaskSolution.openCreditAccount("Owner", new BigDecimal(10));
        bankTaskSolution.openDebitAccount("Slave");
        System.out.println(bankTaskSolution.getAllAccounts());
        testCredit.setBalance(new BigDecimal(10));
        System.out.println(testCredit.getBalance());
//        System.out.println(bankTaskSolution.getTotalReserves());
    }

}
