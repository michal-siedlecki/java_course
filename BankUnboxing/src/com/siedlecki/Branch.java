package com.siedlecki;

import java.util.ArrayList;

public class Branch {
    private ArrayList<Customer> customers;
    private String name;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>(); 
    }

    public void addCustomer(String customerName, double initialTransaction){
        if (findCustomer(customerName)==null){
            this.customers.add(new Customer(customerName,initialTransaction));
        } else {
            System.out.println("Customer with this name has been already in this branch");
        }
    }

    public void addTransactionToCustomer(String customerName, double amount){
        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer!=null){
            existingCustomer.addTransaction(amount);
        } else {
            System.out.println("There is no customer with that name in this branch.");
        }
    }
    
    private Customer findCustomer(String customerName){
        for (Customer customer : this.customers) {
            if (customer.getName().equals(customerName)) {
                return customer;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
