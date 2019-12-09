package com.siedlecki;

public class BankAccount {
    
    private long accountNumber;
    private double ballance;
    private String customerName;
    private String email;
    private int phone;

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBallance() {
        return ballance;
    }

    public void setBallance(double ballance) {
        this.ballance = ballance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void deposit(double amount){
        if (amount>0){
            this.ballance += amount;
        } else {
            System.out.println("amount is less than 0");
        }
    }

    public void withdraw (double amount){
        if (amount>this.ballance){
            System.out.println("amount is greater than ballance");
        } else if (amount<=0){
            System.out.println("amount to withdraw is less than 0");
        } else {
            this.ballance -= amount;
        }
    }


}
