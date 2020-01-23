package com.siedlecki;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAdress;

    public VipCustomer() {
        this("Unknown", 0.00, "default_at_email");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "default_at_email");
    }

    public VipCustomer(String name, double creditLimit, String emailAdress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAdress = emailAdress;
    }

    public String getName() {
        return this.name;
    }

    public double getCreditLimit() {
        return this.creditLimit;
    }

    public String getEmailAdress() {
        return this.emailAdress;
    }
}
