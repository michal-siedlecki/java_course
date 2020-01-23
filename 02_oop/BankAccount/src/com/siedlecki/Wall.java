package com.siedlecki;

public class Wall {
    private double width;
    private double height;

    public Wall() {
        this(0.0,0.0);
    }

    public Wall(double width, double height) {
        if (width>=0.0){
            this.width = width;
        } else {
            this.width = 0.0;
        }
        if (height >= 0.0){
            this.height = height;
        } else {
            this.height = 0.0;
        }
    }

    public void setWidth(double width) {
        if (width>=0.0){
            this.width = width;
        } else {
            this.width = 0.0;
        }
    }

    public void setHeight(double height) {
        if (height >= 0.0){
            this.height = height;
        } else {
            this.height = 0.0;
        }
    }

    public double getArea(){
        return this.height*this.width;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

}
