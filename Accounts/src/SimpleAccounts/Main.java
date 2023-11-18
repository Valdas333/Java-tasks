package SimpleAccounts;

public class Main {
    public static void main(String[] args) {
        Account testAcc = new Account(100, "Foo",518);
        System.out.println(testAcc.getBalance());
        System.out.println(testAcc.getNumber());
        System.out.println(testAcc.getOwner());
        testAcc.withdraw(510);
        System.out.println(testAcc.getBalance());
        testAcc.withdraw(10);
        System.out.println(testAcc.getBalance());
        testAcc.withdraw(8);
        System.out.println(testAcc.getBalance());
        testAcc.addMoney(100);
        System.out.println(testAcc.getBalance());

        CreditAccount testCredit = new CreditAccount(100,"Bar", 80,50);
        System.out.println(testCredit.getBalance());
        testCredit.withdraw(129);
        System.out.println(testCredit);
        testCredit.withdraw(1);
        System.out.println(testCredit);
        testCredit.addMoney(80);
        System.out.println(testCredit);
        testCredit.withdraw(71);
        System.out.println(testCredit);

        Bank testBank = new Bank();
        testBank.addAccount(testAcc);
        testBank.addAccount(testCredit);
        testBank.getAccounts();
        testBank.getAccountsWithCredit();


    }
}