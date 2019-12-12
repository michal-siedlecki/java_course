package com.siedlecki;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches = new ArrayList<Branch>();

    public void addBranch(){
        Branch branch = new Branch();
        branches.add(branch);
    }

    public void addBranch(Customer customer){
        Branch branch = new Branch();
        branches.add(branch);
        branch.addCustomer(customer);
    }

    public void addTransactionCustomer(double amount, Customer customer, Branch branch){
        customer.addTransaction(amount);
        branch.addCustomer(customer);
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public String getCustomersInBranch(Branch branch){
        String list;
        for (int i=0; i<branches.size();i++){
            list += "branch"
        }
        return list;
    }
}
