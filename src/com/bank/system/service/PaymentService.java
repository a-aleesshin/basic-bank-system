package com.bank.system.service;

import com.bank.system.entity.Account;
import com.bank.system.entity.Bill;

public class PaymentService {
    public void pay(Account account, int amount) {
        Bill bill = account.getBill();

        if (bill.getAmount() < amount) {
            System.out.println("Ошибка! Недостаточно средств на аккаунте.");
        } else {
            System.out.println("Происходит платеж, текущее значение счета: " + bill.getAmount());
            bill.setAmount(bill.getAmount() - amount);
            System.out.println("Платеж завершен, новое значение счета: " + bill.getAmount());
        }
    }
}
