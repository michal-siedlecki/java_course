package com.siedlecki;

public class Main {
    public static void main(String[] args) {

        Burger burgerClassic = new Burger("white bread", "beef 100%");
        burgerClassic.setAdditions("onion", "beacon");

        System.out.println(burgerClassic.getDetailedPrices());
        System.out.println(burgerClassic.getTotalPrice());
        System.out.println();

        BurgerHealthy burgerHealthy = new BurgerHealthy("beef 100%");
        burgerHealthy.setAdditions("onion", "beacon","onion", "beacon","mango");

        System.out.println(burgerHealthy.getDetailedPrices());
        System.out.println(burgerHealthy.getTotalPrice());
        System.out.println();

        Burger burgerDeluxe = new BurgerDeluxe("white bread", "beef 100%");
        burgerDeluxe.setAdditions("onion", "beacon");

        System.out.println(burgerDeluxe.getDetailedPrices());
        System.out.println(burgerDeluxe.getTotalPrice());


    }
}
