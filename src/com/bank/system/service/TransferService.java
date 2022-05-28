package com.bank.system.service;

import com.bank.system.entity.Account;

public class TransferService {
    public void transfer(Account accountFrom, Account accountTo, int amount) {
        int billFromAmount = accountFrom.getBill().getAmount();
        int billToAmount = accountTo.getBill().getAmount();

        if (billFromAmount < amount) {
            System.out.println("Ошибка! Недостаточно средств на аккаунте.");
        } else {
            System.out.println("Происходит перевод средств с аккаунта:" + accountFrom.getAccountHolder().getName() + " на аккаунт: " + accountTo.getAccountHolder().getName() + " сумма перевода: " + amount);
            accountFrom.getBill().setAmount(billFromAmount - amount);
            accountTo.getBill().setAmount(billToAmount + amount);
            System.out.println("Перевод выполнен успешно, текущий счет: " + accountFrom.getAccountHolder().getName() + " - " + accountFrom.getBill().getAmount());
            System.out.println("Перевод выполнен успешно, текущий счет: " + accountTo.getAccountHolder().getName() + " - " + accountTo.getBill().getAmount());
        }
    }
}
