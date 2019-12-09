package com.siedlecki;

import java.util.ArrayList;

public class Branch {
    private ArrayList<Customer> customers = new ArrayList<Customer>();

    public Branch(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void makeTransaction(Customer customer, double amount){
        customer.addTransaction(amount);
        this.addCustomer(customer);
    }

    public void addCustomer(Customer newCustomer){
        if (this.getCustomerIndex(newCustomer)==-1){
        this.customers.add(newCustomer);
        }
    }

    private int getCustomerIndex(Customer newCustomer) {
        if (customers.size()>0){
            for (int i=0; i<this.customers.size(); i++){
                if (newCustomer.getName().equals(customers.get(i).getName())){
                    return i;
                }
            }

        }
        return -1;
    }
}
