package com.bank.system;

import com.bank.system.entity.Account;
import com.bank.system.entity.Bill;
import com.bank.system.entity.Person;
import com.bank.system.service.DepositService;
import com.bank.system.service.PaymentService;
import com.bank.system.service.TransferService;

public class Main {
    public static void main(String[] args) {
        Person firstAccountPerson = new Person("Anton", "Aleshin", "8 (916) 234-34-32");
        Bill firstAccountBill = new Bill(10000);
        Account firstAccount = new Account(firstAccountPerson, firstAccountBill);

        Person secondAccountPerson = new Person("Karina", "Aleshina", "8 (916) 274-34-32");
        Bill secondAccountBill = new Bill(8000);
        Account secondAccount = new Account(secondAccountPerson, secondAccountBill);

        PaymentService paymentService = new PaymentService();
        paymentService.pay(firstAccount, 5000);
        paymentService.pay(secondAccount, 4000);

        DepositService depositService = new DepositService();
        depositService.deposit(firstAccount, 5000);
        depositService.deposit(secondAccount, 1000);

        TransferService transferService = new TransferService();
        transferService.transfer(firstAccount, secondAccount, 3500);
    }
}
