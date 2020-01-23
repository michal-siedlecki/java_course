package com.siedlecki;

// You job is to create a simple banking application.
// There should be a Bank class
// It should have an arraylist of Branches
// Each Branch should have an arraylist of Customers
// The Customer class should have an arraylist of Doubles (transactions)
// Customer:
// Name, and the ArrayList of doubles.
// Branch:
// Need to be able to add a new customer and initial transaction amount.
// Also needs to add additional transactions for that customer/branch
// Bank:
// Add a new branch
// Add a customer to that branch with initial transaction
// Add a transaction for an existing customer for that branch
// Show a list of customers for a particular branch and optionally a list
// of their transactions
// Demonstration autoboxing and unboxing in your code
// Hint: Transactions
// Add data validation.
// e.g. check if exists, or does not exist, etc.
// Think about where you are adding the code to perform certain actions


public class Main {

    public static void main(String[] args) {
	// write your code here
        
        Bank bank = new Bank();
        bank.addNewBranch("morning");
        bank.addNewBranch("evening");

        bank.addCustomerToBranch("tim","morning", 45.76);
        bank.addCustomerToBranch("john","morning", 745.76);
        bank.addCustomerToBranch("bob","evening", 458.76);
        bank.addCustomerToBranch("john","evening", 645.76);

        bank.addTransactionForCustomer("bob", "morning", 45.90);
        bank.addTransactionForCustomer("john", "morning", 45.90);
        System.out.println("morning customers: ");
        bank.printCustomersOfBranch("morning");
        System.out.println("evening customers: ");
        bank.printCustomersOfBranch("evening");

        System.out.println("morning transactions with customers: ");
        bank.printCustomersAndTransactionsOfBranch("morning");
    }
}
