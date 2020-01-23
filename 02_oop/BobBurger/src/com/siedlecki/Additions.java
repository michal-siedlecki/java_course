package com.siedlecki;

public class Additions {

    private String firstAd;
    private String secondAd;
    private String thirdAd;
    private String fourthAd;
    private String firstHealthyAd;
    private String secondHealthyAd;
    private boolean hasDrinkAndChips;
    private Menu menu = new Menu();

    public Additions(String firstAd) {
        this.firstAd = firstAd;
    }

    public Additions(String firstAd, String secondAd) {
        this.firstAd = firstAd;
        this.secondAd = secondAd;
    }

    public Additions(String firstAd, String secondAd, String thirdAd) {
        this.firstAd = firstAd;
        this.secondAd = secondAd;
        this.thirdAd = thirdAd;
    }

    public Additions(String firstAd, String secondAd, String thirdAd, String fourthAd) {
        this.firstAd = firstAd;
        this.secondAd = secondAd;
        this.thirdAd = thirdAd;
        this.fourthAd = fourthAd;
    }
    
    public void setFirstHealthyAd(String ad){
        this.firstHealthyAd = ad;        
    }
    public void setSecondHealthyAd(String ad){
        this.secondHealthyAd = ad;
    }


    public String getAdditionsPrices(){
        String prices = "";
        if(this.getFirstAd() != null){
            prices += this.getFirstAd() + " --> " + this.menu.getPrice(this.getFirstAd()) + "\n";
        }
        if(this.getSecondAd() != null){
            prices += this.getSecondAd() + " --> " + this.menu.getPrice(this.getSecondAd()) + "\n";
        }
        if(this.getThirdAd() != null){
            prices += this.getThirdAd() + " --> " + this.menu.getPrice(this.getThirdAd()) + "\n";
        }
        if(this.getFourthAd() != null){
            prices += this.getFourthAd() + " --> " + this.menu.getPrice(this.getFourthAd()) + "\n";
        }
        if(this.getFirstHealthyAd() != null){
            prices += this.getFirstHealthyAd() + " --> " + this.menu.getPrice(this.getFirstHealthyAd()) + "\n";
        }
        if(this.getSecondHealthyAd() != null){
            prices += this.getSecondHealthyAd() + " --> " + this.menu.getPrice(this.getSecondHealthyAd()) + "\n";
        }
        if(this.isHasDrinkAndChips()){
            prices += "drink and chips --> " + this.menu.getPrice("drink and chips") + "\n";
        }
            return prices;
    }
    
    public double getAdditionsTotalPrice(){
        double sum = 0;
        if(this.getFirstAd() != null){
            sum += this.menu.getPrice(this.getFirstAd());
        }
        if(this.getSecondAd() != null){
            sum += this.menu.getPrice(this.getSecondAd());
        }
        if(this.getThirdAd() != null){
            sum += this.menu.getPrice(this.getThirdAd());
        }
        if(this.getFourthAd() != null){
            sum += this.menu.getPrice(this.getFourthAd());
        }
        if (this.getFirstHealthyAd() != null) {
            sum += this.menu.getPrice(this.getFirstHealthyAd());
        }
        if (this.getSecondHealthyAd() != null) {
            sum += this.menu.getPrice(this.getSecondHealthyAd());
        }
        if (this.hasDrinkAndChips){
            sum += this.menu.getPrice("drink and chips");
        }

        return sum;
    }

    public void setHasDrinkAndChips(boolean hasDrinkAndChips) {
        this.hasDrinkAndChips = hasDrinkAndChips;
    }

    private String getFirstAd() {
        return firstAd;
    }

    private String getSecondAd() {
        return secondAd;
    }

    private String getThirdAd() {
        return thirdAd;
    }

    private String getFourthAd() {
        return fourthAd;
    }

    public String getFirstHealthyAd() {
        return firstHealthyAd;
    }

    public String getSecondHealthyAd() {
        return secondHealthyAd;
    }

    public boolean isHasDrinkAndChips() {
        return hasDrinkAndChips;
    }
}
