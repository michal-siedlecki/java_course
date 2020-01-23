package com.siedlecki;

public class Main {

    public static void main(String[] args) {

        double myA = 20d;
        double myB = 80d;
        double result = (myA + myB) * 100;
        double reminder = result % 40.00;
        boolean isZeroReminder = (reminder==0) ? true : false;
        System.out.println("isZeroReminder value: "+isZeroReminder);
        if (!isZeroReminder){
            System.out.println("Got some reminder");
        }

    }
}
