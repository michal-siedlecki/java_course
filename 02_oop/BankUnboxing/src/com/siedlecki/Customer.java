package com.siedlecki;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions = new ArrayList<Double>();

    public Customer(String name, double initialTransaction) {
        this.name = name;
        this.addTransaction(initialTransaction);
    }

    public void addTransaction(double amount){
        transactions.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
