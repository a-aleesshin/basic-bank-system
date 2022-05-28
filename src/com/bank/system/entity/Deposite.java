package com.bank.system.entity;

public class Deposite {
    private Bill bill;

    public Deposite(Bill bill) {
        this.bill = bill;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
}
