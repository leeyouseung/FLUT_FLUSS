package com.example.flut_fluss.model.money;

public class Money {

    private Account account;

    private Bank bank;

    public Money(Account account, Bank bank) {

        this.account = account;
        this.bank = bank;
    }

    public Account getAccount() {

        return account;
    }

    public void setAccount(Account account) {

        this.account = account;
    }

    public Bank getBank() {

        return bank;
    }

    public void setBank(Bank bank) {

        this.bank = bank;
    }
}
