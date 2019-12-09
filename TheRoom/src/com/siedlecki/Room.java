package com.siedlecki;

public class Room {
    private Bed bed;
    private Desk desk;

    public Room(Bed bed, Desk desk) {
        this.bed = bed;
        this.desk = desk;
    }

    public void describeRoom(){
        System.out.println("The bed is covered = " + bed.isCovered() + ".");
        System.out.println("The desk has dimmensions " + desk.getDimmensions().describeDimmensions());
        if (desk.getDeskLamp().getBulb().isOn()) {
            System.out.println("The is light in this room.");
        } else {
            System.out.println("There is dark in this room.");
        }

    }

    public void coverBed(){
       if (bed.isCovered()){
           System.out.println("Bed is already covered");
       } else {
           bed.cover();
       }
    }
    public void turnLightOn(){
        desk.getDeskLamp().getLightSwitch().turnOn();
        desk.getDeskLamp().getBulb().setOn();
    }

    public void turnLightOff(){
        desk.getDeskLamp().getLightSwitch().turnOff();
        desk.getDeskLamp().getBulb().setOff();
    }

    public Bed getBed() {
        return bed;
    }
}
