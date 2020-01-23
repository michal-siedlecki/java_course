package com.siedlecki;

public class Ford extends Car {

    private int maxSpeed = 240;
    private int maxGear = 5;

    public Ford() {
        super("Ford", 260);
    }

    @Override
    public void increaseSpeed(int speed) {
        if (this.speed+speed>maxSpeed){
            this.speed = maxSpeed;
        } else {
            super.increaseSpeed(speed);
        }
    }

    @Override
    public void changeGear(int gear) {
        if (gear>maxGear){
            System.out.println("this gear is out of range in Ford");
        } else {
            super.changeGear(gear);
        }
    }
}
