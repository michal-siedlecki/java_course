package com.siedlecki;

public class Main {

    public static void main(String[] args) {

        byte myNewByte = 34;
        short myNewShort = 24560;
        int myNewInt = 2_634_546;
        long myNewLong = 50000L+10L*(myNewByte+myNewInt+myNewShort);
        System.out.println(myNewLong);
    }
}
