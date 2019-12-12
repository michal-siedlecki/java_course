package com.siedlecki;

import java.util.ArrayList;

public class Branch {
    private ArrayList<Customer> customers;

    public void addCustomer(Customer newCustomer, double initialTransaction){
        customers.add(newCustomer);
        newCustomer.addTransaction(initialTransaction);
    }

    public void addCustomer(Customer newCustomer){
        customers.add(newCustomer);
    }
}
