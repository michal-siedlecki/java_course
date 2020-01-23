package com.siedlecki;

public class Dimmensions {
    private double width;
    private double length;
    private double heigth;

    public Dimmensions(double width, double length, double heigth) {
        this.width = width;
        this.length = length;
        this.heigth = heigth;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getHeigth() {
        return heigth;
    }

    public String describeDimmensions(){
        return  ("width is : " + this.width
                + " length is " + this.length
                + " heigth is " + this.heigth);
    }
}
