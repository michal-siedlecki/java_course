package com.siedlecki;

public class Main {

    public static void main(String[] args) {
//        BankAccount myAccount = new BankAccount();
//        myAccount.setBallance(5000);
//        System.out.println(myAccount.getBallance());
//        myAccount.deposit(567);
//        myAccount.withdraw(6788996);
//        myAccount.setCustomerName("Michal Siedlecki");
//        myAccount.setPhone(51254321);
//        System.out.println(myAccount.getBallance());
//        myAccount.withdraw(1000);
//        myAccount.withdraw(0);
//        myAccount.deposit(-456);
        VipCustomer mrX = new VipCustomer("mrX", 500000);
        System.out.println(mrX.getCreditLimit());
        System.out.println(mrX.getName());
        System.out.println(mrX.getEmailAdress());
        VipCustomer mrY = new VipCustomer();
        System.out.println(mrY.getEmailAdress());
        System.out.println(mrY.getCreditLimit());
    }
}
