package com.siedlecki;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Password myPass = new Password(34);
        myPass.checkPassword(345);
        myPass.checkPassword(-345);
        myPass.checkPassword(9345);
        myPass.checkPassword(4345);
        myPass.checkPassword(34);

    }
}
