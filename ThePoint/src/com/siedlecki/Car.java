package com.siedlecki;

public class Car extends Vehicle {
    public int gear;

    public Car(String name, int size) {
        super(name, size);
        this.gear = 0;
    }

    public void changeGear(int gear){
        if (gear<0){
            System.out.println("Cars cant have negative gears");
        }else {
            this.gear = gear;
        }
    }

    public int getGear() {
        return gear;
    }
}
