package com.siedlecki;

public class Cuboid extends Rectangle {
    private double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = Math.max(height,0);
    }
    public double getVolume(){
        return this.getArea()*this.height;
    }

    public double getHeight() {
        return height;
    }
}
