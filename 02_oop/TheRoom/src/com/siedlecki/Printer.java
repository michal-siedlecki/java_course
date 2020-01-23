package com.siedlecki;

public class Printer {
    private int tonerLevel = 200;
    private int printedPagesNum;
    private boolean isDuplex;

    public Printer(int tonerLevel, int printedPagesNum, boolean isDuplex) {
        this.tonerLevel = tonerLevel;
        this.printedPagesNum = printedPagesNum;
        this.isDuplex = isDuplex;
    }


    public void getPrintedPagesNum() {
        System.out.println("printed pages number: " + this.printedPagesNum);
    }

    public void fillUpToner(int amount){
        if (this.tonerLevel+amount>200){
            this.tonerLevel = 200;
        } else {
            this.tonerLevel += Math.max(amount,0);
        }

    }
    public void getTonerLevelPercent(){
        double percent = (double) this.tonerLevel /200 *100;
        System.out.println("this toner level is at " + percent + "%");
    }
    public void print(int pagesToPrint){
        int pagesPrinted=0;
        for (int i=0; i<=pagesToPrint; i++){
            if (this.tonerLevel>0){
                tonerLevel --;
                pagesPrinted ++;
            } else {
                System.out.println("No ink, please refill the toner");
                break;
            }
        }
        if (this.isDuplex){
            this.printedPagesNum += Math.ceil((double)pagesPrinted/2);
        } else {
            this.printedPagesNum += pagesPrinted;
        }
    }
}
