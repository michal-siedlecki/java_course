package com.siedlecki;

public class Burger {
    private String bread;
    private String meat;
    public Additions additions;
    private Menu menu = new Menu();


    public Burger(String bread, String meat) {
        this.bread = bread;
        this.meat = meat;
    }

    public void setAdditions(String firstAd){
        this.additions = new Additions(firstAd);
    }
    public void setAdditions(String firstAd, String secondAd){
        this.additions = new Additions(firstAd, secondAd);
    }
    public void setAdditions(String firstAd, String secondAd, String thirdAd){
        this.additions = new Additions(firstAd, secondAd, thirdAd);
    }
    public void setAdditions(String firstAd, String secondAd, String thirdAd, String fourthAd){
        this.additions = new Additions(firstAd, secondAd, thirdAd, fourthAd);
    }

    public String getDetailedPrices(){
        String prices = this.getBread() + " --> " + this.menu.getPrice(this.getBread()) + "\n";
        prices += this.getMeat() + " --> " + this.menu.getPrice(this.getMeat()) + "\n";
        prices += this.additions.getAdditionsPrices();

        return prices;
    }

    public double getTotalPrice(){
        double sum = this.menu.getPrice(this.getBread()) + this.menu.getPrice(this.getMeat());
        sum += this.additions.getAdditionsTotalPrice();
        return sum;
    }

    private String getBread() {
        return bread;
    }

    private String getMeat() {
        return meat;
    }
}
