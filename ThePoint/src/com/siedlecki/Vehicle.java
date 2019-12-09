package com.siedlecki;

public class Vehicle {
    private String name;
    private int size;
    public int speed;


    public Vehicle(String name, int size) {
        this.name = name;
        this.size = size;
        this.speed = 0;
    }

    public void increaseSpeed(int speed){
        this.speed += speed;
    }
    public void decreaseSpeed(int speed){
        if (this.speed - speed < 0) {
            this.speed = 0;
        } else {
            this.speed -= speed;
        }
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getSpeed() {
        return speed;
    }
}
