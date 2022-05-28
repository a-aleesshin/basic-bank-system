package com.bank.system.service;

import com.bank.system.entity.Account;
import com.bank.system.entity.Bill;

public class DepositService {
    public void deposit(Account account, int amount) {
        Bill bill = account.getBill();
        System.out.println("Операция пополнения счета, текущее значение счета: " + bill.getAmount());
        bill.setAmount(bill.getAmount() + amount);
        System.out.println("Операция пополнения счета прошла успешно, новое значение счета: " + bill.getAmount());
    }
}
