package Accounts;

import java.time.LocalDate;

public class Account {

    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private LocalDate dateCreated;

    public Account() {
        this.dateCreated = LocalDate.now();
    }

    public Account(int id, double balance) {
        this.dateCreated = LocalDate.now();
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterestRate(){
        return (annualInterestRate / 100) / 12;
    }

    public double getMonthlyInterest(){
        return  (balance * getMonthlyInterestRate());
    }

    public void withdraw(double amount){
        if (amount <= this.balance){
            balance -= amount;
        }
        else {System.out.println("Not enough money in account");}
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public String toString(){
        return "Account balance is: " + getBalance() + ", monthly interest: "+ getMonthlyInterest() +
                " and created at: " +getDateCreated();
    }
}
