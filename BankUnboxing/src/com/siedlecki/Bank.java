package com.siedlecki;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches = new ArrayList<Branch>();
    String noBranch = "branch not found";

    public void addNewBranch(String branchName){
        this.branches.add(new Branch(branchName));
    }

    public void addCustomerToBranch(String customerName, String branchName, double initialTransaction){
        Branch existingBranch = findBranch(branchName);
        if (existingBranch!=null){
            existingBranch.addCustomer(customerName, initialTransaction);
        }
    }

    public void addTransactionForCustomer(String customerName, String branchName, double amount){
        Branch branch = findBranch(branchName);
        if (branch != null){
            branch.addTransactionToCustomer(customerName,amount);
        }
        System.out.println(noBranch);
    }

    private Branch findBranch(String branchName){
        for (Branch branch : this.branches) {
            if (branch.getName().equals(branchName)) {
                return branch;
            }
        }
        return null;
    }
    
    public void printCustomersOfBranch(String branchName){
        Branch branch = findBranch(branchName);
        if (branch!=null){
            for (int i=0; i<branch.getCustomers().size(); i++){
                System.out.println(branch.getCustomers().get(i).getName());
            }
        } else {
            System.out.println(noBranch);
        }
    }

    public void printCustomersAndTransactionsOfBranch(String branchName){
        Branch branch = findBranch(branchName);
        if (branch!=null){
            for (int i=0; i<branch.getCustomers().size(); i++){
                Customer customer = branch.getCustomers().get(i);
                System.out.println("transactions of: "+customer.getName());
                for (int j=0; j<customer.getTransactions().size(); j++){
                    System.out.println(customer.getTransactions().get(j));
                }
            }
        } else {
            System.out.println(noBranch);
        }
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }
}
