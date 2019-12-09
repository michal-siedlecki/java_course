package com.siedlecki;

public class BurgerDeluxe extends Burger{

    public BurgerDeluxe(String bread, String meat) {
        super(bread, meat);
    }

    @Override
    public void setAdditions(String firstAd) {
        super.setAdditions(firstAd);
        this.additions.setHasDrinkAndChips(true);
    }

    @Override
    public void setAdditions(String firstAd, String secondAd) {
        super.setAdditions(firstAd, secondAd);
        this.additions.setHasDrinkAndChips(true);
    }

    @Override
    public void setAdditions(String firstAd, String secondAd, String thirdAd) {
        super.setAdditions(firstAd, secondAd, thirdAd);
        this.additions.setHasDrinkAndChips(true);
    }

    @Override
    public void setAdditions(String firstAd, String secondAd, String thirdAd, String fourthAd) {
        super.setAdditions(firstAd, secondAd, thirdAd, fourthAd);
        this.additions.setHasDrinkAndChips(true);
    }
}
