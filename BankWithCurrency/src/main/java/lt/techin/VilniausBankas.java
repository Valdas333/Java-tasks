package lt.techin;

import lt.itakademija.exam.*;
import lt.itakademija.exam.Account;
import java.util.HashMap;
import java.util.Map;

public class VilniausBankas implements Bank {

    Map<Long, Customer> customerDB = new HashMap<>();
    long uniqueSequence;
    long accountUniqueSequence;
    long transferUniqueSequence;
    SequenceGenerator sequenceGeneratorForCustomer;
    SequenceGenerator sequenceGeneratorForAccount;
    SequenceGenerator sequenceGeneratorForTransfer;
    CurrencyConverter vilniausBankasCurrencyConverter;

    public VilniausBankas(CurrencyConverter currencyConverter) {
        this.vilniausBankasCurrencyConverter = currencyConverter;
        this.sequenceGeneratorForCustomer = new SequenceGenerator();
        this.sequenceGeneratorForAccount = new SequenceGenerator();
        this.sequenceGeneratorForTransfer = new SequenceGenerator();
    }

    @Override
    public Customer createCustomer(PersonCode personCode, PersonName personName) {
        if (personCode == null || personName == null) {
            throw new NullPointerException("Customer or currency input is wrong");
        }
        if (customerDB.values().stream()
                .anyMatch(customer -> customer.getPersonCode().equals(personCode))) {
            throw new CustomerCreateException("Person code already exists");
        }
        this.uniqueSequence = sequenceGeneratorForCustomer.getNext();
        Customer newCustomer = new Customer(uniqueSequence, personCode, personName);
        customerDB.put(uniqueSequence, newCustomer);
        return newCustomer;

    }

    @Override
    public Account createAccount(Customer customer, Currency currency) {
        accountUniqueSequence = sequenceGeneratorForAccount.getNext();
        if (currency == null || customer == null) {
            throw new NullPointerException("Null values!!!");
        }
        if (!customerDB.containsKey(customer.getId())) {
            throw new AccountCreateException("Customer is not this bank client");
        }
        Customer toAdd = customerDB.get(customer.getId());
        Account account = new Account(accountUniqueSequence, customer, currency, new Money(0));
        toAdd.addAccount(account);
        return account;
    }

    @Override
    public Operation transferMoney(Account accountFrom, Account accountTo, Money amount) {
        if (accountFrom == null || accountTo == null || amount == null) {
            throw new CurrencyConversionException(" ");
        }
        if (accountFrom.getBalance().substract(amount).isLessThan(new Money(0))) {
            throw new InsufficientFundsException("Not enough funds in account!");
        }
        transferUniqueSequence = sequenceGeneratorForTransfer.getNext();
        Money convertedMoney = vilniausBankasCurrencyConverter.convert(accountFrom.getCurrency(),
                accountTo.getCurrency(), amount);
        accountFrom.setBalance(accountFrom.getBalance().substract(amount));
        accountTo.setBalance(accountTo.getBalance().add(convertedMoney));
        Operation operation = new Operation(transferUniqueSequence, accountFrom, accountTo, amount);
        return operation;

    }


    @Override
    public Money getBalance(Currency targetCurrency) {
        return customerDB.values().stream()
                .flatMap(customer -> customer.getAccounts().stream())
                .map(account -> vilniausBankasCurrencyConverter.convert(account.getCurrency(), targetCurrency, account.getBalance()))
                .reduce(new Money(0), Money::add);
    }
}
