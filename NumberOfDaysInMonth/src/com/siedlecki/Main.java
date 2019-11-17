package com.siedlecki;

public class Main {

    public static void main(String[] args) {
        for (int i=8; i>=2; i--){
            System.out.println(String.format("%.2f",calculateInterestRate(10000,(double) (i))));
        }

    }
    public static double calculateInterestRate(double amount, double interestRate){
        return (amount*(interestRate/100));
    }
}
