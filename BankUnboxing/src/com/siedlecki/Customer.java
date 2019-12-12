package com.siedlecki;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions = new ArrayList<Double>();

    public Customer(String name) {
        this.name = name;
    }

    public void addTransaction(double amount){
        transactions.add(Double.valueOf(amount));
    }

    public String getName() {
        return name;
    }
}
