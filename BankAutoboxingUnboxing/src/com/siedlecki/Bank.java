package com.siedlecki;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches = new ArrayList<Branch>();

    public void addBranch(Branch newBranch){
        if (branches.contains(newBranch)){
            System.out.println("the branch is already created");
        } else {
        this.branches.add(newBranch);
        }
    }

    public void printCustomersNames(Branch branch){
        if (this.branches.size()>0){
            for (int i=0;i<branch.getCustomers().size(); i++){
                System.out.println(i+". "+branch.getCustomers().get(i).getName());
            }
        }
    }

    public void printCustomersTransactions(Branch branch){
        if (this.branches.size()>0){
            for (int i=0;i<branch.getCustomers().size(); i++){
                Customer customer = branch.getCustomers().get(i);
                System.out.println(i + ". " + customer.getName() + " transactions: ");
                for (int j=0; j<customer.getTransactions().size();j++){
                    System.out.println(customer.getTransactions().get(j));
                }
            }
        }
    }




}
