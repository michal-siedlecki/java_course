package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MobilePhone myPhone = new MobilePhone();
        while (!myPhone.quit){
            myPhone.printMenu();
            myPhone.chooseMenu();
        }
    }
}
