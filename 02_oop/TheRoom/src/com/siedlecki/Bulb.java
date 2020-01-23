package com.siedlecki;

public class Bulb {
    private boolean isOn;

    public Bulb(boolean isOn) {
        this.isOn = isOn;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn() {
        isOn = true;
    }
    public void setOff() {
        isOn = false;
    }
}
