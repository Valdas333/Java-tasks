package Accounts;

public class Main {
    public static void main(String[] args) {
//        Account testAcc = new Account(1122,20000);
//        testAcc.setAnnualInterestRate(4.5);
//        testAcc.withdraw(2500);
//        System.out.println(testAcc);
//        testAcc.deposit(3000);
//        System.out.println(testAcc);
//        System.out.println(testAcc);
//        System.out.println(testAcc.getMonthlyInterestRate());
//        CheckingAccount checkingAccount = new CheckingAccount(500.0);
//        checkingAccount.deposit(800);
//        System.out.println(checkingAccount);
//        checkingAccount.withdraw(400);
//        System.out.println(checkingAccount);
//        checkingAccount.withdraw(100);
//        System.out.println(checkingAccount);
//        SavingsAccount savingsAccount = new SavingsAccount();
//        System.out.println(savingsAccount);
//        savingsAccount.setId(1);
//        savingsAccount.deposit(10);
//        savingsAccount.withdraw(20);
//        System.out.println(savingsAccount);

        AccountWithTransactions petro = new AccountWithTransactions(10,100, "Petras");
        AccountWithTransactions jono = new AccountWithTransactions(11,200,"Jonas");
        petro.transferMoney(jono,80);
        System.out.println(petro);
        System.out.println(jono);
//        petro.withdraw(10);
//        System.out.println(petro.getBalance());
//        System.out.println(petro);
//        jono.withdraw(80);
//        jono.deposit(120);
//        System.out.println(jono);
//
//        petro.transferMoney(jono,30);
//        jono.printTransactionLog();


    }
}
