package com.siedlecki;


public class BurgerHealthy  extends Burger{

    public BurgerHealthy(String meat) {
        super("brown bread", meat);
    }

    public void setAdditions(String firstAd, String secondAd, String thirdAd, String fourthAd,
                             String firstHealthyAd){
        this.additions = new Additions(firstAd, secondAd, thirdAd, fourthAd);
        this.additions.setFirstHealthyAd(firstHealthyAd);
    }

    public void setAdditions(String firstAd, String secondAd, String thirdAd, String fourthAd,
                             String firstHealthyAd, String secondHealthyAd){
        this.additions = new Additions(firstAd, secondAd, thirdAd, fourthAd);
        this.additions.setFirstHealthyAd(secondHealthyAd);
    }
}
