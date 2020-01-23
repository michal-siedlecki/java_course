package com.siedlecki;


public class Desk {
    private Dimmensions dimmensions;
    private DeskLamp deskLamp;

    public Desk(Dimmensions dimmensions, DeskLamp deskLamp) {
        this.dimmensions = dimmensions;
        this.deskLamp = deskLamp;
    }

    public Dimmensions getDimmensions() {
        return dimmensions;
    }

    public DeskLamp getDeskLamp() {
        return deskLamp;
    }
}
